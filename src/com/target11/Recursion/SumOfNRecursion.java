package com.target11.Recursion;

public class SumOfNRecursion {

    private int sum(int n) {

        if (n > 0) {

            return sum(n - 1) + n;

        }
        return 0;

    }

    public static void main(String[] args) {

        int n = 5;
        int result=  new SumOfNRecursion().sum(n);
        System.out.println("result = " + result);
    }


}
