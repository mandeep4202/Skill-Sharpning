package com.target11.multithreading;

public class RunnableExample {

	public static void main(String[] args) {

MyRunnable r = new MyRunnable();

Thread t1 = new Thread();
Thread t2 = new Thread(r);
		
		//t1.start();
		//t1.run();
		t2.start();
		//t2.run();
		//r.start(); // CE
		//r.run();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("From Main thread");
		}
		
		Thread currentThread =  Thread.currentThread();
		
		System.out.println("------------------------------------"+currentThread.getName());
		
	}
}

class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("From Child thread");
		}
System.out.println("                     "+Thread.currentThread().getName());
	}

}