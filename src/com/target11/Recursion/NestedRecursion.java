package com.target11.Recursion;

public class NestedRecursion {

    private static int fun(int n){

        if(n > 100 ){
            return n-10;

        }else{
            return fun(fun(n+11));
        }
    }

    public static void main(String[] args) {

        System.out.println(" Return " + fun(97));

    }
}
