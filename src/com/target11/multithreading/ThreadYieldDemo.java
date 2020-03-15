package com.target11.multithreading;

public class ThreadYieldDemo {

	public static void main(String[] args) {

		MyThread4 t4 = new MyThread4();

		Thread ct = Thread.currentThread();
		// System.out.println(ct.getPriority() + " " + ct.getName());

		//t4.setPriority(10);
		t4.start();
		// System.out.println(t3.getPriority() + " " + t3.getName());

		for (int i = 0; i < 10; i++) {
			System.out.println("From Main Thread");
		}
	}
}

class MyThread4 extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("From Child thread");
           Thread.yield();
		}
	}
}