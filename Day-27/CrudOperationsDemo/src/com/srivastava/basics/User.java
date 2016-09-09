package com.srivastava.basics;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private String name;
	private String password;
	private String message;
	private String status;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", message="
				+ message + ", status=" + status + "]";
	}
	
	

}
