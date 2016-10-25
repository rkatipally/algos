package org.raj.core;

import java.util.Arrays;
import java.util.List;

/**
 * Created by RJK on 10/18/2016.
 */
public class StreamTester {
    public static void main(String[] args){
        List<String> list  = Arrays.asList("One","Two","Three","Four", "five" );
        list.stream().filter((s) -> s.equalsIgnoreCase("Two")).map(String::toUpperCase).forEach(System.out::println);
    }
}
