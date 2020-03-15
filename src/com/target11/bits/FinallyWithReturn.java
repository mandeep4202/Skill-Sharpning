package com.target11.bits;

public class FinallyWithReturn {

    static int m1() {
        try {
            System.out.println("In outer try");

            try {
                System.out.println("In inner try ");
                return 3;
            } catch (ArithmeticException e) {
                System.out.println("In Catch");
            } finally {
                System.out.println("IN inner Finally");
                //return 10;
            }
        } catch (NullPointerException n) {
            System.out.println("I Outer Catch");

        } finally {
            System.out.println("In outer catch");
           // return 30;
        }
      //  System.out.println("After outer try/ catch block");

return 100;

    }

    public static void main(String[] args) {

        System.out.println(m1());

    }


}
