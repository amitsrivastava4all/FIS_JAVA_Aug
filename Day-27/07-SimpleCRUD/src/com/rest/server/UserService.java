package com.rest.server;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class UserService{



	
	public List<User> getUserAll() throws ClassNotFoundException, SQLException {
		List<User> ls = new ArrayList<User>();
		ls=DataServiceHelper.executeQuery("SELECT * FROM USER");
		return ls;
	}

	
	public List<User> getUser(String name) throws ClassNotFoundException, SQLException{
			
			List<User> als=DataServiceHelper.executeQuery("SELECT * FROM USER "
					+ "where name='"+name+"'" );
			return als;
	}

	public User CreateUser(User user) throws SQLException, ClassNotFoundException {
		System.out.println("Inside Service "+user);
			boolean isAdded = DataServiceHelper.addNewUser(user);
			if(isAdded){
				user.setMessage("Record Added SuccessFully !");
				user.setStatus("SUCCESS");
			}
			else
			{
				user.setMessage("Error in Record Addition");
				user.setStatus("ERROR");
			}
			System.out.println("Inside Service "+user+" isAdded "+isAdded);
			return user;
			
	}
	
	public User deleteUser(User user) throws ClassNotFoundException, SQLException {
			
		
			boolean isDeleted = DataServiceHelper.deleteUser(user);
			if(isDeleted){
				user.setMessage("Record Deleted SuccessFully !");
				user.setStatus("SUCCESS");
			}
			else
			{
				user.setMessage("Error in Record Deletion");
				user.setStatus("ERROR");
			}
		return user;
	}
	public User updateUser(User user) throws ClassNotFoundException, SQLException{
		boolean isUpdated = DataServiceHelper.updateUser(user);
		if(isUpdated){
			user.setMessage("Record Updated SuccessFully !");
			user.setStatus("SUCCESS");
		}
		else
		{
			user.setMessage("Error in Record Updation");
			user.setStatus("ERROR");
		}
		return user;
	}
	

}