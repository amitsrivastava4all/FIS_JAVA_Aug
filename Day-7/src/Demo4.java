import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/filetestdir/test.txt";
		String data = "This is the sample data to write in a file";
		// Before Java 7
		FileWriter f=null;
		try{
		f = new FileWriter(path);
		f.write(data);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				if(f!=null){
				f.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// this is called try with resource (Java7)
		// Step - 1 Open a File
		try(FileWriter fw = new FileWriter(path)){
			fw.write(data);  // Step -2 Write data in a file
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}

}
