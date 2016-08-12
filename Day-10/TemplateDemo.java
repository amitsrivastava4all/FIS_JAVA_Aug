import java.util.ArrayList;
import java.util.HashMap;

class Stack<T ,E extends Number> {
	ArrayList<T> list = new ArrayList<>();
	HashMap<T,E> map = new HashMap<>();
	public void push(T key, E value){
		map.put(key, value);
	}
	public void mappeep(){
		System.out.println(map);
	}
	public void push(T data){
		list.add(data);
	}
	public void pop(){
		if(list.size()>0){
			list.remove(list.size()-1);
		}
	}
	public void peep(){
		for(int i = list.size()-1 ; i>=0; i--){
			System.out.println(list.get(i));
		}
	}
}



//class Stack<T extends Serializable,T2>{
//	ArrayList<T> data= new ArrayList<>();;
//	Map<T,T2> map = new HashMap<>();
//	
//	void push(T value, T2 value2){
//		data.add(value);
//		map.put(value, value2);
//	}
//	void peep(){
//		System.out.println("Map is "+map);
//		for(int i = data.size()-1; i>=0; i--){
//			System.out.println(data.get(i));
//		}
//	}
//}
public class TemplateDemo {

	public static void main(String[] args) {
//		Stack<String> stack = new Stack<>();
//		stack.push("ram");
//		stack.push("mike");
//		stack.peep();
//		stack.pop();
//		stack.peep();
		System.out.println("This is Another Stack....");
//		Stack<Integer> stack2 = new Stack<>();
//		stack2.push(1000);
//		stack2.push(2000);
//		stack2.peep();
//		stack2.pop();
//		stack2.peep();
//		
		Stack<String,Integer> stack = new Stack<>();
		stack.push("amit", 22222);
		stack.push("ram", 22222);
		stack.mappeep();
		//Stack<String,Double> stack1 = new Stack<>();
		//stack1.push("hello", 90.20);
		//Stack<String> stack2 = new Stack<String>();
		//stack.push(10);
		//stack.push(20);
		//stack.push("Hello");
		//stack1.peep();

	}

}