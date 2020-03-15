package com.target11.dataStructure.sortingAlgorithm;

import com.target11.Utilites.DataLoader;

public class InsertionSortPRac {


    private void performInsertionSort(int[] a) {
        //{7, 8, 5, 2, 4, 6, 3}
        //{0, 1, 2, 3, 4, 5, 6}

        //int j = 0;
        for (int i = 1; i < a.length; i++) {

            int temp = a[i];
            int j = i - 1;
            //for ( j--) {
            while ((j > -1) && (a[j] > temp)) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = temp;

        }


    }

    public static void main(String[] args) {
        InsertionSortPRac insertionSortPRac = new InsertionSortPRac();
        int[] arrayToSort = DataLoader.loadUnsortedArray();
        DataLoader.display(arrayToSort);
        insertionSortPRac.performInsertionSort(arrayToSort);
        System.out.println("++++++++++ After sorting +++++++++++");
        DataLoader.display(arrayToSort);
    }

}
