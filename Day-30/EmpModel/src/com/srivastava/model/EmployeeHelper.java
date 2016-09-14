package com.srivastava.model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.naming.NamingException;

// this pojo class  is manage by EJB Container
// This class is ManagedBean
@ManagedBean
public class EmployeeHelper {
	@Resource
	//EmployeeJPADAO empDAO;
	EmployeeDAO empDAO;
	//public List<Employee> searchEmployee(EmployeeDTO empDTO){ 
	public List<EmployeeDTO> searchEmployee(EmployeeDTO empDTO) throws SQLException, NamingException{
		
		// return empDAO.find(empDTO.getId());
		 return empDAO.searchEmployee(empDTO);
	 }
	@Resource
	EmployeeJPADAO jpaDAO;
public List<EmployeeDTO> searchEmployeeJPA(EmployeeDTO empDTO) {
		List<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
		// return empDAO.find(empDTO.getId());
		 List<Employee> empList =  jpaDAO.find(empDTO.getId());
		 if(empList!=null){
			 for(Employee emp: empList){
				 EmployeeDTO empObject = new EmployeeDTO();
				 empObject.setId(emp.getId());
				 empObject.setName(emp.getName());
				 empObject.setSalary(emp.getSalary());
				 employeeList.add(empObject);
			 }
		 }
		 return employeeList;
}

	
public String addEmployee(EmployeeDTO empDTO) throws SQLException, NamingException{
		
		// return empDAO.find(empDTO.getId());
		 return empDAO.addEmployee(empDTO);
	 }
}
