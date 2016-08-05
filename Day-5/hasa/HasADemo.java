package hasa;
// Composition 
//class Customer
//{
//	Order order;
//	Customer(){
//		System.out.println("Customer Born.....");
//		order = new Order();
//	}
//	// finalize will call when object is garbage collected
//	@Override
//	protected void finalize(){
//		System.out.println("Customer Gone....");
//	}
//}
//class Order{
//	Order(){
//		System.out.println("Order Born....");
//	}
//	@Override
//	protected void finalize(){
//		System.out.println("Order Gone....");
//	}
//}

//Aggegration
class Customer
{
	Order order;
	Customer(Order order){
		System.out.println("Customer Born.....");
		this.order = order;
		//order = new Order();
	}
	// finalize will call when object is garbage collected
	@Override
	protected void finalize(){
		System.out.println("Customer Gone....");
	}
}
class Order{
	Order(){
		System.out.println("Order Born....");
	}
	@Override
	protected void finalize(){
		System.out.println("Order Gone....");
	}
}
public class HasADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order();  // Order Create
		Customer ram = new Customer(order);  // Order Assign to Customer
		ram = null;
		System.gc(); // Requesting to Garbage Collector , Plz run
		for(int i = 1; i<=10; i++){
			System.out.println("I is "+i);
		}
	}

}
