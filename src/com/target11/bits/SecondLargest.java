package com.target11.bits;

import com.target11.Utilites.DataLoader;

import java.util.Arrays;

public class SecondLargest {

    private int find2ndLargest(int[] arrayToSort) {

        int sl = arrayToSort[0];
        int l = arrayToSort[0];

        for(int j = 1 ; j < arrayToSort.length ; j++)
        {

            if( arrayToSort[j] > l){
                sl= l;
                l= arrayToSort[j];
            }else if(arrayToSort[j] > sl){
                sl= arrayToSort[j];
            }

        }
return sl;

    }


    public static void main(String[] args) {

        SecondLargest SecondLargest = new SecondLargest();
        int[] arrayToSort = {14, 46, 47, 45, 92, 52, 48, 36, 66, 85};
        System.out.println(Arrays.toString(arrayToSort));
        int  sl =  SecondLargest.find2ndLargest(arrayToSort);
        System.out.println("Seond largest "+ sl);
    }



}
