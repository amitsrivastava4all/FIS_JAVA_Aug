package com.srivastava.basics;

import java.sql.SQLException;
import java.util.List;

/*
 * This Service will talk to the DataBase Layer and this will get the result from the Database
 * and this service will create the response and send it back to the WebService
 */
public class CrudService {
	private static CrudService object =null;
	private CrudService(){
		
	}
	// Lazy Singleton
	public static CrudService getInstance(){
		if(object==null){
			object = new CrudService();
		}
		return object;
	}

	public User addNewUser(User userObject) throws ClassNotFoundException, SQLException{
		
		// Now From Here it make Call to the Database Helper
		boolean isRecordAdded = DBHelper.addNewUser(userObject);
		if(isRecordAdded){
			userObject.setMessage("Record is Added");
			userObject.setStatus("SUCCESS");
		}
		else
		{
			userObject.setMessage("Error in Addition of a New Record");
			userObject.setStatus("FAIL");
		}
		return userObject;
	}
	public User deleteUser(User userObject) throws ClassNotFoundException, SQLException{
		// From Here i WIll make a Call to the DataBase Helper
		boolean isRecordDeleted = DBHelper.deleteUser(userObject);
		if(isRecordDeleted){
			userObject.setMessage("Record is Deleted");
			userObject.setStatus("SUCCESS");
		}
		else
		{
			userObject.setMessage("Error in Record Deletion");
			userObject.setStatus("FAIL");
		}
		return userObject;
	}
	public User updateUser(User userObject) throws ClassNotFoundException, SQLException{
		boolean isRecordUpdated = DBHelper.updateUser(userObject);
		if(isRecordUpdated){
			userObject.setMessage("Record is Updated");
			userObject.setStatus("SUCCESS");
		}
		else
		{
			userObject.setMessage("Error in Record Updation");
			userObject.setStatus("FAIL");
		}
		return userObject;
	}
	
	public List<User> searchByUserName(User userObject) throws ClassNotFoundException, SQLException{
		List<User> userList = DBHelper.searchByUserName(userObject);
		return userList;
	}
}
