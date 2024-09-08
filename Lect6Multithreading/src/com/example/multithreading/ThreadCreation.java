package com.example.multithreading;

public class ThreadCreation  {

	public static void main(String[] args) {
		
		ThreadCreation threadCreation = new ThreadCreation();
		
		MyThread myThread = threadCreation.new MyThread();
		Thread t1 = new Thread(myThread);
		t1.start();
		// TODO Auto-generated method stub

	}
	
	public class MyThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method of Mythread");
		
	}
	}

}
