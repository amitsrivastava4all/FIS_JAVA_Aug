package com.fis.questions;
// POJO  - Plain Old Java Object
public class Student {
	private int id;
	private String name;
	private int english;
	private int math;
	private int hindi;
	
	Student(int id , String name){
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	
	public int getTotalMarks(){
		return getEnglish() + getMath() + getHindi();
	}
	
	public double getPercentage(){
		return getTotalMarks() / 3;
	}
	
	public String getGrade(){
		return getPercentage()>=90 ?"A Grade ":"B Grade";
	}
	
	public void printReport(){
		System.out.println("Id "+getId());
		System.out.println("Name "+getName());
		System.out.println("English "+getEnglish());
		System.out.println("Math "+getMath());
		System.out.println("Hindi "+getHindi());
		System.out.println("Total Marks "+getTotalMarks());
		System.out.println("Percentage "+getPercentage());
		System.out.println("Grade "+getGrade());
	}
	

}
