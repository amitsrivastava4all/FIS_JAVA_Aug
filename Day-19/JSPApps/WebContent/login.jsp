<%-- (JSP Comments) <%@ %> this is called Directive 
1. page directive
2. tag lib directive
3. include directive
--%>

<!-- (HTML Comments)   -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  buffer="8kb" autoFlush="true" 
    info="this is the Login page"
   	import ="java.util.Date"
    session="true"
    isThreadSafe="true"
    isErrorPage="false" %>
    <%-- errorPage="error.jsp"  --%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>लॉग इन करें</h2>
<h2>Login Here  <%=new Date() %></h2>
<%!  int pageVisited ;  %>
<%
//int pageVisited=0;
pageVisited++;
String userid = request.getParameter("userid");
String password = request.getParameter("password");
if(userid!=null && password!=null){
	if(userid.trim().length()>0 && password.trim().length()>0){
if(userid.equals(password)){
response.sendRedirect("welcome.jsp");
}
else{
%>
<h2 style="color:red">Invalid Userid or Password</h2>
<%
}
}
}
%>
<h2>Page Visited <%=pageVisited  %></h2>
<form action="login.jsp" method="post">
<table>
	<tr>
		<td><label for="">Userid</label></td>
		<td><input type="text" name="userid" placeholder="Type Userid Here" /></td>
	</tr>
	<tr>
		<td><label for="">Password</label></td>
		<td><input type="password" name="password" placeholder="Type Password Here" /></td>
	</tr>
	
	<tr>
		<td><button type="submit">Login</button></td>
		<td><button type="reset">Reset</button></td>
	</tr>
</table>
</form>
</body>
</html>