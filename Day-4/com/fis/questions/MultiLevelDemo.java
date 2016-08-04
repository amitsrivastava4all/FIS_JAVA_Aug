package com.fis.questions;
class Person
{
	int id;
	Person(){
		id = 1001;
		System.out.println("Person Class Cons Call "+id );
	}
	Person(int id ){
		this();
		this.id = id;
		System.out.println("Person Class Param Cons Call "+id);
	}
}
class ITStudent extends Person{
	int id;
	ITStudent(){
		super(1001);
		id = 1002;
		System.out.println("ITStudent Class Cons Call "+id);
	}
	ITStudent(int id){
		this();
		this.id = id;
		System.out.println("ITStudent Class Param Cons Call "+id);
	}
}
class Employee extends ITStudent{
	int id;
	Employee(){
		super(1002);
		id = 1003;
		System.out.println("Employee Class Cons Call "+id);
	}
	Employee(int id){
		this();
		this.id = id;
		System.out.println("Employee Class Param Cons Call "+id);
	}
	public void print(){
		System.out.println("Person Id "+((Person)this).id);
		System.out.println("Student Id "+super.id);
		System.out.println("Employee Id "+this.id);
	}
}
public class MultiLevelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1003);
		emp.print();

	}

}
