package com.exceptions.examples;

public class CustomExceptionExample {
	
	
	public static void main(String[] args) throws CustomException{
		try {
			int a=1/0;
		} catch (Exception e) {
			// TODO: handle exception
			
			throw new CustomException("this is my own exception");
		}
		
	}

}
