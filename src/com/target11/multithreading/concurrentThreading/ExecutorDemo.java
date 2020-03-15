package com.target11.multithreading.concurrentThreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob implements Runnable{
    String name;

    PrintJob(String name){
        this.name = name;
    }


    @Override
    public void run() {

        System.out.println(name +" Job started by.. "+ Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name +" Job completed by thread ::  "+ Thread.currentThread().getName());

    }
}

public class ExecutorDemo {
    public static void main(String[] args) {

        PrintJob[] printJobs = { new PrintJob("Manu"),
                new PrintJob("Dhoni"),
                new PrintJob("Navi"),
                new PrintJob("Nishu")};

        ExecutorService service = Executors.newFixedThreadPool(2);

        for (int i = 0; i < printJobs.length ; i++) {
            service.submit(printJobs[i]);
        }


    }

}
