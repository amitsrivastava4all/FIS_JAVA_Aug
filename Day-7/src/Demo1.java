import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {
	static int firstNo;
	static int secondNo;
	static int result;
	static Scanner scanner = new Scanner(System.in);
static void takeFirstNumber(){
	try{
	System.out.println("Enter the First No");
	firstNo = scanner.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("Only Number Allowed U Enter Something else");
		scanner.nextLine();
		takeFirstNumber();
	}
}
static void takeSecondNumber(){
	try{
	System.out.println("Enter the Second No");
	secondNo = scanner.nextInt();
	}
	catch(InputMismatchException e){
		System.out.println("Only Number Allowed U Enter Something else");
		scanner.nextLine();
		takeSecondNumber();
	}
}
static void doOperation(){
	
	try{
		 result = firstNo/ secondNo;
		}
		catch(ArithmeticException e){
			System.out.println("U can't Divide a Number with Zero "+e);
			e.printStackTrace();
			takeSecondNumber();
			doOperation();
			
		}
		
}
	public static void main(String[] args) {
		
		
//		System.out.println("Enter the First No");
//		try{
//		 firstNo = scanner.nextInt(); // throw new InputMisMatchException();
//		}
//		catch(InputMismatchException e){
//			System.out.println("Only Number Allowed U Enter Something else");
//			System.out.println("Enter the First NO");
//			scanner.nextLine();
//			firstNo = scanner.nextInt();
//		}
//		System.out.println("Enter the Second No");
//		int secondNo = scanner.nextInt();
		takeFirstNumber();
		takeSecondNumber();
		doOperation();
		System.out.println("Result is "+result);
		scanner.close();
		
	}

}
