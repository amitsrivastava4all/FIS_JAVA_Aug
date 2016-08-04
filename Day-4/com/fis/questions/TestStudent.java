package com.fis.questions;

import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Id ");
		int id = scanner.nextInt();
		System.out.println("Enter the Name");
		String name = scanner.next();
		Student student = new Student(id,name);
		System.out.println("Enter the English Marks");
		int english  = scanner.nextInt();
		System.out.println("Enter the Hindi Marks");
		int hindi = scanner.nextInt();
		System.out.println("Enter the Math Marks");
		int math = scanner.nextInt();
		student.setEnglish(english);
		student.setHindi(hindi);
		student.setMath(math);
		student.printReport();
		scanner.close();
	}

}
