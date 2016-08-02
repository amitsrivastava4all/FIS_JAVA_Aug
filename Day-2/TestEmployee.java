import javax.sound.midi.Synthesizer;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =90;
		Employee ram = new Employee(1001,"Ram",9999) ; 
		ram.setSalary(ram.getSalary()+ 1000);
		ram.setPhoneNo("2222");
//		ram.id = -1001;
//		ram.name= "Ram";
//		ram.salary=-9999;
		//ram.takeInput(1001, "Ram", -9999);
		ram.print();
		System.out.println("Ram Phone is "+ram.getPhoneNo());
		ram = null;
		if(10>2){
			Employee mike = new Employee();
		}
		Employee tom = new Employee();
		tom = ram;
		// R.H.S Will create a new Object in Heap Memory
		// and once it is created , it assign the address(reference ) to the L.H.S
		// ram is a reference variable
//		System.out.println("Id "+ram.id );  // 2222.id
//		System.out.println("Name "+ram.name);
//		System.out.println("Salary "+ram.salary);
		
		System.out.println("***************************");
		Employee shyam = new Employee(1002,"Shyam",8888);
		shyam.print();
//		System.out.println("Id "+shyam.id );  // 2222.id
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
		

	}

}
