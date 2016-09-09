package com.rest.server;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
private String userName;
private String userPasswd;
private String status;
private String message;
public User(String userName, String userPasswd) {
this.userName = userName;
this.userPasswd = userPasswd;
}
public User() {
super();
}
public String getUserName() {
return userName;
}
public void setUserName(String userName) {
this.userName = userName;
}
public String getUserPasswd() {
return userPasswd;
}
public void setUserPasswd(String userPasswd) {
this.userPasswd = userPasswd;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "User [userName=" + userName + ", userPasswd=" + userPasswd
			+ ", status=" + status + ", message=" + message + "]";
}



}