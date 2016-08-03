// 1. Weaker Access Rule
// 2. Covariant Return type  //1.5
class A
{
	int x, y,z;
}
class APlus extends A
{
	int m,n,p;
}
class Parent
{
	A print(){
		System.out.println("Parent Class Print Call");
	return new A();	 // x , y, z
	}
}
class Child extends Parent
{
	@Override
	public APlus print(){
		System.out.println("Child Class Print Call");
		return new APlus();
	}
}
public class OverrideRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
