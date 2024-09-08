package com.example.multithreading;

public class BankAccount {
	public BankAccount(int id, String name, Double balance) {
		
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	private int id;
	private String name;
	private Double balance;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
    public void depositAmount(Double amount) {
    	this.balance+= amount;
    }
    
    public void deductBalance(Double amount) {
    	this.balance-=amount;
    	
    }
}
