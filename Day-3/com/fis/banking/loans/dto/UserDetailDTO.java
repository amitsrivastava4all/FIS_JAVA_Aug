package com.fis.banking.loans.dto;

import java.util.Date;

public class UserDetailDTO {
private String userName;
private String photo;
private Date loginDateTime;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPhoto() {
	return photo;
}
public void setPhoto(String photo) {
	this.photo = photo;
}
public Date getLoginDateTime() {
	return loginDateTime;
}
public void setLoginDateTime(Date loginDateTime) {
	this.loginDateTime = loginDateTime;
}

}
