package com.target11.multithreading.sync;

public class SynchronizationDemo {


    public static void main(String[] args) {
        Greeting greeting = new Greeting();
        MyThread myThread = new MyThread(greeting,"Manu");
        MyThread myThread2 = new MyThread(greeting,"Nishu");

       // long start = System.currentTimeMillis();

        myThread.start();
        myThread2.start();

        //long end = System.currentTimeMillis();
        //System.out.println( end-start);
    }
}
