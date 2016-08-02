
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[] = new int[5];
		//int []array = new int[5];
		//int []array = {10,20,30,40,50};
		int [] array = new int[]{10,20,30,40,50,60,70};
//		for(int i = 0 ;i<array.length ; i++){
//			System.out.println(array[i]);
//		}
		// Comes from Java 5 and it is called Enhance For Loop
//		for(int i : array){
//			System.out.println(i);
//		}
		
		//int arr[][] = new int[3][4];
		//int [][]arr = new int[3][4];
		//int []arr[] = new int[3][4];
		int arr[][] = new int[3][];
		arr[0]=new int[10];
		arr[1]=new int[20];
		arr[2]=new int[30];
		System.out.println(arr.length);
		// For One -D
//		for(int i = 0 ; i<arr.length; i++){
//			// For - Nested One D
//			for(int j =0 ; j<arr[i].length; j++){
//				//arr[i][j]=90+j;
//				System.out.print(arr[i][j]+" ");
//				
//			}
//			System.out.println();
//		}
		for(int i[]:arr){
			for(int j : i){
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		// Labeled Loops
		myloop:
		for(int x = 1; x<=3 ; x++){
			for(int y = 1; y<=3 ; y++){
				if(x==y){
					continue myloop;
					//break;
				}
				else
				{
					System.out.println("X is "+x+" and Y is "+y);
				}
			}
		}
	}

}
