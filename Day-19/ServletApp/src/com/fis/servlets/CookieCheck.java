package com.fis.servlets;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class CookieCheck {
	private CookieCheck(){}
	
	public static String isCookieFound(HttpServletRequest request){
		
		// Creating Cookie
		// Checking Cookie is Exist on User Machine
		Cookie cookie[] = request.getCookies();  //Fetch Domain Specific Cookies
		
		if(cookie!=null && cookie.length>0){
			for(Cookie c : cookie){
				if(c.getName().equals("myfavcolor")){
					return c.getValue();
				}
			}
		}
		return null;
	}

}
