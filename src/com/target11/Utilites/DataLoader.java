package com.target11.Utilites;

public class DataLoader {

    public static void swapping(int[] unsortedArray, int index) {

        int temp = unsortedArray[index];
        unsortedArray[index] = unsortedArray[index + 1];

        unsortedArray[index + 1] = temp;
    }

    public static int[] loadUnsortedArray() {
        //int unsortedArray[] = {64, 34, 25, 12, 22, 11, 90};
        //int unsortedArray[] = {7, 8, 5, 2, 4, 6, 3,10,11, 42, 22, 250, 19, 64, 34};
        int unsortedArray[] = {7, 8, 5, 2, 4, 6, 3,10};
        return unsortedArray;
    }

    public static int[] loadSortedArray() {
        int sortedArray[] = {11, 12, 22, 25, 90, 64, 34};
        return sortedArray;
    }

    public static void display(int[] printArray) {

        for (int i = 0; i < printArray.length; i++) {
            System.out.println("printArray = [" + printArray[i] + "]");
        }
    }


}
