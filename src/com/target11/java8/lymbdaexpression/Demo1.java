package com.target11.java8.lymbdaexpression;

public class Demo1 {

	public static void main(String[] args) {
		// prior to java 8
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Before Java8, too much code for too little to do");
			}
		}).start();
		// Java 8 way:
		new Thread(() -> System.out.println("In Java8, Lambda expression rocks !!")).start();

	}
}
