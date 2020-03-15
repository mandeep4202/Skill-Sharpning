package com.target11.bits;

public class StaticMemberExecution {

    static int a ;

    static void m1(int a){
        a= StaticMemberExecution.a ;
        System.out.println(" in M1 "+ a);
    }


    public static void main(String[] args) {

        System.out.println(" before a  "+ a);
        m1(50);
        System.out.println(" After  a  "+ a);


    }


}
