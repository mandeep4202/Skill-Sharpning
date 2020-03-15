package com.target11.dataStructure.sortingAlgorithm;

import com.target11.Utilites.DataLoader;

public class SelectionSort {

    public void performSelectionSort(int[] arrayToSort) {

        for (int i = 0; i < arrayToSort.length; i++) {
            int index = i;

            for (int j = i + 1; j < arrayToSort.length; j++) {

                if (arrayToSort[index] < arrayToSort[j]) {
                    index = j;
                }
            }
            if (i != index) {

                int temp = arrayToSort[i];
                arrayToSort[i] = arrayToSort[index];
                arrayToSort[index] = temp;
            }

        }

    }


    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();

        int[] arrayToSort = DataLoader.loadSortedArray();
        DataLoader.display(arrayToSort);
        selectionSort.performSelectionSort(arrayToSort);

        System.out.println("++++++++++ After sorting +++++++++++");

        DataLoader.display(arrayToSort);


    }

}
