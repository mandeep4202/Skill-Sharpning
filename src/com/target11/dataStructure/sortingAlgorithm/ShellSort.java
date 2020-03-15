package com.target11.dataStructure.sortingAlgorithm;

import com.target11.Utilites.DataLoader;

public class ShellSort {


    private void performShellSort(int[] arrayToSort) {

        int gap = arrayToSort.length / 2;

        while (gap > 0) {
            System.out.println("                              inside outer while  loop start ");
            int j = 0;
            for (int i = gap; i < arrayToSort.length; i++) {

                System.out.println("                inside outer loop start");
                int pivot = arrayToSort[i];

                // this loop will always run only one time
                for (j = i; j >= gap && arrayToSort[j - gap] > pivot; j -= gap) {
                          System.out.println("inside inner loop j :" + j + "  gap :" + gap);

                    System.out.println("arrayToSort[j] "+  arrayToSort[j] +" <><>  arrayToSort[j - gap] "+ arrayToSort[j - gap]);
                    arrayToSort[j] = arrayToSort[j - gap];
                }
                System.out.println("                inside outer loop end");
                arrayToSort[j] = pivot;
            }
            System.out.println("                              inside outer while  loop End");
            gap = gap / 2;
        }
    }

    public static void main(String[] args) {
        //{7, 8, 5, 2, 4, 6, 3}
        ShellSort shellSort = new ShellSort();
        int[] arrayToSort = DataLoader.loadUnsortedArray();
        System.out.println("++++++++++ Before sorting +++++++++++");
        DataLoader.display(arrayToSort);
        shellSort.performShellSort(arrayToSort);
        System.out.println("++++++++++ After sorting +++++++++++");
        DataLoader.display(arrayToSort);

    }


}
