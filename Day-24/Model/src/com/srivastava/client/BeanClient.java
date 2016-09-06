package com.srivastava.client;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.srivastava.beans.CalcBeanRemote;

public class BeanClient {

	public static void main(String[] args) {
		CalcBeanRemote bean = null;
		try {
			bean = lookupRemoteEJB();
		} catch (NamingException e) {
			e.printStackTrace();
		}
		int result = bean.add(10,20);
		System.out.println("Sum is "+result);

	}
	
	private static CalcBeanRemote lookupRemoteEJB() throws NamingException {
		final Hashtable jndiProperties = new Hashtable();
		jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");

		final Context context = new InitialContext(jndiProperties);
		return (CalcBeanRemote) context.lookup("ejb:/Model//CalcBean!com.srivastava.beans.CalcBeanRemote");
		

	}

}
