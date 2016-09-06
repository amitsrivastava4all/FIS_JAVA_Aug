package com.srivastava.beans;

import javax.ejb.Remote;

@Remote
public interface MySingletonBeanRemote {
	public String sayHello(String name);

}
