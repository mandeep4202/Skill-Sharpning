package com.target11.multithreading;

public class ThreadPriorities {

	public static void main(String[] args) {

		MyThread3 t3 = new MyThread3();
		

		

		Thread ct = Thread.currentThread();
		//System.out.println(ct.getPriority() + "  " + ct.getName());

		t3.setPriority(10);
		t3.start();
		//System.out.println(t3.getPriority() + "  " + t3.getName());

		for (int i = 0; i < 10; i++) {
			System.out.println("From Main Thread");
		}
		
	}

}

class MyThread3 extends Thread {

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