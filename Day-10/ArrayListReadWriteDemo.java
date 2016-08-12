import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListReadWriteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> l = new ArrayList<>();
		CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>();
		
		l.add(10); // Autoboxing
		l.add(20);
		for(int i : l){
			System.out.println(i);  // read
			l.add(i*2);  // write
		}
		System.out.println("After Add "+l);
		ArrayList<String> l2 = new ArrayList<>();
		List<String> l3 = Collections.synchronizedList(l2);
		//Collections.synchronizedMap(m)
		
		
		

	}

}
