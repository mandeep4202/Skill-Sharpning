package com.target11.multithreading;

public class ThreadDemo2 {

	public static void main(String[] args) {
		// ThreadDemo2 demo = new ThreadDemo2();
		MyThread2 myThread = new MyThread2();

		myThread.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("From Main thread");

		}

	}

}

class MyThread2 extends Thread {

	public void start(){
		super.start();
		System.out.println("THis is overridden start method");
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("From Child thread");
		}
	}

	public void run(String message) {
		for (int i = 0; i < 10; i++) {
			System.out.println("From Child thread");
		}
	}

}
