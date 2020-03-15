package com.target11.bits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TwoDimentionArray {

    /* This method is find the sum of diagonal from array's */
    static int performSum(int[][] ar){

        int pDia = 0;
        int sDia = 0;
        int counter = ar.length;
        for (int i = 0; i < ar.length; i++) {

            pDia = pDia + ar[i][i];

            // keeping track of counter for second diagonal
            counter = counter-1;

            sDia = sDia + ar[i][counter];

        }
        System.out.println(sDia);
       return pDia;
    }

    /* This method is find the sum of diagonal from List of list of Integer's */
    public static int diagonalDifference(List<List<Integer>> arr) {
        int pDia = 0;
        int sDia = 0;
        int counter = arr.size();
        for (int i = 0; i < arr.size(); i++) {
               List<Integer> row = arr.get(i);

                pDia = pDia + row.get(i);
            counter = counter-1;
            sDia = sDia + row.get(counter);
        }
        return Math.abs(pDia-sDia) ;
    }


    public static void main(String[] args) throws IOException {

        int[][] input = {{1,2,3,8},{4,5,6,7},{9,8,9,5},{1,1,1,1}};


        //System.out.println(performSum(input));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = diagonalDifference(arr);
        System.out.println("Result  :: "+ result);

    }

}
