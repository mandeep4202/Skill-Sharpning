package com.target11.algorithm;

import java.util.Arrays;

public class MergingAlgo {

    public static int[] performMerge(int[] A, int[] B) {
        int[] C = new int[A.length + B.length];
       int lengthA = A.length ;
       int lengthB = B.length ;
       int i = 0;
       int j = 0;
       int k = 0;
        while( i < lengthA && j < lengthB ){

            if(A[i] < B[j]){
                C[k++]=A[i++];
            } else if(A[i] > B[j]){
                C[k++]=B[j++];
            }

        }

        for( ; i< lengthA ;i++){
            C[k++]=A[i++];
        }

        for( ; j< lengthA ;j++){
            C[k++]=B[j++];
        }

        return C;
    }

    public static void main(String[] args) {
        int[] A = {2, 10, 18, 20, 23};
        int[] B = {4, 9, 19, 25};

        System.out.println(Arrays.toString(performMerge(A, B)));
    }

}
