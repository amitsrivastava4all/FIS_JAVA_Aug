
public class StringBufferMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder(100);
		//StringBuffer sb = new StringBuffer(100);
		System.out.println("Length "+sb.length());
		System.out.println("Capacity "+sb.capacity());
		sb.ensureCapacity(200);
		System.out.println("Length "+sb.length());
		System.out.println("Capacity "+sb.capacity());
		sb.append("hello");
		System.out.println("After Append is "+sb);
		sb.insert(0, "Hi");
		System.out.println("After Insert is "+sb);
		sb.deleteCharAt(0); // Remove Single char
		sb.delete(2, 5); // Remove Multiple Char (2 is Index and 5 is Position)
		sb.reverse();
		sb.trimToSize();
		System.out.println("Length "+sb.length());
		System.out.println("Capacity "+sb.capacity());
		
		
		

	}

}
