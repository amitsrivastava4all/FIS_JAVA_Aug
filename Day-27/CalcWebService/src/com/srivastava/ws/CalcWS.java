package com.srivastava.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalcWS {

	@WebMethod
	public int add(int x, int y){
		if(x>100){
			throw new RuntimeException("X can't be greater than 100");
		}
		return x + y;
	}
	
	@WebMethod
	public int subtract(int x, int y){
		return x - y;
	}
}
