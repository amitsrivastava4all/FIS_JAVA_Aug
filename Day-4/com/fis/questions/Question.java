package com.fis.questions;
//final abstract class T
class T
{
	private final void show(){
		System.out.println("T Show Call");
	}
}
class T2 extends T{
	//@Override
	void show(){
		System.out.println("T2 Show Call");
	}
}
public class Question {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T2 obj = new T2();
		obj.show();

	}

}
