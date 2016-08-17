package com.fis.looslycoupled;

import java.util.ResourceBundle;

public class AccountFactory {
private AccountFactory(){
	
}
public static IAccount getAccount(){
	ResourceBundle rb = ResourceBundle.getBundle("object");
	String className= rb.getString("classname");
	IAccount account = null;
	try {
		account =  (IAccount)Class.forName(className).newInstance();
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return account;
	//IAccount account = new Account();
	//return account;
}
}
