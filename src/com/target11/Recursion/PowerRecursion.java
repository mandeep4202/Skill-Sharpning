package com.target11.Recursion;

public class PowerRecursion {

    private int power(int m, int n) {

//        if(n==0){
//            return 1;
//        }
        if (n > 0) {

            return power(m, n - 1) * m;

        }
        return 1;

    }

    public static void main(String[] args) {

        int m = 2;
        int n = 9;
        int result = new PowerRecursion().power(m, n);
        System.out.println("result = " + result);
    }


}
