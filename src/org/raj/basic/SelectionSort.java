package org.raj.basic;

/**
 * Created by RJK on 8/10/2016.
 */
public class SelectionSort {
    public int[] sort(int[] numbers) {
        int min = numbers[0], index = 0, a = 1;
        while (a < numbers.length) {
            for (int i = a; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    index = i;
                }
            }
            if (index != 0) {
                numbers[index] = numbers[a];
                numbers[a] = min;
            }
            a++;
        }
        return numbers;
    }
}
