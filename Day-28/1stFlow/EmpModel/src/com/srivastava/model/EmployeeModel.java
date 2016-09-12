package com.srivastava.model;

import java.util.List;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class EmployeeModel
 */
@Stateless
// this is container managed transaction
//@TransactionManagement(TransactionManagementType.CONTAINER)
public class EmployeeModel implements EmployeeModelRemote {

	// this is the bean managed transaction
	// @Resource
	  // private UserTransaction userTransaction;
    /**
     * Default constructor. 
     */
    public EmployeeModel() {
        // TODO Auto-generated constructor stub
    }
    @Resource
    EmployeeHelper helper;
    public List<Employee> searchEmployee(EmployeeDTO empDTO){
   // public List<EmployeeDTO> searchEmployee(EmployeeDTO empDTO) throws SQLException, NamingException{
    //	userTransaction.begin();
    	// Put some logic
    	// userTransaction.commit();
    	// userTransaction.rollback();
    	return helper.searchEmployee(empDTO);
    }

}
