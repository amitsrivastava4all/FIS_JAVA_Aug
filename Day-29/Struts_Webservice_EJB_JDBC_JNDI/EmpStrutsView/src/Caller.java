

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srivastava.model.Employee;
import com.srivastava.servicelocator.WebServiceServiceLocator;

/**
 * Servlet implementation class Caller
 */
@WebServlet("/Caller")
public class Caller extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = new Employee();
		emp.setSalary(1111);
		List<Employee> empList = WebServiceServiceLocator.getEmployees(emp);
		PrintWriter out = response.getWriter();
		out.println("EmpList "+empList);
		out.close();
	}

}
