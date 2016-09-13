package com.srivastava.model;



import java.util.ArrayList;
import java.util.Date;

import javax.annotation.ManagedBean;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
@ManagedBean
public class EmployeeJPADAO {
	@PersistenceContext(unitName = "mypersistanceunit")
    private EntityManager em;

	// EntityManagerFactory emf = Persistence.
		//	 createEntityManagerFactory("mypersistanceunit");
     


	public void add(int id, String name, double salary, Date joiningDate)
	{
		//EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		transaction.begin();
		Employee ram = new Employee();
		ram.setId(id);
		ram.setName(name);
		ram.setSalary(salary);
		ram.setJoiningDate(joiningDate);
		
		em.persist(ram);
		transaction.commit();
		em.close();

	}
	public void delete(int id)
	{
		//EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Employee emp = em.find( Employee.class,id);
		transaction.begin();
		System.out.println("Emp Going to Delete "+emp);
		em.remove(emp);
		transaction.commit();
		em.close();
		System.out.println("Record Deleted...");
	}
	public void modify(int id)
	{
		//EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		Employee emp = em.find( Employee.class,id);
		System.out.println("Before Modification Object is "+emp);
		transaction.begin();
		emp.setName("MIKE");
		em.merge(emp);
		transaction.commit();
		em.close();
		System.out.println("Record Modified...");
	}
	public ArrayList<Employee> find(int id)
	{
		ArrayList<Employee> empList = new ArrayList<Employee>();
		//EntityManager em = emf.createEntityManager();
		//EntityTransaction transaction = em.getTransaction();
		//transaction.begin();
		Employee emp = em.find( Employee.class,id);
		System.out.println("Id "+id);
		System.out.println(" Emp is "+emp);
		if(emp!=null){
			empList.add(emp);
			System.out.println("Emp Object "+emp);
		}
		else
		{
			System.out.println("Not Found.......");
		}
		//transaction.commit();
		//em.close();
		return empList;
	}

}

