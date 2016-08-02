import java.util.ArrayList;

public class TestMemory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		System.out.println("Program Start");
		while(true){
			Employee x = new Employee(1001,"X",9999);
			list.add(x);
			Thread.sleep(50);
		}

	}

}
