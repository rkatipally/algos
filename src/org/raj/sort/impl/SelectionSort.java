package org.raj.sort.impl;

import org.raj.SortTester;
import org.raj.sort.Sort;

/**
 * Created by RJK on 8/10/2016.
 */
public class SelectionSort implements Sort {
    public int[] sort(int[] numbers) {
        //SortTester.printArray(numbers);
        int a = 1;
        SortTester.swaps = 0;
        while (a < numbers.length) {
            int min = numbers[a - 1], index = 0;
            for (int i = a; i < numbers.length; i++) {
                if (numbers[i] <= min) {
                    min = numbers[i];
                    index = i;
                }
            }
            if (index != 0) {
                numbers[index] = numbers[a - 1];
                numbers[a - 1] = min;
                SortTester.swaps++;
            }
            a++;
        }
        return numbers;
    }
}
