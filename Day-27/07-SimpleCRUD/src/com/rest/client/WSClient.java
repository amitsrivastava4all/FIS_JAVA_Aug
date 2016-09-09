package com.rest.client;

import javax.ws.rs.core.MediaType;

import com.rest.server.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class WSClient {
public static final String USER_URI="http://localhost:9797/07-SimpleCRUD/rest/users/addNewUser";


	public String testGetUsersAll() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(USER_URI);
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).get(
				ClientResponse.class);
		String en = response.getEntity(String.class);
		return en;
	}
	
/*	public String testGetUsers() {
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource resource = client.resource(USER_URI);
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).get(
				ClientResponse.class);
		ClientResponse response = resource.type(MediaType.APPLICATION_JSON).get(
				ClientResponse.class);
		String en = response.getEntity(String.class);
		return en;
	}*/
	
	public String testCreateUser() {
		//System.out.println("User Create Call");
		User user = new User("tttttt", "123");
		String result = null;
		Client client = Client.create();
		WebResource r = client.resource(USER_URI);
		ClientResponse response = r.accept(MediaType.APPLICATION_XML).post(
				ClientResponse.class, user);
		
		result = response.getEntity(String.class);
		return result;
	}
	
	public String testDeleteUser() {
		String result = null;
		User userObject = new User();
		userObject.setUserName("Ram");
		Client client = Client.create();
		WebResource r = client.resource(USER_URI);
		//r.path("delete").delete();
		ClientResponse response = r.accept(MediaType.APPLICATION_XML).delete(
				ClientResponse.class, userObject);
		result = response.getEntity(String.class);
		return result;
	}
	
	public String testPutUser() {
		User u = new User();
		Client client = Client.create();
		User userObject = new User();
		userObject.setUserName("ekta");
		userObject.setUserPasswd("2222");
		WebResource r = client.resource(USER_URI);
		ClientResponse response = r.accept(MediaType.APPLICATION_XML).put(
				ClientResponse.class, userObject);
		String result = response.getEntity(String.class);
		return result;
	}
	
	public static void main(String[] args) {
		//1) run these statements to test @put methods of CRUD
		WSClient client = new WSClient();
		String result=client.testCreateUser();
		//System.out.println("Result is "+result);
		//System.out.println(u);

		//2) run these Statements to test @delete methods of CRUD
		/*String message=user.testDeleteUser("John");
		System.out.println(message);*/
		
		//3)run these Statements to test @get methods of CRUD
		/*WSClient user = new WSClient();
		String name=user.testGetUsers();
		System.out.println(name);*/
		
		//4)run these Statements to test @post methods of CRUD
		/*UserResourceSample user = new UserResourceSample();
		User u=user.testCreateUser();
		System.out.println(u);*/
	}
}