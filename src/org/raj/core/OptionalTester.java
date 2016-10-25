package org.raj.core;

import java.util.Optional;

/**
 * Created by RJK on 10/18/2016.
 */
public class OptionalTester {
    public static void main(String args[]){
        Optional<String> name =  Optional.ofNullable(null);
        // Optional<String> name =  Optional.ofNullable(null);
        System.out.println("Name - " + name);
        System.out.println("Or else - " + name.orElseGet(() -> "Raj"));
        System.out.println("Name is set? " + name.isPresent());
//        /System.out.println("To uppercase-" + name.get());
        System.out.println("Or else - " + name.orElseGet(() -> "Raj"));
    }
}
