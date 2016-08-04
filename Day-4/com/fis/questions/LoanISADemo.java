package com.fis.questions;

abstract class Loan
{
	public abstract double calculateEmi();
	public abstract int computeCreditScore();
	public final boolean applyForLoan(){
		System.out.println("Common Method Apply For Loan....");
		return true;
	}
	{
		System.out.println("This is Loan Init Block");
	}
	Loan(){
		System.out.println("Loan Class Default Constructor");
	}
	Loan(int accountNo){
		this(); // now it is calling own class default cons 
		System.out.println("Loan Param Cons Call");
	}
}
class HomeLoan extends Loan
{
	{
		System.out.println("Home Loan Init Block");
	}
	
	HomeLoan(){
		super(1999);
		System.out.println("This is Homeloan Default Cons");
	}
	
	HomeLoan(int amount){
		this();
		System.out.println("This is HomeLOan Param Cons Call");
	}

	@Override
	public double calculateEmi() {
		// TODO Auto-generated method stub
		return 9000;
	}

	@Override
	public int computeCreditScore() {
		// TODO Auto-generated method stub
		return 90;
	}
	
}
class AutoLoan extends Loan
{

	{
		System.out.println("This is AutoLoan init Block");
	}
	
	AutoLoan(){
		super(1000); // now it is call parent class param cons call
		System.out.println("This is AutoLoan Default Cons Call");
	}
	
	AutoLoan(int balance){
		this();  // it will call own class default cons
		System.out.println("This is AutoLoan Param Cons Call");
	}
	
	@Override
	public double calculateEmi() {
		// TODO Auto-generated method stub
		return 7000;
	}

	@Override
	public int computeCreditScore() {
		// TODO Auto-generated method stub
		return 70;
	}
	
}
class LoanCaller{
	public void callLoan(Loan loan){
		loan.applyForLoan();
		System.out.println("Loan EMI "+loan.calculateEmi());
		System.out.println("Loan Score "+loan.computeCreditScore());
		
	}
}
public class LoanISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoanCaller loanCaller = new LoanCaller();
		loanCaller.callLoan(new HomeLoan(999));
		System.out.println("**************************");
		loanCaller.callLoan(new AutoLoan(111));

	}

}
