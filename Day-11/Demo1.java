import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// org.postgresql.Driver
		//oracle.jdbc.driver.OracleDriver
		//com.mysql.jdbc.Driver
		// Step - 1 Load the DB Driver (Basically Class Loading)
		boolean isFound = false;
		System.out.println("Enter the Salary to Search");
		Scanner scanner = new Scanner(System.in);
		//10000 or 1=1
		String salary = scanner.nextLine();
		String driverName = "com.mysql.jdbc.Driver";
		String dburl = "jdbc:mysql://localhost:3306/amit";
		String userid="root";
		String password="amit123456";
		Class.forName(driverName);
		Connection con   = null;
		// Step -2 Create Connection
		con = DriverManager.getConnection(dburl,userid,password);
//		if(con!=null){
//			System.out.println("Connection Created...");
//		}
		// Step - 3 Do Query
		// PreparedStatement - Prevent SQL Injection + Query Cache
		PreparedStatement pstmt = con.prepareStatement("select id, name ,salary,city from emp_mst where salary>=? and name=?");
		pstmt.setDouble(1, Double.parseDouble(salary));
		String name = "Ram or 1=1";
		pstmt.setString(2, name);
		//Statement stmt = con.createStatement();
		// Step - 4 Execute the Query and Get the result
		ResultSet rs = pstmt.executeQuery();
		//ResultSet rs = stmt.executeQuery("select id , name , salary ,city from emp_mst where salary>="+salary);
		// Step -5 Traverse the ResultSet
		while(rs.next()){
			isFound = true;
			System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getDouble("salary")+" "+rs.getString("city"));
		}
		if(!isFound){
			System.out.println("NO Record Found..");
		}
		// Step -6 close the resources
		rs.close();
		pstmt.close();
		//stmt.close();
		con.close();
		
		

	}

}
