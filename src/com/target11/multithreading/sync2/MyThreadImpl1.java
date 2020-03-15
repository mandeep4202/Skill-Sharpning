package com.target11.multithreading.sync2;

public class MyThreadImpl1 extends Thread {

    Printing printing;

    public MyThreadImpl1(Printing printing) {
        this.printing = printing;
    }

    public void run(){
        printing.printNumber();
    }


}
