package com.target11.dataStructure.sortingAlgorithm;

import java.util.Arrays;

// merging two list
public class MergingLogic {

    public static void performMerging(int a[], int b[], int c[]) {

        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                c[k++] = a[i++];

            } else {
                c[k++] = b[j++];
            }

        }

        for (; i < (a.length); i++) {
            System.out.println("sds" + (a.length - 1) + " " + i);
            c[k++] = a[i];
        }

        for (; j < b.length; j++) {
            c[k++] = b[j];
            //k++;
        }


    }


    public static void main(String[] args) {
        int[] A = {2, 10, 18, 20, 23};
        int[] B = {4, 9, 19, 25};
        int[] C = new int[A.length + B.length];
        performMerging(A, B, C);
        System.out.println("After merging " + Arrays.toString(C));

    }

}
