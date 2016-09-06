

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.srivastava.beans.AsynchBeanRemote;

/**
 * Servlet implementation class SumServlet
 */
@WebServlet("/SumServlet")
public class SumServlet extends HttpServlet {
	
	@EJB
	AsynchBeanRemote remote;
	//private CalcBeanRemote remote;	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//int result = remote.add(10000,20000);	
		Future<String> promise = remote.ejbAsynchronousSayHello("amit");
		PrintWriter out = response.getWriter();
		// U have some logic....
		
		if(promise.isDone()){
			try {
				String result = promise.get();
				out.println(" Result is "+result);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
		//out.println("Sum is "+result);
		out.close();
	}

}
