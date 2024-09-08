package com.exceptions.examples;

import java.security.PublicKey;

public class NestedExceptionExamples {

	public static void main(String[] args) {
		try {
			A();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		System.out.println("inside main method");
		// TODO Auto-generated method stub

	}

	public static void B() {
		try {
			C();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		System.out.println("inside b method");
	}
	public static void C() {
		try {
			int a=1/0;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		System.out.println("inside c method");
	}
	public static void A() {
		try {
			B();
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
		
		System.out.println("inside a method");
	}
}
