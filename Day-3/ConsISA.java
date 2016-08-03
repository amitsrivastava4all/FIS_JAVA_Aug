class X
{
	int a ;  // Instance Variable
//	
//	{
//		System.out.println("Pre Cons Call "+a);
//	}
//	X(){
//		a=900;
//		System.out.println("X Class Default Cons Call "+a);
//	}
	X(int a){
		this.a = a; // Assign Local Variable a into Instance Variable a
		System.out.println("X Class param cons Call");
	}
}
class Y extends X
{
	int a ;
	Y(){
		super(111);
		//super(); // It will call parent class default cons
		a = 1000;
		int b =  super.a + this.a;
		System.out.println("Y Class Default Cons Call "+b);
	}
	Y(int a){
		super(99);
		this.a = a ;
		System.out.println("Y Class Param Cons Call");
	}
}
class T
{
	int p ;
	private int getInit(){
		System.out.println("Getting the Data from Cache or DB");
		return 80;
	}
	T()
	{
		int temp = getInit();
		if(temp>0){
			p = temp;
		}
		else
		{
			p = -1;
		}
		System.out.println("I am a Constructor");
	}
	void T(){
		System.out.println("I am a Method");
	}
}
public class ConsISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//X x = new X();
		T obj = new T();
		obj.T();
		
		//Y y = new Y(1000);
	}

}
