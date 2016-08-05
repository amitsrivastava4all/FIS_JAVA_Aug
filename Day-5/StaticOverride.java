class Parent1
{
	static void print(){
		System.out.println("Parent1 Print Call");
	}
	
}
class Child1 extends Parent1
{
	//@Override
	static void print(){
		System.out.println("Child1 Print Call");
	}
}
public class StaticOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent1 obj = new Child1();
		Child1 obj = new Child1();
		obj.print();

	}

}
