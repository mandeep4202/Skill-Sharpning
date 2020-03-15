package com.target11.dataStructure.sortingAlgorithm;

import com.target11.Utilites.DataLoader;

import java.util.Arrays;

public class BubbleSort {

    public void performBubbleSort(int[] unsortedArray) {
        // this flag is used to break the execution, if rest of the array is already sorted. this we can confirm if our control will not goto
        // if (unsortedArray[j] > unsortedArray[j + 1]) condition
        boolean flag ;
        for (int i = 0; i < unsortedArray.length; i++) {
            flag = false;
            for (int j = 0; j < (unsortedArray.length - 1) - i; j++) {
                if (unsortedArray[j] > unsortedArray[j + 1]) {
                    flag = true;
                    DataLoader.swapping(unsortedArray, j);
                }
            }
            if (!flag) {
                break;
            }

           // System.out.println(" +++++++++++++++++++   ");
        }
    }

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        int[] arrayToSort = DataLoader.loadSortedArray();
       // DataLoader.display(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
        bubbleSort.performBubbleSort(arrayToSort);
        //DataLoader.display(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
