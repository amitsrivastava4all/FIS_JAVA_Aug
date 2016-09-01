package com.fis.actions;


public class MyAction {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
// It is Not Mandatory to Build the execute in case of POJO class
// If u build execute then method entry is not necessary in struts.xml file
// method must return string
public String execute(){
	this.setMessage("Hello User , Welcome ");
	return "success";
}
}
