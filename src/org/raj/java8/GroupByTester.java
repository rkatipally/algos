package org.raj.java8;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class GroupByTester {

	public static void main(String[] args){
		GroupByTester groupByTester = new GroupByTester();
		groupByTester.testGroupBy();

	}

	public void testGroupBy(){
		List<Criteria> criteria = new ArrayList<>();
		criteria.add(new Criteria("OW", "", "A,B,C,D", ""));
		criteria.add(new Criteria("RT", "", "A,B,C,D", ""));
		criteria.add(new Criteria("OW", "", "A,B,C", ""));
		criteria.add(new Criteria("OW", "FC1", "A,B,C", "FN2"));
		criteria.add(new Criteria("OW", "FC2", "A,B,C", "FN1"));
		criteria.add(new Criteria("OW", "FC1", "A,B,C", "FN1"));
		criteria.add(new Criteria("OW", "FC2", "A,B,C", "FN2"));
		criteria.add(new Criteria("OW", "FC2", "A,B,C", "FN2"));


		Map<String, Map<String, List<Criteria>>> groupedCriteriaByTripType = criteria.stream()
				.collect(groupingBy(cr -> cr.getFareClass() + cr.getFootNote(), groupingBy(Criteria::getTripType)));

		List<Criteria> criteriaList = groupedCriteriaByTripType.values()
				.stream().map(Map::values)
				.flatMap(Collection::stream)
				.collect(toList())
				.stream().map(ls -> {
					String cabins = String.join(",", ls.stream().map(cr -> Arrays.asList(cr.getCabins().split(",")))
							.flatMap(Collection::stream).collect(toSet()));
					ls.get(0).setCabins(cabins);
					return ls.get(0);
				}).collect(toList());
		System.out.println(criteriaList);
	}
}


class Criteria {
	private String tripType;
	private String fareClass;
	private String cabins;
	private String footNote;
	public Criteria(final String title, final String fareClass, final String cabins, final String footNote){
		this.tripType = title;
		this.fareClass = fareClass;
		this.cabins = cabins;
		this.footNote = footNote;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public String getFareClass() {
		return fareClass;
	}

	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}

	public String getCabins() {
		return cabins;
	}


	public void setCabins(String cabins) {
		this.cabins = cabins;
	}

	public String getFootNote() {
		return footNote;
	}

	public void setFootNote(String footNote) {
		this.footNote = footNote;
	}

	@Override
	public String toString() {
		return "Criteria{" +
				tripType +
				fareClass +
				cabins +
				footNote +
				'}';
	}
}
