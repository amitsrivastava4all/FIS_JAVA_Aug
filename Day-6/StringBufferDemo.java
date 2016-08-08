
public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("hello"); // 21=5 Length + 16 Buffer
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("ok");
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("this is test string and it is just to fill the entire string... ");
		//new capacity = old capacity * 2 + 2
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		
		

	}

}
