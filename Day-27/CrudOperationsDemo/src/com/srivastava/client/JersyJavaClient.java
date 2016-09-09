package com.srivastava.client;

import java.util.Scanner;

import javax.ws.rs.core.MediaType;

import com.srivastava.basics.User;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JersyJavaClient {
public static String addNewUser(){
	String result = null;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the UserName");
	String name = scanner.nextLine();
	System.out.println("Enter the Password");
	String password = scanner.nextLine();
	User userObject = new User();
	userObject.setName(name);
	userObject.setPassword(password);
	Client client = Client.create();
	WebResource wr = client.resource("http://localhost:9797/CrudOperationsDemo/rest/crudws/adduser");
	ClientResponse response = wr.accept(MediaType.APPLICATION_XML).post(ClientResponse.class,userObject);
	result = response.getEntity(String.class);
	return result;
	
}
public static String deleteUser(){
	String result = null;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the UserName to Delete");
	String name = scanner.nextLine();
	User userObject = new User();
	userObject.setName(name);
	
	Client client = Client.create();
	WebResource wr = client.resource("http://localhost:9797/CrudOperationsDemo/rest/crudws/deleteuser");
	ClientResponse response = wr.accept(MediaType.APPLICATION_XML).delete(ClientResponse.class,userObject);
	result = response.getEntity(String.class);
	return result;
	
}

public static String updateUser(){
	String result = null;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the UserName to Search");
	String name = scanner.nextLine();
	System.out.println("Enter the Password to Update");
	String password = scanner.nextLine();
	User userObject = new User();
	userObject.setName(name);
	userObject.setPassword(password);
	Client client = Client.create();
	WebResource wr = client.resource("http://localhost:9797/CrudOperationsDemo/rest/crudws/updateUser");
	ClientResponse response = wr.accept(MediaType.APPLICATION_XML).put(ClientResponse.class,userObject);
	result = response.getEntity(String.class);
	return result;
	
}

public static String searchByUserName(){
	String result = null;
	/*Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the UserName to Search");
	String name = scanner.nextLine();
	
	User userObject = new User();
	userObject.setName(name);*/
	
	Client client = Client.create();
	WebResource wr = client.resource("http://localhost:9797/CrudOperationsDemo/rest/crudws/getUsers?name=ekta");
	ClientResponse response = wr.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);
	
	result = response.getEntity(String.class);
	return result;
	
}



	public static void main(String[] args) {
		String result = searchByUserName();
		System.out.println("Result is "+result);

	}

}
