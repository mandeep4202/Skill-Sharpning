package com.target11.Recursion;

public class FactorialRecursion {

    private int fun(int n) {

        if (n > 0) {

            return fun(n - 1) * n;

        }
        return 1;

    }

    public static void main(String[] args) {

        int n = 5;
        int result=  new FactorialRecursion().fun(n);
        System.out.println("result = " + result);
    }


}
