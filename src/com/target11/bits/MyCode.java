package com.target11.bits;

import java.util.Arrays;

public class MyCode {

    public static void main(String[] args) {

        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {


            for (int j = i+1; j < (arr.length-1); j++) {

                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }

        }
        System.out.println(Arrays.toString(arr));

    }



}
