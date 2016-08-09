import java.sql.SQLException;

public class Demo2 {
	static void connectDB() throws SQLException{
		try{
		System.out.println("Open DB Connection...");
		System.out.println("Do Query");
		System.exit(0);
		//return ;
		//throw new SQLException();
		//int e = 100/0;
		}
		finally{
		System.out.println("Close DB Connection");
		}
		}
	static void view(){
		System.out.println("Do Login");
		System.out.println("Call Connect DB");
		try {
			connectDB();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		view();
		

	}

}
