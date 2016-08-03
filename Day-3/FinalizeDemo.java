class Customer
{
	private int id;
	private String name;
	Customer(int id , String name){
		this.id = id;
		this.name = name;
		System.out.println("This is Param Cons Call");
	}
	@Override
	protected void finalize(){
		System.out.println("Good Bye....");
	}
}
public class FinalizeDemo {

	public static void main(String[] args) {
		Customer ram = new Customer(1001,"Ram");
		ram = null; 
		System.gc(); 
		for(int i = 1; i<=10; i++)
		{
			System.out.println("I is "+i);
		}

	}

}
