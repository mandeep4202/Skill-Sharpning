package com.target11.multithreading.sync;

public class MyThread extends Thread {

    Greeting greeting;
    String wishTo;

    public MyThread(Greeting greeting, String wishTo) {
        this.greeting = greeting;
        this.wishTo = wishTo;
    }

    public void run(){
        greeting.greeting(wishTo);
    }


}
