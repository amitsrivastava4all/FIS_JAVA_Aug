// The Functionality of a Employee
// OOAD
// S O L I D
// S - SRP (Single Resp Pr )
// D - Dry
// Encapsulation
// Gud Encapsulation = private Member Variables + public methods
public class Employee {
	
	private int id;  // Data Members of a class
	private String name;
	private double salary;
	private String companyName;
	private String address;
	private String email;
	private String gender;
	private String phoneNo;
	private String pinCode;
	
	
	// this is the default constructor 
	// so if your class doesn;t have any constructor it has default cons by default
	// and it is empty by default
	// and we can rewrite it
	Employee(){
		companyName = "FIS";
	}
	
	Employee(int id , String name , double salary){
		//Employee();
		this(); // here it calling the default constructor 
		if(id>0 && salary>0){
		this.id = id + companyName.length();
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid id or salary");
		}
	}
	
//	public void takeInput(int id , String name, double salary){
//		if(id>0 && salary>0){
//		this.id = id;
//		this.name =name;
//		this.salary =salary;
//		}
//		else
//		{
//			System.out.println("invalid id or salary");
//		}
//		
//	}
	public void print(){
		// this - it is a keyword and it hold the current reference
		System.out.println("Id "+this.id );  // 2222.id
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("Company Name "+companyName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public int getId() {
		return id;
	}
	
	

}
