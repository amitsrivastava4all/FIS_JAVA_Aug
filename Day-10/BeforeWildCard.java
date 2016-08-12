import java.io.Serializable;
import java.util.ArrayList;

class X implements Serializable
{
	
}
class Y extends X
{
	
}
class Z extends X
{
	
}
class T{
	
}
public class BeforeWildCard {
	static void print(X[] x){
		System.out.println("Simple Array "+x);
	}
	//static void print(ArrayList<X> list){
	//static void print(ArrayList<Object> list){
	//static void print(ArrayList<?> list){
	//static void print(ArrayList<? super X> list){
	//static void print(ArrayList<? extends X> list){
	static void print(ArrayList<? extends Serializable> list){
	System.out.println(list);	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l = new ArrayList(); // Not Generic
		ArrayList<String> l2 = new ArrayList<>(); // Generic 
		ArrayList<X> xList = new ArrayList<>();
		print(xList);
		ArrayList<Y> yList = new ArrayList<>();
		print(yList);
		ArrayList<T> tList = new ArrayList<>();
		//print(tList);
		X x[] = new X[10];
		Y y[] = new Y[10];
		print(x);
		print(y);
	}

}
