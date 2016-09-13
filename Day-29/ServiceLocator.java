package com.srivastava.servicelocator;


import java.sql.SQLException;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.srivastava.model.EmployeeDTO;
import com.srivastava.model.EmployeeModel;
import com.srivastava.model.EmployeeModelRemote;
public class ServiceLocator {
	private static Context initialContext;
	 
    private static final String PKG_INTERFACES = "org.jboss.ejb.client.naming";
 
    public static Context getInitialContext() throws NamingException {
        if (initialContext == null) {
            Properties properties = new Properties();
            properties.put(Context.URL_PKG_PREFIXES, PKG_INTERFACES);
            properties.put("jboss.naming.client.ejb.context", true);
            initialContext = new InitialContext(properties);
        }
        return initialContext;
    }
    
    
    public static void main(String[] args) throws SQLException, NamingException {
    	EmployeeDTO empDTO = new EmployeeDTO();
    	empDTO.setId(1001);
    	empDTO.setName("Ram");
    	empDTO.setSalary(9999);
        EmployeeModelRemote bean = doLookup();
        System.out.println(bean.addEmployee(empDTO)); // 4. Call business logic
    }
 
    public static EmployeeModelRemote doLookup() {
        Context context = null;
        EmployeeModelRemote bean = null;
        try {
            // 1. Obtaining Context
            context = getInitialContext();
            // 2. Generate JNDI Lookup name
            String lookupName = getLookupName();
            System.out.println("************LookUp Name "+lookupName);
            // 3. Lookup and cast
            bean = (EmployeeModelRemote) context.lookup(lookupName);
 
        } catch (NamingException e) {
            e.printStackTrace();
        }
        return bean;
    }
 
    private static String getLookupName() {
/* 
The app name is the EAR name of the deployed EJB without .ear suffix. 
Since we haven't deployed the application as a .ear, 
the app name for us will be an empty string
*/
        String appName = "StrutsEJBEAR";
 
        /* The module name is the JAR name of the deployed EJB 
        without the .jar suffix.
        */
        String moduleName = "EmpModel";
 
/*AS7 allows each deployment to have an (optional) distinct name. 
This can be an empty string if distinct name is not specified.
*/
        String distinctName = "";
 
        // The EJB bean implementation class name
        String beanName = EmployeeModel.class.getSimpleName();
 
        // Fully qualified remote interface name
        final String interfaceName = EmployeeModelRemote.class.getName();
 
        // Create a look up string name
        String name = "ejb:" + appName + "/" + moduleName + "/" + 
             beanName + "!" + interfaceName;
 
        return name;
    }
	
}