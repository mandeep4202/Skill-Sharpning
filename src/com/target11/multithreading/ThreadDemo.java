package com.target11.multithreading;

public class ThreadDemo {

	
	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
	    MyThread myThread= new MyThread();
	    
	    myThread.run();
	    
	    for (int i = 0; i < 10; i++) {
			System.out.println("From Main thread");
				
			}
	    
	}
	
	
}



class MyThread extends Thread{
	
	public void run(){
		for (int i = 0; i < 10; i++) {
		System.out.println("From Child thread");
			
		}
	}
	
	
	public void run(String message){
		for (int i = 0; i < 10; i++) {
		System.out.println("From Child thread");
			
		}
	}
	
}
