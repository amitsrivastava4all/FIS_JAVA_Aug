import static java.lang.System.out;
//class T1
//{
//	void print(){
//		
//	}
//}
//class T2 extends T1
//{
//	@Override
//	void print(){
//		
//	}
//}
interface ValidationUtility{
//class ValidationUtility
//{
	//private ValidationUtility(){}
	public static boolean isBlank(String value){
		if(value!=null && value.trim().length()>0){
			return false;
		}
		else
		{
			return true;
		}
	}
}

class CashCustomer
{
	// Non - Static 
	private int id;  // Instance variables
	// Memory Created When Object (Instance) is Created (Lazy Loading)
	private String name;
	private double balance;
	private static String companyName; // Class Variables
	// static will come when class is loaded (EAGER Loading)
	// static block is used to initialize the static variables
	// static block will be called only When class is Loaded..
	static{
		companyName = "FlipKart";
		System.out.println("I Will Call Only Once When Class is Loaded...");
	}
	CashCustomer(int id, String name , double balance){
		this.id = id;
		this.name  = name;
		this.balance = balance;
		System.out.println("I Will Call Each Time Object is Created...");
	}
	
}
public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System s = new System();
		//s.out.println();
		out.println();
		CashCustomer ram = new CashCustomer(1001,"Ram",9999);
		CashCustomer shyam = new CashCustomer(1002,"Shyam",3333);
		String name = "   ";
		//ValidationUtility v = new ValidationUtility();
		if(!ValidationUtility.isBlank(name)){
		//if(!v.isBlank(name)){
			System.out.println("Welcome "+name);
		}
		else
		{
			System.out.println("Name Can't be Blank");
		}
	}

}
