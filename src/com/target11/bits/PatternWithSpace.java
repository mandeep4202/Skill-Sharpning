package com.target11.bits;

public class PatternWithSpace {

    static void staircase(int n) {

        for(int i = 1 ; i <= n ; i++){

            for(int space = 0 ; space < n - i ; space++ ){
                System.out.print(" ");
            }

            for(int symbol = 0 ; symbol < i ; symbol++ ){
                System.out.print("#");
            }

            System.out.println("");
        }

    }

    public static void main(String[] args) {
        staircase(6);
    }

}
