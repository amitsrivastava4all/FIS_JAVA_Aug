package com.javawithease.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * This class is used as an action class.
 * @author javawithease
 */
public class TestAction extends ActionSupport {
	private String message;
	
	public String execute(){
		setMessage("execute method is called.");
		return SUCCESS;
	}
	
	public String show(){
		setMessage("show method is called.");
		return SUCCESS;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
