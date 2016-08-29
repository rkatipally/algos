package org.raj;

import org.raj.sort.Sort;
import org.raj.sort.impl.InsertionSort;
import org.raj.sort.impl.SelectionSort;

public class SortTester {

    public static void main(String[] args) {
        int[] before = new int[]{4, 3, 5, 7, 1, 1, 1, 1, 3, 2};

        SortTester sortTester = new SortTester();
        sortTester.insertionSorter(before.clone());
        sortTester.selectionSorter(before.clone());


    }

    public void insertionSorter(int[] before){
        Sort insertionSort = new InsertionSort();
        long startTime = System.nanoTime();
        int[] after = insertionSort.sort(before);
        long endTime = System.nanoTime();
        System.out.println("=============InsertionSort===============");
        SortTester.printArray(after);
        System.out.println("Time in nano seconds - " + (endTime - startTime));
        System.out.println("==========================================");
    }

    public void selectionSorter(int[] before){
        Sort selectionSort = new SelectionSort();
        long startTime = System.nanoTime();
        int[] after = selectionSort.sort(before);
        long endTime = System.nanoTime();
        System.out.println("=============SelectionSort===============");
        SortTester.printArray(after);
        System.out.println("Time in nano seconds - " + (endTime - startTime));
        System.out.println("==========================================");
    }

    public static void printArray(int[] after){
        System.out.print("[");
        for (int i = 0; i < after.length; i++) {
            System.out.print(after[i]);
            if (i != after.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
    }
}
