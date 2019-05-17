package org.raj;

import org.raj.coi.StringReverse;
import org.raj.sort.Sort;
import org.raj.sort.impl.BubbleSort;
import org.raj.sort.impl.InsertionSort;
import org.raj.sort.impl.SelectionSort;

import java.util.Random;

public class SortTester {

    public static int swaps;
    public enum DataSetType {
        IN_ORDER,
        REVERSE_ORDER,
        RANDOM_ORDER

    }

    public static void main(String[] args) {
        int[] before = new int[]{4, 3, 5, 7, 1, 1, 1, 1, 3, 2};
        int size = 1000;
        SortTester sortTester = new SortTester();

        System.out.println("=========IN Order==========");
        sortTester.insertionSorter(sortTester.generateNumbers(DataSetType.IN_ORDER, size).clone());
        sortTester.selectionSorter(sortTester.generateNumbers(DataSetType.IN_ORDER, size).clone());
        sortTester.bubbleSorter(sortTester.generateNumbers(DataSetType.IN_ORDER, size).clone());
        System.out.println("=========In Order End=======");

        System.out.println("=========Reverse Order==========");
        sortTester.insertionSorter(sortTester.generateNumbers(DataSetType.REVERSE_ORDER, size).clone());
        sortTester.selectionSorter(sortTester.generateNumbers(DataSetType.REVERSE_ORDER, size).clone());
        sortTester.bubbleSorter(sortTester.generateNumbers(DataSetType.REVERSE_ORDER, size).clone());
        System.out.println("=========Reverse Order End=======");

        System.out.println("=========Random Order==========");
        sortTester.insertionSorter(sortTester.generateNumbers(DataSetType.RANDOM_ORDER, size).clone());
        sortTester.selectionSorter(sortTester.generateNumbers(DataSetType.RANDOM_ORDER, size).clone());
        sortTester.bubbleSorter(sortTester.generateNumbers(DataSetType.RANDOM_ORDER, size).clone());
        System.out.println("=========Random Order End=======");




    }

    public void insertionSorter(int[] before) {
        Sort insertionSort = new InsertionSort();
        long startTime = System.nanoTime();
        int[] after = insertionSort.sort(before);
        long endTime = System.nanoTime();
        System.out.println("=============InsertionSort Begin===============");
        SortTester.printArray(after);
        System.out.println("Time in nano seconds - " + (endTime - startTime));
        System.out.println("=============InsertionSort End==================");
    }

    public void selectionSorter(int[] before) {
        Sort selectionSort = new SelectionSort();
        long startTime = System.nanoTime();
        int[] after = selectionSort.sort(before);
        long endTime = System.nanoTime();
        System.out.println("=============SelectionSort Begin===============");
        SortTester.printArray(after);
        System.out.println("Time in nano seconds - " + (endTime - startTime));
        System.out.println("=============SelectionSort End==================");
    }

    public void bubbleSorter(int[] before) {
        Sort bubbleSort = new BubbleSort();
        long startTime = System.nanoTime();
        int[] after = bubbleSort.sort(before);
        long endTime = System.nanoTime();
        System.out.println("=============BubbleSort Begin===============");
        SortTester.printArray(after);
        System.out.println("Time in nano seconds - " + (endTime - startTime));
        System.out.println("=============BubbleSort End=============");
    }

    public int[] generateNumbers(DataSetType type, int size) {
        int[] numbers = new int[size];
        switch (type) {
            case IN_ORDER:
                for (int i = 0; i < size; i++) {
                    numbers[i] = i + 1;
                }
                break;
            case REVERSE_ORDER:
                for (int i = 0; i < size; i++) {
                    numbers[i] = size - i;
                }
                break;
            case RANDOM_ORDER:
                Random random = new Random();
                for (int i = 0; i < size; i++) {
                    numbers[i] = random.nextInt(size) + 1;
                }
                break;
            default:
                break;
        }
        return numbers;
    }

    public static void printArray(int[] after) {
        System.out.print("[");
        for (int i = 0; i < after.length; i++) {
            System.out.print(after[i]);
            if (i != after.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
        System.out.println("No of swaps - " + SortTester.swaps);
    }
}
