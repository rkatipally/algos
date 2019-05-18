package org.raj.java8;

import java.util.*;

import static java.util.stream.Collectors.*;

public class GroupByTester {

    private static final String MULTI_MARKET_SEP = ",";

    public static void main(String[] args) {
        GroupByTester groupByTester = new GroupByTester();
        groupByTester.testGroupBy();

    }

    public void testGroupBy() {
        List<Criteria> criteria = new ArrayList<>();
        //criteria.add(new Criteria("OW", "", "A,B,C,D", ""));
//		criteria.add(new Criteria("RT", "", "A,B,C,D", ""));
//		criteria.add(new Criteria("OW", "", "A,B,C", ""));
        criteria.add(new Criteria("OW", "FC1", "A,B,C", "FN2"));
        criteria.add(new Criteria("OW", "FC1", "A,B,D", "FN2"));
        criteria.add(new Criteria("OW", "FC3", "A,B,C", ""));
        criteria.add(new Criteria("OW", "FC4", "A,B,D", ""));
        criteria.add(new Criteria("OW", "", "A,B,C", "FN3"));
        criteria.add(new Criteria("OW", "", "A,B,D", "FN4"));
        criteria.add(new Criteria("RT", "FC2", "A,B,C", "FN1"));
        criteria.add(new Criteria("OW", "FC1", "A,B,C", "FN1"));
        criteria.add(new Criteria("RT", "FC2", "A,B,C", "FN2"));
        criteria.add(new Criteria("OW", "FC3", "A,B,D", "FN2"));


        Map<String, Map<String, List<Criteria>>> groupedCriteriaByTripType = criteria.stream()
                .collect(groupingBy(cr -> cr.getFareClass() + cr.getFootNote(), groupingBy(Criteria::getTripType)));

        List<Criteria> criteriaList = groupedCriteriaByTripType.values()
                .stream().map(Map::values)
                .flatMap(Collection::stream)
                .collect(toList())
                .stream().map(ls -> {
                    String cabins = String.join(MULTI_MARKET_SEP, ls.stream().map(cr -> Arrays.asList(cr.getCabins().split(MULTI_MARKET_SEP)))
                            .flatMap(Collection::stream).collect(toSet()));
                    ls.get(0).setCabins(cabins);
                    return ls.get(0);
                }).collect(toList());
        //System.out.println(criteriaList);

        Map<String, List<Criteria>> groupedCriteriaByCabinAndTripType = criteriaList.stream()
                .collect(groupingBy(cr -> cr.getTripType() + cr.getCabins()));

        System.out.println(groupedCriteriaByCabinAndTripType);

        Set<Criteria> criteriaList1 = groupedCriteriaByCabinAndTripType.values()
                .stream()
                .map(ls -> {
                    Set<Criteria> finalList = new HashSet<>();
                    Map<Boolean, List<Criteria>> fareClassSplit = ls.stream().collect(partitioningBy(cr -> cr.getFareClass().equals("")));
                    Map<Boolean, List<Criteria>> footNoteSplit = ls.stream().collect(partitioningBy(cr -> cr.getFootNote().equals("")));
                    List<Criteria> noFCList = fareClassSplit.get(true);
                    List<Criteria> noFNList = footNoteSplit.get(true);
                    if (noFCList.size() > 0) {
                        finalList.add(parseFootNote(noFCList));
                    } else if(noFNList.size()>0){
                        finalList.add(parseFareClass(noFCList));
                    }
                    else {
                        List<Criteria> fcList = fareClassSplit.get(false);
                        finalList.add(parseFareClass(fcList));
                        finalList.add(parseFootNote(fcList));
                    }
                    return finalList;
                }).flatMap(Collection::stream).collect(toSet());

        System.out.println(criteriaList1);
    }

    private Criteria parseFootNote(List<Criteria> criteriaList){
        String footNote = String.join(MULTI_MARKET_SEP, criteriaList.stream().map(cr -> Arrays.asList(cr.getFootNote().split(MULTI_MARKET_SEP))).flatMap(Collection::stream).collect(toSet()));
        criteriaList.get(0).setFootNote(footNote);
        return criteriaList.get(0);
    }

    private Criteria parseFareClass(List<Criteria> criteriaList){
        String fareClass = String.join(MULTI_MARKET_SEP, criteriaList.stream().map(cr -> Arrays.asList(cr.getFareClass().split(MULTI_MARKET_SEP))).flatMap(Collection::stream).collect(toSet()));
        criteriaList.get(0).setFareClass(fareClass);
        return criteriaList.get(0);
    }
}



class Criteria {
    private String tripType;
    private String fareClass;
    private String cabins;
    private String footNote;

    public Criteria(final String title, final String fareClass, final String cabins, final String footNote) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Criteria criteria = (Criteria) o;
        return Objects.equals(tripType, criteria.tripType) &&
                Objects.equals(fareClass, criteria.fareClass) &&
                Objects.equals(cabins, criteria.cabins) &&
                Objects.equals(footNote, criteria.footNote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tripType, fareClass, cabins, footNote);
    }

    public void setFootNote(String footNote) {
        this.footNote = footNote;
    }

    @Override
    public String toString() {
        return "Criteria{" +
                tripType + "-" +
                fareClass + "-" +
                cabins + "-" +
                footNote + "-" +
                '}';
    }
}
