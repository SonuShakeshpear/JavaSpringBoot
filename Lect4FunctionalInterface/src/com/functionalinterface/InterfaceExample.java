package com.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;

public class InterfaceExample {

	public static void main(String[] args) {
		
		FunctionalInterfaceExamples objExamples = (l,b)->{
			System.out.println("length and breadth are a and b");
		return (l*b);
		};
		System.out.println(objExamples.displayShape(5,5));
		
		System.out.println(objExamples.displayName());
		
		
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4));
		//foreach(n)->System.out.print(n);
		arrayList.forEach((n)->System.out.print(n));
		
		
		
		
		
		// TODO Auto-generated method stub
		
		/*
		FunctionalInterfaceExamples obj = new FunctionalInterfaceExamples() {
			
			@Override
			public String displayShape() {
				// TODO Auto-generated method stub
				return "This is a rectangle";
			}
		};
		
		
		
		System.out.println(obj.displayShape());
 */
	}

	/*
	@Override
	public String displayShape() {
		// TODO Auto-generated method stub
		return null;
	}*/
	

}
