package com.target11.multithreading.sync2;

public class SynchronizationDemo {


    public static void main(String[] args) {
        Printing printing1 = new Printing();
        Printing printing2 = new Printing();

       // long start = System.currentTimeMillis();
        MyThreadImpl1 myThreadImpl1 = new MyThreadImpl1(printing1);
        MyThreadImpl2 myThreadImpl2 = new MyThreadImpl2(printing2);


        myThreadImpl1.start();
        myThreadImpl2.start();

        //long end = System.currentTimeMillis();
        //System.out.println( end-start);
    }
}
