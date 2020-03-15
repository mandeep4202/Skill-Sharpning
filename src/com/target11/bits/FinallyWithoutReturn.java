package com.target11.bits;

public class FinallyWithoutReturn {

    static int m1() {
        try {
            System.out.println("In outer try");

            try {
                System.out.println("In inner try ");
             int i = 10/0;
            } catch (NullPointerException e) {
                System.out.println("In inner Catch");
            } finally {
                System.out.println("IN inner Finally");
               // return 10;
            }
        } catch (NullPointerException n) {
            System.out.println("I Outer Catch");

        } finally {
            System.out.println("In outer finally");
           // return 30;
        }
        System.out.println("After outer try/ catch block");

return 2;

    }

    public static void main(String[] args) {

        System.out.println(m1());

    }


}
