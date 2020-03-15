package com.target11.bits;

class First1 {

    void display(){
        System.out.println("First class ");
    }
}

class Second1 extends First1 {

    void display(){

    }
}



public class InterfaceTesting12 extends Second1{

    void display(){
        System.out.println("Main class ");
    }


    public static void main(String[] args) {

        First1 first1 = new InterfaceTesting12();

        first1.display();
    }

}

