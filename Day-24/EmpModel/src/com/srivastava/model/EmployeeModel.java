package com.srivastava.model;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.naming.NamingException;

/**
 * Session Bean implementation class EmployeeModel
 */
@Stateless

public class EmployeeModel implements EmployeeModelRemote {

    /**
     * Default constructor. 
     */
    public EmployeeModel() {
        // TODO Auto-generated constructor stub
    }
    @Resource
    EmployeeHelper helper;
    public List<EmployeeDTO> searchEmployee(EmployeeDTO empDTO) throws SQLException, NamingException{
    	
    	
    	return helper.searchEmployee(empDTO);
    }

}
