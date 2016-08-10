import java.util.Scanner;
class K implements Cloneable
{
	int a=10;
	int b = 20;
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
class T
{
	T(){
		System.out.println("I will calll when T Class Object is Created...");
	}
	static
	{
		System.out.println("I will call when T Class is Loaded...");
	}
}
class P
{
	P(){
		System.out.println("I will calll when P Class Object is Created...");
	}
	static
	{
		System.out.println("I will call when P Class is Loaded...");
	}
}
public class ObjectCreationWays {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {
		// TODO Auto-generated method stub
		//T obj = new T();// static code (Eager Way of Deciding the class)
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Class Name");
		String className =scanner.next();
		Class.forName(className).newInstance(); // Lazy Way
		K obj = new K();
		obj.a++;
		obj.b=9090+obj.a;
		K obj2 = (K)obj.clone();
		System.out.println(obj2.a+" "+obj2.b);
		if(obj==obj2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
		
	}

}
