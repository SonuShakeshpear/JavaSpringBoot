package com.example.multithreading;

public class BankOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	BankAccount bankAccount = new BankAccount(1, "Sonu", 5000.0);
	MyThread t1 = new MyThread(true,  400.0 , bankAccount);
	MyThread t2 = new MyThread(false, 100.0 , bankAccount);
	t1.start();
	t1.join();
	t2.start();
	t2.join();
	System.out.println("Current balance " + bankAccount.getBalance());
	
	
	

	}

}
