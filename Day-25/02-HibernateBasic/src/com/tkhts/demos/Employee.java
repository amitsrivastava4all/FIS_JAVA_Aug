package com.tkhts.demos;

public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	private int age;
	
	public Employee(){
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(String firstName, String lastName, int salary, int age){
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

}
