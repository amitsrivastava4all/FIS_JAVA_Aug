package com.srivastava.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.PostActivate;
import javax.ejb.PrePassivate;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.interceptor.Interceptors;

import com.srivastava.interceptors.BusinessInterceptor;

/**
 * Session Bean implementation class CalcBean
 */
//@Stateless
@Stateful
@Interceptors ({BusinessInterceptor.class})
public class CalcBean implements CalcBeanRemote {
@Inject
Helper helper;
    
    public CalcBean() {
        
    }
    @PostActivate
    void active(){
    	
    }
    @PrePassivate
    void passive(){
    	
    }
    
    @PostConstruct
    void start(){
    	
    }
    @PreDestroy
    void destroy(){
    	
    }
	@Override
	public int add(int x, int y) {
		System.out.println("Bean Add Going to CAll....");
		return x+y;
	}

}
