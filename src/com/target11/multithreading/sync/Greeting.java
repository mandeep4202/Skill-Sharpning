package com.target11.multithreading.sync;

public class Greeting {

    public static synchronized void greeting(String wishTo){


    for (int i = 0; i < 10; i++) {
        System.out.print("Good Morning ::");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(wishTo);
    }

    }

}
