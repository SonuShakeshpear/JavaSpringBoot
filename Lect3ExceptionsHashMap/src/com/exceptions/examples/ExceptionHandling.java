package com.exceptions.examples;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		try {
		System.out.println("inside try");
		int a=1/0;
		System.out.println(a);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("inside finally block");
		}
		
		int c=15;
		System.out.println("outside try catch block");
		

	}

}
