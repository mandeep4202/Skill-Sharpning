package com.target11.dataStructure.sortingAlgorithm;

import java.util.Arrays;

public class InlineMerging {

    public static void performMerging(int[] a, int l, int h, int mid) {
        int[] c = new int[a.length];
        int k = 0;

        int j = mid;
        while (l <= mid && j < h) {
            if (a[l] < a[j]) {
                c[k++] = a[l++];
            } else {
                c[k++] = a[j++];
            }
        }

        for (; l <= mid; l++) {
            c[k++] = a[l];
        }
        for (; j < a.length; j++) {
            c[k++] = a[j];
        }

        System.out.println("After merging " + Arrays.toString(c));
    }

    public static void main(String[] args) {

        int[] A = {2, 5, 8, 12, 3, 6, 7, 10};
        int[] C = new int[A.length];
        performMerging(A, 0, A.length, (0 + A.length) / 2);
        System.out.println("After merging " + Arrays.toString(C));

    }

}
