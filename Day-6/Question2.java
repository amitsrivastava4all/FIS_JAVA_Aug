import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input:abcghjtabaghthacbtac
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scanner.next();
		char array [] = str.toCharArray();
		Arrays.sort(array);
		String sortedStr  = new String(array); 
		System.out.println(sortedStr);
		scanner.close();

	}

}
