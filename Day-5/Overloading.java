// 1. chance for int
// 2. chance for bigger primitive type
// 3. chance for Same type Wrapper
// 4. chance for var-args
class TypePromotion
{
	void print(byte x){
		System.out.println("byte call");
	}
	void print(short x){
		System.out.println("short call");
	}
//	void print(int x){
//		System.out.println("int call");
//	}
//	void print(float x){
//		System.out.println("float call");
//	}
//	void print(long x){
//		System.out.println("long call");
//	}
//	void print(Integer x){
//		System.out.println("Integer call");
//	}
//	void print(int ...x){
//		System.out.println("int var args call");
//	}
}

class Demo
{
	// Number of Arguments Change
//	int add(int x, int y){
//		return x + y;
//	}
//	int add(int x, int y,int z){
//		return x + y + z;
//	}
	// Var - Args (Java 1.5)
	static int add(int ...x){
		int sum = 0;
		for(int i : x){
			sum = sum + i;
		}
		return sum;
	}
	
}
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Demo.add());
		System.out.println(Demo.add(10));
		System.out.println(Demo.add(10,20));
		System.out.println(Demo.add(10,20,30));
		// Wrapper Class
		int a = 100;  // Primitive Data Type
		Integer b = 200;  // Reference Data Type (Wrapper Class)
		Integer c = 200; 
		// Wrapper type is created for Data Structure (Collection) 
		// Collection only work on objects , it not work on Primitive Data Type
		
		// Integer Pool is till 1 Byte -128 to 127
		if(b==c){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		System.out.println("****************************************");
		TypePromotion t = new TypePromotion();
		//t.print(10);
	
	}

}
