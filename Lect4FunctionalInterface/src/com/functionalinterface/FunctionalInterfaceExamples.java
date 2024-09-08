package com.functionalinterface;



@FunctionalInterface
public interface FunctionalInterfaceExamples {
	
	//public String displayShape();
	
	//public String displayName();
	int displayShape(int length, int breadth);
	
	default String displayName() {
		return "This is his name";
	}
	
	static int displayAge() {
		return 15;
	}
	
	private String displayAddress() {
		return "address";
	}
	


}
