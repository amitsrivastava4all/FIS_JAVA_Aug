import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
// Logic is Always POJO
class Logic
{
	static int counter;
	static void print(){
		for(int i = 1; i<=5; i++,counter++){
			System.out.println("I is "+i+" and Counter is "+counter
					+" Thread name is "+Thread.currentThread().getName());
			
				
				
			
		}
	}
}
// Step -1 Create a Job
class Job implements Runnable{
	private String sourceFile;
	private String targetFile;
	int counter = 1;
	Job(String sourceFile, String targetFile){
		this.sourceFile = sourceFile;
		this.targetFile = targetFile;
	}
	@Override
	public   void run(){
		System.out.println("Copy Start.... "+Thread.currentThread().getName());
//		FileInputStream fi=null;
//		BufferedInputStream bi = null;
//		FileOutputStream fo =null;
//		BufferedOutputStream bo = null;
//		File file = new File(sourceFile);
//		try{
//		if(file.exists()){
//			fi = new FileInputStream(file);
//			bi = new BufferedInputStream(fi);
//			fo = new FileOutputStream(targetFile,true);
//			bo = new BufferedOutputStream(fo);
//			int singleByte = bi.read();
//			while(singleByte!=-1){
//				bo.write(singleByte);
//				singleByte = bi.read();
//			}
//			
//		}
//		else
//		{
//			System.out.println("Path NotExist "+Thread.currentThread().getName());
//		}
//		}
//		catch(IOException e){
//			System.out.println(e);
//			e.printStackTrace();
//		}
//		finally{
//			try{
//			if(bi!=null){
//				bi.close();
//			}
//			if(bo!=null){
//				bo.close();
//			}
//			if(fi!=null){
//				fi.close();
//			}
//			if(fo!=null){
//				fo.close();
//			}
//			}
//			catch(IOException e){
//				e.printStackTrace();
//			}
//		}
//		for(int i = 1; i<=5; i++){
//			System.out.println("I is "+i+" and "
//					+" Thread name is "+Thread.currentThread().getName());
//			synchronized (this) {
//				System.out.println("Counter is "+counter+" Thread name is "+Thread.currentThread().getName());
//				counter++;
//			}
//		}
//		synchronized (logic) {
//			logic.print();
//		}
//		synchronized (Logic.class) {
//			Logic.print();
//		}
		for(int i = 1; i<=5; i++){
			System.out.println("I is "+i+" and "
					+" Thread name is "+Thread.currentThread().getName()+" "+Thread.currentThread().isAlive()+" "+Thread.currentThread().isDaemon());
			Thread.yield();
			//			try {
//				//Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	//System.out.println("Copy Ends "+Thread.currentThread().getName());
	}
	Logic logic = new Logic();
}
public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Step- 2 Create Job (Runnable) Instance
		Job job1 = 
				new Job("/Users/amit/Documents/FileHandlingTesting/threads/AngularJS.pdf"
						,"/Users/amit/Documents/FileHandlingTesting/threads/AngularCopy.pdf");
		//Job job2 = new Job("/Users/amit/Documents/FileHandlingTesting/threads/A2.pdf","/Users/amit/Documents/FileHandlingTesting/threads/A2Copy.pdf");
		// Step - 3 Create a Worker and Assign a Job
		Thread worker =new Thread(job1,"First");
		Thread worker2 =new Thread(job1,"Second");
		Thread worker3 =new Thread(job1,"Three");
		//worker2.setDaemon(true);
		worker.setPriority(Thread.MAX_PRIORITY);
		worker2.setPriority(Thread.MIN_PRIORITY);
		worker3.setPriority(Thread.NORM_PRIORITY);
		worker.start();
		//worker.join();
		worker2.start();
		worker3.start();

	}

}
