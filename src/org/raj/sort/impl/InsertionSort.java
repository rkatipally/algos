package org.raj.sort.impl;

import org.raj.SortTester;
import org.raj.sort.Sort;

/**
 * Created by RJK on 8/10/2016.
 */
public class InsertionSort implements Sort {

    public int[] sort(int[] numbers) {
        SortTester.swaps = 0;
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
                SortTester.swaps++;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }

    public void recursive(int[] numbers, int n) {

        if (n > 1) {
            recursive(numbers, n - 1);
        }
        int key = numbers[n];
        int j = n - 1;
        while (j >= 0 && numbers[j] > key) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        numbers[j + 1] = key;
    }

}
