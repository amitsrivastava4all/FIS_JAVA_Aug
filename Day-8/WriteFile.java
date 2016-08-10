import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "/Users/amit/Documents/FileHandlingTesting/Test12.txt";
		String data = "This is the sample data to write in a file";
		// Specify Path
		boolean appendMode = true;
		FileOutputStream fs = new FileOutputStream(path,appendMode);
		// Write Bytes in a file
		fs.write(data.getBytes());
		// close a file
		fs.close();
		System.out.println("File Data Store...");
		

	}

}
