package com.srivastava.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


@WebServlet("/MyUserController")
public class MyUserController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("username");
		String password = request.getParameter("password");
		String actionName = request.getParameter("bt");
		PrintWriter out = response.getWriter();
		if(actionName.equalsIgnoreCase("AddUser")){
			// 1. URL of WebService 
			//2. Connect to the URL
			// 3. The Data JSON Format and Post it to the WebService
			// 4. To get the Result from the Server which again a JSON Format result
			// Make Connection and Send the Request Values in the JSON Format
			URL url = new URL("http://localhost:8080/CrudWSAppDemo/rest/crudwsapp/addnewuserforweb");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoOutput(true);
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			Gson gson = new Gson();
			String jsonString = gson.toJson(user);
			System.out.println("User JSON String is "+jsonString);
			OutputStream os = con.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();
			
			// For Taking the Response Data
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String result = "";
			while((result=br.readLine())!=null){
				sb.append(result);
			}
			// JSON Response Convert into Java Object
			User userObject = gson.fromJson(sb.toString(), User.class);
			out.println(userObject.getMessage());
			con.disconnect();
			
			
		}
		else
		if(actionName.equalsIgnoreCase("DeleteUser")){
			URL url = new URL("http://localhost:9797/CrudWSAppDemo/rest/crudwsapp/deleteUserforweb");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoOutput(true);
			con.setRequestMethod("DELETE");
			con.setRequestProperty("Content-Type", "application/json");
			User user = new User();
			user.setUserName(userName);
			/*user.setPassword(password);*/
			Gson gson = new Gson();
			String jsonString = gson.toJson(user);
			System.out.println("User JSON String is "+jsonString);
			OutputStream os = con.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();
			
			// For Taking the Response Data
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String result = "";
			while((result=br.readLine())!=null){
				sb.append(result);
			}
			// JSON Response Convert into Java Object
			User userObject = gson.fromJson(sb.toString(), User.class);
			out.println(userObject.getMessage());
			con.disconnect();
			
		}
		else
		if(actionName.equalsIgnoreCase("UpdateUser")){
			URL url = new URL("http://localhost:9797/CrudWSAppDemo/rest/crudwsapp/updateUserforweb");
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoOutput(true);
			con.setRequestMethod("PUT");
			con.setRequestProperty("Content-Type", "application/json");
			User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			Gson gson = new Gson();
			String jsonString = gson.toJson(user);
			System.out.println("User JSON String is "+jsonString);
			OutputStream os = con.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();
			
			// For Taking the Response Data
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String result = "";
			while((result=br.readLine())!=null){
				sb.append(result);
			}
			// JSON Response Convert into Java Object
			User userObject = gson.fromJson(sb.toString(), User.class);
			out.println(userObject.getMessage());
			con.disconnect();
		
		}
		else
		if(actionName.equalsIgnoreCase("SearchUser")){
			URL url = new URL("http://localhost:9797/CrudWSAppDemo/rest/crudwsapp/searchUserforweb?username="+userName);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			con.setDoOutput(true);
			con.setRequestMethod("GET");
			con.setRequestProperty("Content-Type", "application/json");
			/*User user = new User();
			user.setUserName(userName);
			user.setPassword(password);
			Gson gson = new Gson();*/
		/*	String jsonString = gson.toJson(user);
			System.out.println("User JSON String is "+jsonString);
			OutputStream os = con.getOutputStream();
			os.write(jsonString.getBytes());
			os.flush();*/
			
			// For Taking the Response Data
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			StringBuilder sb = new StringBuilder();
			String result = "";
			while((result=br.readLine())!=null){
				sb.append(result);
			}
			// JSON Response Convert into Java Object
			Gson gson = new Gson();
			ArrayList userList = gson.fromJson(sb.toString(), ArrayList.class);
			out.println(userList);
			con.disconnect();		
		}
	}

}
