package com.exceptions.examples;

import java.io.FileNotFoundException;

public class CheckException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			A();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("inside main method");

	}
	
	static void A() throws FileNotFoundException {
		try {
			int i=1/0;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}

}
