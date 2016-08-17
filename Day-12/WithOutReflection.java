import java.util.Scanner;

class Calculator
{
	Calculator(){
		System.out.println("Standard Calc");
	}
	public int add(int x, int y){
		return x + y;
	}
	public int subtract(int x, int y){
		return x - y;
	}
	public int multiply(int x, int y){
		return x * y;
	}
	public int divide(int x, int y){
		return x / y;
	}
}
public class WithOutReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		System.out.println("Enter the Choice");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice){
		case 1:
			System.out.println("Add "+calc.add(100, 200));
			break;
		case 2:	
			System.out.println("Subtract "+calc.subtract(100, 200));
			break;
		case 3:
			System.out.println("Multiply "+calc.multiply(100, 200));
			break;
		case 4:
			System.out.println("Divide "+calc.divide(100, 200));
			break;
		default:
			System.out.println("Wrong Choice...");
		}
		scanner.close();
	}

}
