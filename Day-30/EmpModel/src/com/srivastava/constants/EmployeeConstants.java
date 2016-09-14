package com.srivastava.constants;

public interface EmployeeConstants {
	String ADD_EMP_SQL = "insert into employee (id,name,salary) values(?,?,?)";
	String SEARCH_EMP_SQL = "select id, name,salary from employee where salary>=?";
	String JNDI_NAME ="java:jboss/datasources/empDS";

}
