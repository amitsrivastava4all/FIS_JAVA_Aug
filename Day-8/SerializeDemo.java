import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double salary;
	private transient String password ;
	private double bonus =1000;
	private double pf = 2000;
	Employee(int id , String name , double salary){
		System.out.println("Cons Call");
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.password="123";
	}
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString(){
		return "Id "+id+" Name "+name + " Salary "+salary+"PF "+pf+"Bonus "+bonus+" Password "+password;
	}
}
public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Employee ram =new Employee(1001,"Ram",9999);
		ram.setSalary(ram.getSalary()+1000);
		String path ="/Users/amit/Documents/FileHandlingTesting/emp.dat";
		FileOutputStream fs = new FileOutputStream(path);
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(ram);
		os.close();
		fs.close();
		System.out.println("Object Store....");
		
		

	}

}
