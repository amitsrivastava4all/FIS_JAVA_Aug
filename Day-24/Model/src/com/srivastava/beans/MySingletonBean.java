package com.srivastava.beans;

import javax.annotation.PostConstruct;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 * Session Bean implementation class MySingletonBean
 */
@Startup
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.CONTAINER)
//@DependsOn("PrimaryBean")
public class MySingletonBean implements MySingletonBeanRemote {

    /**
     * Default constructor. 
     */
    public MySingletonBean() {
        // TODO Auto-generated constructor stub
    }
    @PostConstruct
    void start(){
    	System.out.println("Bean Up....");
    }
    @Lock(LockType.READ)
	@Override
	public String sayHello(String name) {
		// TODO Auto-generated method stub
		return "Hello "+name;
	}

}
