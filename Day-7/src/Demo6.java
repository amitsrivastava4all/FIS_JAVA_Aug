import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo6 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintStream ps = new PrintStream("/Users/amit/Documents/logs/test.txt");
		System.setOut(ps);
		System.out.println("Hello Java");
	}

}
