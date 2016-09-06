package com.srivastava.beans;

import java.util.concurrent.Future;

import javax.ejb.Remote;

@Remote
public interface AsynchBeanRemote {
	public Future<String> ejbAsynchronousSayHello(String name);
}
