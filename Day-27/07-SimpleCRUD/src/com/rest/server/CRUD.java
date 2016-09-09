package com.rest.server;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
@Path("/users")
public class CRUD {
	@GET
	@Path("/getAll")
	@Produces (MediaType.APPLICATION_XML)
	public List<User> getUsersAll() {
			List<User> als=null;
			try {
				UserService userService = new UserService();
				als= userService.getUserAll();
			} catch (ClassNotFoundException e) {
				e.printStackTrace(); } 
			catch (SQLException e) {
				e.printStackTrace(); }
			return als;
		}
	@GET
	@Path("/getAllJSON")
	@Produces (MediaType.APPLICATION_JSON)
	public List<User> getJsonUsersAll() {
			List<User> als=null;
			try {
				UserService userService = new UserService();
				als= userService.getUserAll(); //Calling UserService 
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return als;
		}
	
	
	
	@POST
	@Path("/addNewUser")
	@Consumes (MediaType.APPLICATION_XML)
	@Produces (MediaType.TEXT_HTML)
	
	public String createUser(User user){
		User userObject=null;
	try {
	UserService userService = new UserService();
	
	userObject = userService.CreateUser(user);
	} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	System.out.println("User Object in the Service "+userObject);
	return "record added";
	}
	
	
	@Path("/deleteUser")
	  @DELETE
	  @Produces(MediaType.APPLICATION_XML)
	  @Consumes(MediaType.APPLICATION_XML)	
	  public User deleteUser(User userObject) {
		User user = null;
		 try {
			UserService userService = new UserService();
			user = userService.deleteUser(userObject);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 return user;
	  }
	
	@Path("/updateUser")
	@PUT
	@Consumes (MediaType.APPLICATION_XML)
	@Produces (MediaType.APPLICATION_XML)
	public User putUser(User user){
		User u = null;
		
		
		try {
			UserService userService = new UserService();
			u=userService.updateUser(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
	}
	/*
	
	
	

	
	//run http://localhost:8080/FirstRestApp/users/user/preeti
	@Path("/user/{username}")
	@GET
	@Produces ("application/xml")
	public List<User> getUser(@PathParam("username") String username) {
		List<User> asl=null;
		try {
			asl= UserService.getInstance().getUser(username);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return asl;
	}

	*/
	
	/*@Path("/delete")
	  @DELETE
	  @Produces(MediaType.APPLICATION_XML)
	  @Consumes(MediaType.APPLICATION_XML)	
	  public User deleteUser(User userObject) {
		User user = null;
		 try {
			UserService userService = new UserService();
			user = userService.deleteUser(userObject);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
		 return user;
	  }
	  

	  @PUT
	  @Consumes(MediaType.APPLICATION_XML)
	  public Response putTodo(User user) {
	   Response res=null;
	   
	    return  res;
	  }*/
	  
	 
	  
}
