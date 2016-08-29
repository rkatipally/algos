package org.raj.sort.impl;

/**
 * Created by RJK on 8/11/2016.
 */
public class MergeSort {
    public void mergeSort(int[] in, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(in, p, q);
            mergeSort(in, q + 1, r);
            merge(in, p, q, r);
        }

    }

    public void merge(int[] out, int p, int q, int r) {
        int sizeLeft = q - p + 1, sizeRight = r - q;
        int[] left = new int[sizeLeft], right = new int[sizeRight];

        for (int i = 0; i < sizeLeft; i++) {
            left[i] = out[i + p];
        }

        for (int j = 0; j < sizeRight; j++) {
            right[j] = out[q + j + 1];
        }

        int i = 0, j = 0;
        for (int k = p; k < r; k++) {
            if (i < sizeLeft) {
                if (left[i] <= right[j]) {
                    out[k] = left[i];
                    i++;
                } else {
                    if (j < sizeRight) {
                        out[k] = right[j];
                        j++;
                    } else {
                        out[k] = left[i];
                        i++;
                    }
                }
            }
        }

    }
}
