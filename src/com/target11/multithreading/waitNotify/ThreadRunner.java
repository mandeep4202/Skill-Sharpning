package com.target11.multithreading.waitNotify;

public class ThreadRunner {

    public static void main(String[] args) {

        System.out.println("Main thread is starting");
        ThreadB threadB = new ThreadB();

        threadB.start();

        /*try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        synchronized (threadB) {
            try {
                threadB.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

       /* try {
            threadB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        System.out.println("Main thread waking up");

        System.out.println(threadB.totalAmount);


    }

}
