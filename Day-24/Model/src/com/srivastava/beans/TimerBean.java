package com.srivastava.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Schedule;
import javax.ejb.Schedules;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class TimerBean
 */
@Singleton
public class TimerBean implements TimerBeanRemote {

    /**
     * Default constructor. 
     */
    public TimerBean() {
        // TODO Auto-generated constructor stub
    }
    @PostConstruct
    private void initialize() {
        System.out.println("Singleton inited!");
    }
    @Schedule(hour="*", minute="*", second="10")
    public void startTimer() {
         System.out.println("Timer started 1... Invoking the bean" + new Date());

    } 
    @Schedules( {
        @Schedule(hour="*", minute="*", second="10"),
        @Schedule(hour="*", minute="*", second="13")
   })
   public void startTimer1() {
        System.out.println("Timer started... Invoking the bean" + new Date());
//        service.invokeBeanMethod();
   } 
}
