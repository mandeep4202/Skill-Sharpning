package com.target11.Recursion;

public class TreeRecursion {

    private static int fun(int n){

        if(n > 0 ){

            System.out.print(" " + n);
            fun(n-1);
            fun(n-1);

        }
        return 0;

    }

    public static void main(String[] args) {

        fun(3);

    }
}
