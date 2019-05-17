package org.raj.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTester {


    public static void main(String[] args){

        List<Person> friends = new ArrayList<>();
        friends.add(new Person("Priya1", "Astorial Cir", null));
        friends.add(new Person("Amith1", "Astorial Cir", null));
        Person p1 = new Person("Raj1", "Astoria Cir", friends);

        friends = new ArrayList<>();
        friends.add(new Person("Priya2", "Astorial Cir", null));
        friends.add(new Person("Amith2", "Astorial Cir", null));
        Person p2 = new Person("Raj2", "Astoria Cir", friends);
        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);

        List<Person> finalList = personList.stream().flatMap(obj -> Stream.concat(Stream.of(obj),obj.friends.stream())).collect(Collectors.toList());
        System.out.println(finalList);

    }
}

class Person{
    String name;
    String address;
    List<Person> friends;
    Person(String name, String address, List<Person> friends){
        this.name = name;
        this.address = address;
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", friends=" + friends +
                '}';
    }
}