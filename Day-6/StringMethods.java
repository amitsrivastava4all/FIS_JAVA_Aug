import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		System.out.println("A Length "+a.length());
		System.out.println(" Upper Case "+a.toUpperCase());
		System.out.println("After Upper Case "+a);
		System.out.println(" Get Single Char "+a.charAt(0));
		String b = "      Amit     Srivastava     ";
		System.out.println(" Trim  ["+b.trim()+"]"); // Remove Leading and Trailing Spaces
		System.out.println("SubString "+a.substring(1));
		System.out.println("SubString "+a.substring(2, 3));
		System.out.println("IndexOf "+a.indexOf("e"));
		System.out.println("LastIndexOf "+a.lastIndexOf("l"));
		String address = "A-1, Shakti Nagar , Delhi-7";
		System.out.println("Split "+address.split(",")[0]);	
		System.out.println(" Bytes  "+address.getBytes());
		char array[] = address.toCharArray();  // String convert into char array
		Arrays.sort(array);  // Sort on Char Array
		String d =new String(array); //Convert char array into String
		System.out.println("After Sort "+d);
		String x = "Hello";
		String y = "hello";
		// equals is case -sensitive
		if(x.equals(y)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		if(x.equalsIgnoreCase(y)){
			System.out.println("Same Value");
		}
		else
		{
			System.out.println("Not Same Value");
		}
		int z = x.compareTo("ram");
		System.out.println("z is "+z);
		String temp = "hello";
		temp = temp.concat("ram").concat("kumar");
		temp = temp + "ram"+"kumar";
		boolean result = temp.endsWith("kumar");
		result = temp.startsWith("hello");
		result =temp.isEmpty();
		temp = temp.replace('l', 'w');
		System.out.println("Temp is "+temp);
	}

}
