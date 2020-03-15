package com.target11.algorithm;

public class FindingMissingMulNo {

    public static void findMissingNumbers(int[] A){

        int diff = A[0]-0;
        for (int i = 0; i < A.length ; i++) {


            if(A[i]-i != diff){


                while(A[i]-i > diff){
                    System.out.println(i+diff);
                    diff++;
                }

            }

        }


    }

    public static void main(String[] args) {

        int[] A = {6,7,8,9,11,12,15,16,17,18,19,25};

        findMissingNumbers(A);

    }

}
