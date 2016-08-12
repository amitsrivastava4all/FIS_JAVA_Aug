import java.util.HashSet;
class Book
{
	private int id;
	private String name;
	private double price;
	private String category;
	Book(int id , String name, double price,String category){
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
		
				
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString(){
		return "Id "+id +" Name "+ name +" Price "+price+"\n";
	}
	@Override
	public boolean equals(Object o ){
		boolean isEqual = false;
		if(o instanceof Book){
			Book book = (Book)o; // Downcasting
			if(this.id==book.id && 
					this.name.equals(book.name)
					&& this.price==book.price 
					&& this.category.equals(book.category)){
				isEqual = true;
			}
		}
		return isEqual;
	}
	@Override
	public int hashCode(){
		if(this.category.equalsIgnoreCase("programming")){
			return 10;
		}
		else
		{
			return 20;
		}
	}
	
}
public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> songSet = new HashSet<>();
		// Internally Set add is calling Map put
		// Map don't have duplicate keys and set don't have duplicate values
		songSet.add("Bang Bang"); // Add String Object
		// add is going to call hashCode and equals methods which
		// is override inside the String class
		songSet.add("Boom Boom");
		songSet.add("Bang Bang");
		songSet.add("Boom Boom");
		//System.out.println(songSet);
		HashSet<Book> bookSet = new HashSet<>();
		Book java = new Book(1001,"Head First Java",400,"Programming");
		Book java2 = new Book(1001,"Head First Java",400,"Programming");
		bookSet.add(java);
		bookSet.add(java2);
		Book c = new Book(1002,"Let Us C",300,"Programming");
		Book c2 = new Book(1002,"Let Us C",300,"Programming");
		Book iot = new Book(1003,"IOT",500,"hybrid");
		Book iot2 = new Book(1003,"IOT",500,"hybrid");
		bookSet.add(c);
		bookSet.add(c2);
		bookSet.add(iot);
		bookSet.add(iot2);
		System.out.println(java.hashCode());
		System.out.println(java2.hashCode());
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(iot.hashCode());
		System.out.println(iot2.hashCode());
		System.out.println(bookSet);
	}

}
