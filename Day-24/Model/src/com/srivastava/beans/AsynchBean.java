package com.srivastava.beans;

import java.util.Date;
import java.util.concurrent.Future;

import javax.ejb.AsyncResult;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class AsynchBean
 */
@Stateless

public class AsynchBean implements AsynchBeanRemote {

	@Asynchronous
    public Future<String> ejbAsynchronousSayHello(String name){
        System.out.println(new Date().toString()+" - Begin - HelloEjbAsynchronos->ejbAsynchronousSayHello "+name);

        try{
           Thread.sleep(5*1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(new Date().toString()+" - End - HelloEjbAsynchronos->ejbAsynchronousSayHello "+name);

        return new AsyncResult<String>("Hello "+name);
        
    }

}
