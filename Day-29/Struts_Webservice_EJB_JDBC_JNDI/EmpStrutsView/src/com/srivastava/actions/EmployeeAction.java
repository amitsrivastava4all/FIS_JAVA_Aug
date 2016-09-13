package com.srivastava.actions;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.NamingException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.srivastava.constants.ApplicationConstants;
import com.srivastava.model.Employee;
import com.srivastava.model.EmployeeDTO;
import com.srivastava.model.EmployeeModelRemote;
import com.srivastava.servicelocator.ServiceLocator;
import com.srivastava.servicelocator.WebServiceServiceLocator;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee> {

	private Employee employee=new Employee();
	private String message;
	private List<Employee> empList = new ArrayList<Employee>();
	
	
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public Employee getModel() {
		// TODO Auto-generated method stub
		return employee;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	  
	//@EJB
	//private EmployeeModelRemote employeeEJB;
	public String addEmployee(){
		EmployeeDTO employeeDTO = new EmployeeDTO();
		employeeDTO.setId(employee.getId());
		employeeDTO.setName(employee.getName());
		employeeDTO.setSalary(employee.getSalary());
		System.out.println("::: EMP DTO   ::: "+employeeDTO);
		try {
			//ServiceLocator serviceLocator = new ServiceLocator();
			EmployeeModelRemote bean = ServiceLocator.doLookup();
	       // System.out.println(bean.addEmployee(empDTO));
			String status = bean.addEmployee(employeeDTO);
			if(status.equals(ApplicationConstants.SUCCESS)){
				this.setMessage(this.getText("empform.recordadded"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			setMessage(this.getText("empform.addfail"));
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			setMessage(this.getText("empform.addfail"));
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public String searchEmployee(){
		// Web Service Call
		try {
			List<Employee> empList = WebServiceServiceLocator.getEmployees(employee);
			setEmpList(empList);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	

	
	
	
}
