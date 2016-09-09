package com.srivastava.basics;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/crudws")
public class CrudOperationWebService {

	@Path("/adduser")
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public User addUser(User userObject){
		/*User user = null;*/
		// Now this Call will make a call to the Service Layer
		CrudService crudService = CrudService.getInstance();
		try {
			userObject = crudService.addNewUser(userObject);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			userObject.setMessage("Exception Occured "+e);
			userObject.setStatus("ERROR");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			userObject.setMessage("Exception Occured "+e);
			userObject.setStatus("ERROR");
			e.printStackTrace();
		}
		return userObject;
	}
	
	@Path("/deleteuser")
	@DELETE
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public User deleteUser(User userObject){
		// From Here i Make Call to the Service
		
		CrudService crudService = CrudService.getInstance();
		try {
			userObject = crudService.deleteUser(userObject);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			userObject.setMessage("Exception Occured "+e);
			userObject.setStatus("ERROR");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			userObject.setMessage("Exception Occured "+e);
			userObject.setStatus("ERROR");
			e.printStackTrace();
		}
	
		return userObject;
	}
	
	@Path("/updateUser")
	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public User updateUser(User userObject){
		CrudService crudService = CrudService.getInstance();
		try {
			userObject = crudService.updateUser(userObject);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			userObject.setMessage("Exception Occured "+e);
			userObject.setStatus("ERROR");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			userObject.setMessage("Exception Occured "+e);
			userObject.setStatus("ERROR");
			e.printStackTrace();
		}
	return userObject;	
	}
	
	@Path("/getUsers")
	@GET
	//@Consumes(MediaType.APPLICATION_XML)
	@Produces(MediaType.APPLICATION_XML)
	public List<User> searchByUserName(@QueryParam("name") String name){
		List<User> userList = null;
		User userObject = new User();
		userObject.setName(name);
		try {
			userList = CrudService.getInstance().searchByUserName(userObject);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userList;
	}
	
}
