package com.srivastava.basics;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/*
 * JSON and XML is a medium for communication and all languages understand
   JSON and XML
 * JSON: JavaScript Object Notation.
 * JSON is an easier to use alternative to XML.
 * JSON is lightweight data interchange format
 * JSON is language independent 
 * JSON is "self-describing" and easy to understand
 * {"employees":[
    {"firstName":"John", "lastName":"Doe"}, 
    {"firstName":"Anna", "lastName":"Smith"},
    {"firstName":"Peter", "lastName":"Jones"}
]}
<employees>
    <employee>
        <firstName>John</firstName> <lastName>Doe</lastName>
    </employee>
    <employee>
        <firstName>Anna</firstName> <lastName>Smith</lastName>
    </employee>
    <employee>
        <firstName>Peter</firstName> <lastName>Jones</lastName>
    </employee>
</employees>
 */
@Path("/MyEmpWS")
public class MyEmployeeWS {
	@GET
	@Path("/empjson")
	@Produces({MediaType.APPLICATION_JSON})
	public Employee getAllEmployee(){
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Ram");
		emp.setSalary(9090.00);
		emp.setDesignation("Manager");
		return emp;
	}
	@GET
	@Path("/empxml")
	@Produces({ MediaType.APPLICATION_XML })
	public Employee getAllXMLEmployee(){
		Employee emp = new Employee();
		emp.setId(1001);
		emp.setName("Ram");
		emp.setSalary(9090.00);
		emp.setDesignation("Manager");
		return emp;
	} }
