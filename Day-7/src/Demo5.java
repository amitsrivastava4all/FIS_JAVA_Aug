import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Scanner;

import org.apache.log4j.Logger;

// UnChecked Exception
//class MinBalanceException extends RuntimeException{
// Checked Exception
class MinBalanceException extends Exception {
	double balance;
	String msg;
	MinBalanceException(double balance){
		this.balance = balance;
	}
	MinBalanceException(double balance,String msg){
		this.balance = balance;
		this.msg = msg;
	}
	public String toString(){
		if(msg==null)
		return "Your Balance is "+balance+"  Less than 5000";
		else
		{
			return msg;
		}
	}
}
class Student{
	private int rollno;
	private String name;
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString(){
		return " Rollno "+rollno +" Name "+name;
	}
	//@Override
//	public int hashCode(){
//		return 10;
//	}
}
public class Demo5 {

	public static void main(String[] args) {
		Logger logger =Logger.getLogger(Demo5.class);
		logger.debug("Inside Main ");
		// TODO Auto-generated method stub
		Student ram = new Student(1001,"Ram");
		Student mike = new Student(1001,"Mike");
		System.out.println(ram);
		System.out.println(ram.toString());
		System.out.println(mike);
		System.out.println(ram.hashCode());
		System.out.println("Enter the Amount to WithDraw");
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();
		double balance= 5000;
		try{
		if((balance - amount)<5000){
			logger.debug("Inside If Condition of Balance "+balance+" and Amount "+amount);
			logger.debug("Remaining Balance is "+(balance-amount));
			throw new MinBalanceException(balance - amount);
		}
		}
		catch(MinBalanceException e){
			
			
			System.out.println(e);  // e.toString()
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			logger.error(sw.toString());
			//e.printStackTrace();
		}
		logger.debug("Inside Main End ");
	}

}
