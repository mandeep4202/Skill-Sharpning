package com.target11.algorithm;

public class MinAndMaxSum {

    static void miniMaxSum(int[] arr) {
        long sum[] = new long[arr.length];
        for(int i= 0; i< arr.length ; i++){
            long sumT =0;
            for(int j= 0; j< arr.length ; j++){

                if(i != j){
                    sumT = sumT + arr[j];
                }

            }

            sum[i] = sumT;
        }
        long lar = sum[0];
        long small = sum[0];

        for(int j= 0; j< arr.length ; j++){

            if(sum[j] > lar ){
                //secLar = lar;
                lar = sum[j];
                System.out.println(" SUm "+sum[j]);
            }else if(sum[j] < small ){
                System.out.println(" SUm "+sum[j]);
                small = sum[j];
            }

        }
        System.out.printf("%-1d %d ",small,lar);


    }

    public static void main(String[] args) {
        int[] sum = {1,2,3,4,5};
        miniMaxSum(sum);
    }


}
