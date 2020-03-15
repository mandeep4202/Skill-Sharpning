package com.target11.multithreading.waitNotify;

public class ThreadB extends Thread {

    int totalAmount;

    public void run() {

        System.out.println("Child thread starts Calculation");

        synchronized (this) {

            for (int i = 0; i < 100; i++) {
                totalAmount = totalAmount + i;
            }
            System.out.println("synchronized block executed");
            // here we are calling a
            this.notify();
        }
        System.out.println("Child thread giving notification");

    }

}
