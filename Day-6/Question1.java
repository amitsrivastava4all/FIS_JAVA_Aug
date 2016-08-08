import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String array [] = str.split(" ");
		for(String arr : array){
			String word = String.valueOf(arr.charAt(0)).toUpperCase()
					+ arr.substring(1).toLowerCase();
			System.out.print(word+" ");
		}
		scanner.close();

	}

}
