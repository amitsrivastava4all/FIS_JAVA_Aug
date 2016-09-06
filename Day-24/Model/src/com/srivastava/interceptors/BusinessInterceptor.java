package com.srivastava.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

public class BusinessInterceptor {
	@AroundInvoke
	   public Object methodInterceptor(InvocationContext ctx) throws Exception
	   {
	      System.out.println("***************** This is My Interceptor and Call before the Calc Bean: " 
	      + ctx.getMethod().getName());
	      return ctx.proceed();
	   }
}
