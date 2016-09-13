package com.srivastava.servicelocator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import com.google.gson.Gson;
import com.srivastava.app.constants.ApplicationConstants;
import com.srivastava.model.Employee;

public class WebServiceServiceLocator {
	public static List<Employee> getEmployees(Employee employee) throws IOException{
		URL url = new URL(ApplicationConstants.SEARCH_URL);
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setDoOutput(true);
		con.setRequestMethod("POST");
		con.setRequestProperty("Content-Type", "application/json");
		
		
		Gson gson = new Gson();
		String jsonString = gson.toJson(employee);
		System.out.println("Employee JSON String is "+jsonString);
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
		List<Employee> empList = gson.fromJson(sb.toString(), List.class);
		//out.println(userObject.getMessage());
		con.disconnect();
		System.out.println("Employee List is "+empList);
		return empList;
	}

}
