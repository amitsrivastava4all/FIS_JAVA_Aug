package com.srivastava.controller;

public class User {
	private String userName;
	private String password;
	private String message;
	private String status;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
		return "User [userName=" + userName + ", password=" + password
				+ ", message=" + message + ", status=" + status + "]";
	}
	
}
