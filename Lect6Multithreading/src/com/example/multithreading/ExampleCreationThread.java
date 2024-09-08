package com.example.multithreading;

public class ExampleCreationThread implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.out.println("Inisde main method : "+  Thread.currentThread());
		
		ExampleCreationThread exampleCreationThread = new ExampleCreationThread();
		Thread t1 = new Thread(exampleCreationThread);
		t1.setPriority(1);
		t1.sleep(15000);
		//t1.start();
		//t1.start();
		//t1.run();
		
		Thread t2 = new Thread(exampleCreationThread);
		t2.setPriority(9);
		t2.run();
		t1.start();
		t1.sleep(1500);
		
		
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run method of Thread creation class" + Thread.currentThread());
		System.out.println("memory "+ Runtime.getRuntime().totalMemory());
		System.out.println("thread priority is" + Thread.currentThread().getPriority());
		
	}

}
