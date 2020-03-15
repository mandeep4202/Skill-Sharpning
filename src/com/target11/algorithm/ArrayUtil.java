package com.target11.algorithm;


import java.util.Arrays;

public class ArrayUtil {


    public static int[] insert(int[] array, int element, int index) {

        int[] expArray = growArray(array);
        int i = 0;
        for (i = expArray.length - 1; i > index; i--) {
            expArray[i] = expArray[i - 1];
        }
        if(index == i) {
            expArray[index] = element;
        }
        return expArray;
    }


    public static boolean remove(int[] array, int index) {

        return true;
    }

    private static int[] growArray(int[] smallArray) {

        int[] growableArray = new int[smallArray.length + 1];
        Arrays.fill(growableArray, 0);

        for (int i = 0; i < smallArray.length; i++) {
            growableArray[i] = smallArray[i];
        }
        System.out.println(Arrays.toString(growableArray));
        return growableArray;
    }

    public static boolean isSorted(int[] A) {
        for (int i = 0; i < A.length-1; i++) {
            if (A[i] > A[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /*insert element to sorted array */
    public static int[] addTo(int[] A,int key) {

        if(isSorted(A)) {
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i + 1]) {

                }
            }
        }
        return null;
    }

}
