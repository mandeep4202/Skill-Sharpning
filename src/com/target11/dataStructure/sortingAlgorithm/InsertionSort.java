package com.target11.dataStructure.sortingAlgorithm;

import com.target11.Utilites.DataLoader;

public class InsertionSort {

    private void performInsertionSort(int[] arrayToSort) {

        for (int i = 1; i < arrayToSort.length; i++) {

            int key = arrayToSort[i];
            int j = i - 1;
            while ((j > -1) && (arrayToSort[j] > key)) {
                arrayToSort[j + 1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();
        int[] arrayToSort = DataLoader.loadUnsortedArray();
        DataLoader.display(arrayToSort);
        insertionSort.performInsertionSort(arrayToSort);
        System.out.println("++++++++++ After sorting +++++++++++");
        DataLoader.display(arrayToSort);

    }


}
