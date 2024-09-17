package com.example.Junit.demo_junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PersonDetailsTests {
	
	PersonDetails personDetails;
	
	@Test
	public void addAgeTwoPersonsTest() {
		personDetails = new PersonDetails();
		assertEquals(13,  personDetails.addTwoPersonsAge(7, 6));
		
	}
	
	
	
	@Test
	public void addTwo() {
		personDetails = new PersonDetails();
		assertEquals(200, personDetails.addTwoPersonsAge(112, 88));
	}

}
