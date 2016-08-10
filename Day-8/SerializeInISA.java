import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
// Has - A
class C implements Serializable
{
	int d = 1000;
}
// IS - A
// Case - 1 When Parent is Serializable
// Case-2 When Child is Serializble
class A implements Serializable{
	C c = new C();
	int x ;
	A(){
		x = 100;
		System.out.println("A Class Cons Call "+x);
	}
}
class B extends A //implements Serializable
{
	int y;
	B(){
		y = 200;
		System.out.println("B CLass Cons Call "+y);
	}
	public String toString(){
		return " X is "+x+" and Y is "+y;
	}
}
public class SerializeInISA {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.x=9000;
		obj.y = 10000;
		FileOutputStream fs = new FileOutputStream("/Users/amit/Documents/FileHandlingTesting/mydata.dat");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(obj);
		os.close();
		fs.close();
		System.out.println("Object Store...");
		FileInputStream fi = new FileInputStream("/Users/amit/Documents/FileHandlingTesting/mydata.dat");
		ObjectInputStream oi = new ObjectInputStream(fi);
		B b = (B)oi.readObject();
		System.out.println(b);
		oi.close();
		fi.close();

	}

}
