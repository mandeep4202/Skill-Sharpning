package com.target11.dataStructure.sortingAlgorithm;

import com.target11.Utilites.DataLoader;

public class ShellSortPrac {


    private void performShellSort(int[] a) {

        int gap = a.length/ 2;

        for (int i = gap; i < a.length; i++) {

            int key = a[i];
            int j = i;

            while ((j >= gap) && (a[j-gap] > key)) {

                a[j + 1] = a[j];
                j -= gap;
            }
            a[j ] = key;
           // System.out.println( "");

        }


    }

    public static void main(String[] args) {
        //{7, 8, 5, 2, 4, 6, 3}
        ShellSortPrac shellSort = new ShellSortPrac();
        int[] arrayToSort = DataLoader.loadUnsortedArray();
        System.out.println("++++++++++ Before sorting +++++++++++");
        DataLoader.display(arrayToSort);
        shellSort.performShellSort(arrayToSort);
        System.out.println("++++++++++ After sorting +++++++++++");
        DataLoader.display(arrayToSort);

    }


}
