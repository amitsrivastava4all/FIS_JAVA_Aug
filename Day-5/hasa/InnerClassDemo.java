package hasa;


// Method Local Inner Class
class X
{
	void show(){
		int p =999;
		class T
		{
			void print(){
				System.out.println("T Print Call "+p);
				
			}
		}
		T obj = new T();  // Object must be create inside the method
		// the scope of a class within the method
		obj.print();
		//p++;
		System.out.println("P is "+p);
	}
}

// Nested Class
class A
{
	static class B
	{
		static void print(){
			System.out.println("B Static Print Call");
		}
	}
}

// Inner Class
class Outer
{
	int x = 100;  // Outer class Instance Variable
	Outer(){
		System.out.println("OUter Class Cons call");
	}
	// Member of the Outer class
	// private class Inner
	class Inner
	{
		int x =200;  // Inner class Instance Variable
		Inner(){
			int x = 300;  // Local Var
			int z = Outer.this.x + this.x + x;
			System.out.println("Inner Class Cons Call "+z);
		}
		void print(){
			System.out.println("Inner class Print Call");
		}
	}
}
public class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner inner = new Outer().new Inner();
		//Outer outer = new Outer();
		//Outer.Inner inner = outer.new Inner();
		inner.print();
		A.B.print();
		X obj = new X();
		obj.show();
	}

}
