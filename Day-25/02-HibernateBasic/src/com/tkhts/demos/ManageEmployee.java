package com.tkhts.demos;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManageEmployee {
	private static SessionFactory sessionFactory;
	public static void main(String args[]){
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		ManageEmployee ME = new ManageEmployee();
		ME.addEmployee("Mike", "Lee", 1000, 23);
//		ME.deleteEmployee(1, 15000000);
	}
	
	public void addEmployee(String fName,String lName, int salary, int age){
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		tx = session.beginTransaction();
		Employee emp = new Employee(fName, lName, salary,age);
		session.save(emp);
		tx.commit();
	}
	
	
	/* Method to UPDATE salary for an employee */
	   public void deleteEmployee(Integer EmployeeID, int salary ){
	      Session session = sessionFactory.openSession();
	      Transaction tx = null;
	      try{
	         tx = session.beginTransaction();
	         Employee employee = 
	                    (Employee)session.get(Employee.class, EmployeeID); 
//	         employee.setSalary( salary );
			 session.delete(employee); 
	         tx.commit();
	      }catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      }
	      catch(Exception e){
	    	  if (tx!=null) tx.rollback();
		         e.printStackTrace(); 
	      }
	      finally {
	         session.close(); 
	      }
	   }

}
