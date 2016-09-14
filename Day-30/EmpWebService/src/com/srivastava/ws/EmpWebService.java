package com.srivastava.ws;

import java.sql.SQLException;
import java.util.List;

import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.srivastava.model.EmployeeDTO;
import com.srivastava.model.EmployeeModelRemote;

@Path("/MyEmpWS")
	public class EmpWebService {
		@GET
		@Path("/empjson")
		//@Consumes (MediaType.APPLICATION_JSON)
		@Produces({MediaType.APPLICATION_JSON})
		public List<EmployeeDTO> getAllEmployee(@QueryParam("salary") double salary){
//			Employee emp = new Employee();
//			emp.setId(1001);
//			emp.setName("Ram");
//			emp.setSalary(9090.00);
			EmployeeDTO empDTO = new EmployeeDTO();
	    	//empDTO.setId(1001);
	    	//empDTO.setName("Ram");
	    	empDTO.setSalary(salary);
			System.out.println("Inside WebService .... "+empDTO);
	        EmployeeModelRemote bean = ServiceLocator.doLookup();
	        List<EmployeeDTO> empList=null;
			try {
				empList = bean.searchEmployee(empDTO);
				System.out.println("After EJB Call "+empList);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
			return empList;
		}
		@GET
		@Path("/empxml")
		@Produces({ MediaType.APPLICATION_XML })
		public Employee getAllXMLEmployee(){
			Employee emp = new Employee();
			emp.setId(1001);
			emp.setName("Ram");
			emp.setSalary(9090.00);
			
			return emp;
		} }


