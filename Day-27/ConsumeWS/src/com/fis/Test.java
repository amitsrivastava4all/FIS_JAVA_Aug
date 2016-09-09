package com.fis;

import com.srivastava.ws.CalcWSService;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcWSService obj = new CalcWSService();
		int result = obj.getCalcWSPort().add(10, 20);
		System.out.println("Result is "+result);
	}

}
