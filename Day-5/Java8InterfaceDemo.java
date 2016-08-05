interface P
{
	void print(); // public abstract void print();
	// default is a keyword from Java 8 Onwards
	// default is used to define the method body in the interface
	public default void show(){
		System.out.println("P Show Call");
	}
}
interface M
{
	void print();
	public default void show(){
		System.out.println("M Show Call");
	}
}
interface N extends P , M
{
	public default void show(){
		M.super.show();
		P.super.show();
		System.out.println("Thiis is N Show Call");
	}
}
class N1 implements N
{
	public void print(){
		System.out.println("N1 Print Call");
	}
}
public class Java8InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N1 obj = new N1();
		obj.print();
		obj.show();
		

	}

}
