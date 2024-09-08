package com.hashmaphashcode;

import java.util.Objects;

public class Person {
	public int age;
	public String name;
	public String address;
	/*
	public String dob;
	public double salary;
	public int contact;
	*/
	
	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}
	

	
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
}
