import java.io.File;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// window slash (\\)
		
		String path = "/Users/amit/Documents/filetestdir/test.txt";
		File file = new File(path);
		try {
			String a = null;
			System.out.println(a.length());
			file.createNewFile();
			System.out.println("File Created...");
			// Be Specific Rule
		} catch (IOException e) {
			System.out.println("File Can't Be Create....");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(NullPointerException e){
			System.out.println("Value is Null Can't give length");
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e){
			System.out.println("Either Divide by Zero or Array Index Out of Bound ");	
		}
		catch(Exception e){
			System.out.println("Contact to System Vendor....");
		}
		

	}

}
