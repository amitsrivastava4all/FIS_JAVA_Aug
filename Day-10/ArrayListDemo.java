import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashtable h;
		TreeMap m ;
		TreeSet hs ;
		ArrayList list1 = new ArrayList(1000);  //0.75f
		System.out.println(list1.size());
		
		Vector v= new Vector();
		
		//System.out.println(v.capacity());
		//System.out.println(v.size());
		//v.ensureCapacity(20);
		for(int i = 1; i<=41; i++){
			v.add(i);
		}
		//System.out.println(v.capacity());
		//System.out.println(v.size());
		
		LinkedList l = new LinkedList();
		
		// CRUD + Search+ Sort
		// Generic (1.5)
		ArrayList<String> list = new ArrayList<>();
		//list.add(20);
		list.add("Hello");
		list.add("ram");
		list.add("Shyam");
		list.add("ok");
		list.remove(0);
		if(list.contains("Ok"))
		{
			System.out.println("Found...");
		}
		else
		{
			System.out.println("Not Found...");
		}
		list.set(0, "hi");
		System.out.println(list);
		Collections.sort(list);
		System.out.println("After Sort "+list);
		// Traverse
		// 1st Way
//		for(int i = 0 ; i<list.size() ; i++){
//			System.out.println(list.get(i));
//		}
		// 2nd Way (One - Way)
//		Iterator<String> i = list.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());  // next will give the current value and then move to the next element
//			//i.remove(); During Traverse Remove Element and it update the Iterator
//			
//		}
		//3rd Way (Two Way)
		System.out.println("*********************");
//		ListIterator<String> i = list.listIterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
//		while(i.hasPrevious()){
//			System.out.println(i.previous());
//		}
		//4th Way (Enhance for loop 1.5)
//		for(String z : list){
//			System.out.println(z);
//		}
		//5th Way ForEach Function  Java 8
		list.forEach((i)->System.out.println(i));
		
		
	}

}
