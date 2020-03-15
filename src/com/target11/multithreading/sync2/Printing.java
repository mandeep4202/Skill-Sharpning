package com.target11.multithreading.sync2;

public class Printing {

    public  synchronized void printNumber() {
        for (int i = 0; i < 10; i++) {
            System.out.print(" "+i+" ");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }


    public  synchronized void printChar() {
        for (int i = 65; i < 75; i++) {
            System.out.print(" "+(char) i + " ");

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
