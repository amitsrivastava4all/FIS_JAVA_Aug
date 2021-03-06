package com.srivastava.model;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.Resource;
import javax.naming.NamingException;

// this pojo class  is manage by EJB Container
// This class is ManagedBean
@ManagedBean
public class EmployeeHelper {
	@Resource
	EmployeeJPADAO empDAO;
	//EmployeeDAO empDAO;
	public List<Employee> searchEmployee(EmployeeDTO empDTO){ 
	//public List<EmployeeDTO> searchEmployee(EmployeeDTO empDTO) throws SQLException, NamingException{
		
		 return empDAO.find(empDTO.getId());
		 //return empDAO.searchEmployee(empDTO);
	 }
}
