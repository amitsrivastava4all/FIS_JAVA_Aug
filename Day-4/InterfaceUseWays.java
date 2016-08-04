// SAM (Single Abstract Method) Interface
@FunctionalInterface
interface Calculator
{
	int calculate(int x, int y);
}
// 1st Way to Use Interface
// Step -1 Create a Class and then implement the interface
class MyCalc implements Calculator
{
	// Step - 2 Override the Abstract method from Interface
	@Override
	public int calculate(int x, int y){
		return x + y;
	}
}
public class InterfaceUseWays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step - 3 Create Object of a class
		Calculator calc =new MyCalc(); // Upcasted Object Create
		int result = calc.calculate(1000, 2000);
		System.out.println("Result is "+result);
		
		// 2nd way to Use Interface
		// Anonymous Way
		// Object Creation + Interface Implement + Override the method + Upcasting
		//class _________ implements Calculator
//		Calculator calObject = new Calculator(){
//			@Override
//			public int calculate(int x, int y){
//				return x - y;
//			}
//		};
//		result = calObject.calculate(90, 30);
//		System.out.println("Anonymous Class Result is "+result);
		//3rd Way to Use Interface
		Calculator c = (x,y)->x-y;
		
		Calculator d = (x,y)->{
			System.out.println("Lambda Expression Code");
			return x*y;
		
		};
		
		System.out.println(d.calculate(90, 2));
		result = c.calculate(90, 30);
		System.out.println("Lambda Result "+result);
		
	}

}
