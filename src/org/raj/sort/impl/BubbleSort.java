package org.raj.sort.impl;

import org.raj.SortTester;
import org.raj.sort.Sort;

/**
 * Created by atp3rxk on 3/11/2017.
 */
public class BubbleSort implements Sort{

    public int[] sort(int[] input) {
        int size = input.length ;
        SortTester.swaps = 0;
        for (int i = 0; i < size; i++) {
            for (int j = size-1; j > i; j--) {
                if (input[j] < input[j-1]) {
                    int temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;
                    SortTester.swaps++;
                }
            }
        }
        return input;
    }
}
