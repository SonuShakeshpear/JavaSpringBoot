package com.example.multithreading;



public class MyThread extends Thread{
	
	public MyThread(boolean isDeposit, Double amount, BankAccount bankAccount) {
		
		this.isDeposit = isDeposit;
		this.amount = amount;
		this.bankAccount = bankAccount;
	}





	private boolean isDeposit;
	private Double amount;
	private BankAccount bankAccount;
	
	
	

	
	@Override
	public void run() {
		System.out.println("Inside run method : MyThread");
		synchronized (this.bankAccount) {
			
		
		if(isDeposit) {
			bankAccount.depositAmount(this.amount);
		}
		else {
			bankAccount.deductBalance(this.amount);
		}
		}
	}
}
