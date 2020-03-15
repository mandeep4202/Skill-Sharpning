package com.target11.multithreading.sync2;

public class MyThreadImpl2 extends Thread {


    Printing printing;
    public MyThreadImpl2(Printing printing) {
        this.printing = printing;
    }


    public void run(){
        printing.printChar();
    }


}
