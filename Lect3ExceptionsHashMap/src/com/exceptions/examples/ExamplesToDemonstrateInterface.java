package com.exceptions.examples;

public class ExamplesToDemonstrateInterface implements FirstInterface, SecondInterface{
	
	public static void main(String[] args) {
		ExamplesToDemonstrateInterface obj1 = new ExamplesToDemonstrateInterface();
		obj1.calculate();
		obj1.getNumber();
	}

	@Override
	public void getNumber() {
		// TODO Auto-generated method stub
		System.out.println("inside interface method getNumber");
		
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("inside interface method calculate");
		
	}

}
