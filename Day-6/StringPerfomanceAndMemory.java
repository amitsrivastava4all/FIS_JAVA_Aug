
public class StringPerfomanceAndMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = null;
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Heap Memory "+r.totalMemory());
		System.out.println("Free Heap "+r.freeMemory());
		System.out.println("Used Heap "+(r.totalMemory() - r.freeMemory()));
		long startTime = System.currentTimeMillis();
		for(int i = 1; i<=100000; i++){
			//a = new String("Hello");
		a ="Hello";
		}
		long endTime =System.currentTimeMillis();
		System.out.println("Total Time Taken "+(endTime-startTime)+"ms");
		System.out.println("Total Heap Memory "+r.totalMemory());
		System.out.println("Free Heap "+r.freeMemory());
		System.out.println("Used Heap "+(r.totalMemory() - r.freeMemory()));

	}

}
