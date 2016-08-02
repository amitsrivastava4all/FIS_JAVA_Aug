import java.util.Scanner;

public class FirstClass {

	public static void main(String[] args) {
		// Scanner is a predefine class 
		// and it acting as a buffer
		// used to store the input data
		// to take input from the user we use System.in
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter the First No");
		int a = scanner.nextInt();
		System.out.println("Enter the Second No");
		int b = scanner.nextInt();
		// TODO Auto-generated method stub
		// Command Line Way
		//int a = Integer.parseInt(args[0]) ;
		//int b = Integer.parseInt(args[1]) ;
		int c =  a + b;
		System.out.println("Sum is  "+c);
		scanner.close();
	

	}

}
