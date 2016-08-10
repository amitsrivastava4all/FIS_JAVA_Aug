import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {//throws IOException {
		// TODO Auto-generated method stub
		String sourcePath ="/Users/amit/Documents/FileHandlingTesting/A.mp3";
		
		String targetPath = "/Users/amit/Documents/FileHandlingTesting/B.mp3";
		//String path = "/Users/amit/Documents/JavaBatch_FIS/MyWS/FileHandling/src/ReadFile.java";
		File file = new File(sourcePath);
		if(file.exists()){
			//FileInputStream fi = new FileInputStream(path);
			// OPen File to read
			FileInputStream fi =null;
			FileOutputStream fo = null;
			BufferedInputStream bi = null;
			BufferedOutputStream bo = null;
			try{
			 fi= new FileInputStream(file);
			 bi = new BufferedInputStream(fi);
			 fo = new FileOutputStream(targetPath);
			 bo = new BufferedOutputStream(fo);
			// Read a File
			long startTime = System.currentTimeMillis();
			// int singleByte = fi.read(); // Single Byte Read
			int singleByte = bi.read();
			final int EOF = -1;
			while(singleByte!=EOF){
				//System.out.print((char)singleByte);
				//fo.write(singleByte);  // Write SingleByte in a file
				bo.write(singleByte);
				singleByte = bi.read();
				//singleByte = fi.read();
				
			}
			long endTime = System.currentTimeMillis();
			System.out.println("Copy Done..."+(endTime-startTime)+"ms");
			
			}
			catch(IOException e){
				System.out.println("Unable to read the data from this file"+e);
				
			}
			catch(Exception e){
				System.out.println("Contact to System Admin...");
			}
			// close a file
			finally{
				
				try {
					if(bi!=null){
						bi.close();
					}
						if(fi!=null){
					fi.close();
						}
						if(bo!=null){
							bo.close();
						}
					if(fo!=null){
						fo.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		else
		{
			System.out.println("File Not exist !");
		}
		

	}

}
