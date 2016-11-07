package org.raj.core.collections;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by rjk on 10/26/2016.
 */
public class IteratorTester {
    public static void main(String[] args){
        IteratorTester iteratorTester = new IteratorTester();
        //iteratorTester.failFast();
        iteratorTester.failSafe();
    }

    public void failFast(){
        List<String> stringList =  new ArrayList<String>();
        stringList.add("Raj");
        stringList.add("Katipally");

        Iterator<String> iterator = stringList.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
            stringList.add("Reddy");//ConcurrentModificationException
        }
    }

    public void failSafe(){

        List<String> stringList =  new ArrayList<String>();
        stringList.add("Raj");
        stringList.add("Katipally");

        List<String> synchronizedList = Collections.synchronizedList(stringList);

        Iterator<String> iterator = synchronizedList.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
            synchronizedList.add("Reddy");//ConcurrentModificationException
        }
        CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
        copyOnWriteArrayList.add("Raj");
        copyOnWriteArrayList.add("Katipally");

        iterator = copyOnWriteArrayList.iterator();
        while ((iterator.hasNext())){
            System.out.println(iterator.next());
            copyOnWriteArrayList.add("Reddy");//No ConcurrentModificationException
        }
    }
}
