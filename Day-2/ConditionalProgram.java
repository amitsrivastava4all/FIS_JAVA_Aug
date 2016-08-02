
public class ConditionalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =2;
		System.out.println("a>b " +(a>b));
		// if (true)
		//if(a=10){
//		if(a>b){
//			System.out.println("A is Greater");
//		}
//		else
//		{
//			System.out.println("B is Greater");
//		}
		// final is a keyword to define the constants
		// final should be ALL CAPS
		//final int SUNDAY= 1;
		//final int MONDAY = 2;
		//int day  = SUNDAY;
		// Switch Allow int , byte and char 
		String day = "Sunday";  // from Java 7 it Allowed String in Switch case
		switch(day){
		//case SUNDAY :
		case "Sunday":
		System.out.println("Enjoy the Day");
			break;
		case "Monday":
			//case MONDAY :
			System.out.println("Working Day");
			break;
		case "Tuesday":
			//case 3:
			System.out.println("Another Working Day");
			break;
		default:	
			System.out.println("Wrong Day Value");
		}
				

	}

}
