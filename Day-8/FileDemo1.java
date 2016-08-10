import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Date;
class MyFilter implements FilenameFilter{

	@Override
	public boolean accept(File path, String filename) {
		//System.out.println(path.getPath()+" "+filename);
		return filename.endsWith(".txt");
		//return true;
	}
	
}
public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//String path = "/Users/amit/Documents/logs/a/b/c/d/e.txt";
		String path = "/Users/amit/Documents/FileHandlingTesting";
		File file =new File(path);
		MyFilter filter = new MyFilter();
		File files [] = file.listFiles(filter);
		int dirCount = 0;
		int fileCount =0;
		int hiddenCount = 0;
		int readCount = 0;
		for(File f : files){
			
			if(f.isDirectory()){
				dirCount++;
			}
			else
			if(f.isFile()){	
				Date date = new Date(f.lastModified());  // Convert Time and Date in Ms to Date
				System.out.println("File Name "+f.getName()+" Last Modified Time  "+date);
				if(f.isHidden()){
					hiddenCount++;
				}
				else
				if(!f.canWrite()){	
					readCount++;
				}
				fileCount++;
			}
			//f.renameTo(new File(path+"/virus"+fileCount+".found"));
			//f.delete();
		}
		System.out.println("Total Files are "+fileCount);
		System.out.println("Total Dirs are "+dirCount);
		System.out.println("Total Hidden File are "+hiddenCount);
		System.out.println("Total Read Only Files are "+readCount);
		//String files[] = file.list();
//		for(String f : files){
//			System.out.println(f);
//		}
//		if(file.exists()){
//			file.delete();
//			System.out.println("File Deleted....");
//		}
//		else
//		{
//			file.createNewFile();
//			System.out.println("File Created...");
//		}
		//file.mkdirs();  // Nested Dir
		//file.mkdir(); // Single Dir
		//System.out.println("Create Dir");

	}

}
