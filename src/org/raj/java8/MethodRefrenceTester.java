package org.raj.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by atp3rxk on 5/26/2017.
 */
public class MethodRefrenceTester {
//instance method and static method references
    //instance method needs to have parameter as target
    public static void main(String[] args){
        System.out.println("Hello Java");
        List<String> list = Arrays.asList("A","B","C");
        List<String> subList = Arrays.asList("A","B");
        System.out.println(Collections.indexOfSubList(list, subList));

    }

}
