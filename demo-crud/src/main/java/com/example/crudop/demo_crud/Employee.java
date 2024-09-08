package com.example.crudop.demo_crud;



import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class Employee {
	
	public Employee() {
		
	}
	
	public Employee(int id, int age, String name, String designation, String gender, String email) {
		//super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.email = email;
	}
	
	@NotNull
	private int id;
	@Min(18)
	@Max(50)
	private int age;
	private String name;
	private String designation;
	@NotNull
	private String gender;
	@Email
	private String email;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
