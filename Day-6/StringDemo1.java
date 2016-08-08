
public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello".intern();
		String b = "Hello".intern();
		String c = new String("Hello");
		if(a==b){
			System.out.println("Same ref of a and b");
		}
		else
		{
			System.out.println("Not Same Ref of a and b");
		}
		if(a==c){
			System.out.println("Same Ref of a and c");
		}
		else{
			System.out.println("Not Same Ref of a and c");
		}
		 a= "ok";
		 if(a==b){
			 System.out.println("Same Ref of a and b");
		 }
		 else
		 {
			 System.out.println("Not Same Ref of a and b");
			 
		 }
		

	}

}
