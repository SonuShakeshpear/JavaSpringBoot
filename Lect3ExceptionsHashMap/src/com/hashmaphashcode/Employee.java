package com.hashmaphashcode;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person1 = new Person();
		person1.address = "delhi";
		person1.age=29;
		person1.name = "Sonu";
		
		
		Person person2 =  new Person();
		person2.address = "RAHUL";
		person2.age=29;
		person2.name = "Sonu";
		
		Person person3 = person2;
		//person3.name="R";
		
		System.out.println(person3.equals(person2));
		System.out.println(person3==person2);
		
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		
		
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
		
		
		
		/*
		
		Person person3 =  new Person();
		person3.address = "Shimla";
		person3.age=56;
		person3.name = "Mummy";
		
		System.out.println(person.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());
		
		if(person==person2) {
			System.out.println("address is same");
		}
		else {
			System.out.println("address not same");
		}
		
		
		Person person4 = person3;
		person4.address = "DElhi";
		person4.age=56;
		person4.name = "rewari";
		
		System.out.println(person4.hashCode());
		
		if(person4==person3) {
			System.out.println("address is same");
		}
		else {
			System.out.println("address not same");
		}
		
		if(person4.equals(person3)) {
			System.out.println("values are same");
		}
		else {
			System.out.println("values not same");
		}
		*/
	}

}
