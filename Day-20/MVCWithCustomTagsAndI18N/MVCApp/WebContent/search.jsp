<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList , com.fis.dto.ProductDTO"%>
    <%@taglib prefix="fis" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Search</title>
<script>
window.addEventListener("load",init);
function init(){
	document.getElementById("country").value= localStorage.country;
	document.getElementById("language").value=localStorage.language;
}

</script>
</head>
<body>
<h1><fis:label key="search.heading" /></h1>
<fieldset><legend><fis:label key="search.lbl"/></legend>
<form action="productctrl" method="get">
<input type='hidden' id="language" name='language'>
<input type='hidden' name='country' id='country'>

<table>
<tr><td><label><fis:label key="searchproduct.lbl"/></label></td>
<td><select name="searchProduct">
<option value="m">Mobile</option>
<option value="t">TV</option>
</select>
</td>
</tr>
<tr>
<td colspan="2"><button type="submit">Search</button></td></tr>
</table>
</form>
</fieldset>
<%-- <%
com.fis.dao.ProductDAO dao = new com.fis.dao.ProductDAO();
request.setAttribute("obj", dao);
//dao.setName("Amit");
//dao.setName(request.getParameter("txt1"));
%> --%>
<%-- 
JSP Actions
<jsp:useBean id="obj" class="com.fis.dao.ProductDAO" scope="request">
<jsp:setProperty name="obj" property="name" value="Amit" param="txt1"/>
</jsp:useBean>
<jsp:property name="obj" property="name"/>
<jsp:forward page="xyz.jsp">
<jsp:param value="Amit" name="customername"/>
</jsp:forward>
<jsp:plugin code="MyApplet.class" codebase="directoryname" type="Applet">
<jsp:fallback>Browser Doesn't Support Applet</jsp:fallback>
</jsp:plugin> --%>
 <%-- <jsp:include page="searchresult.jsp"/> --%> 
 <%@include file="searchresult.jsp" %> 
</body>
</html>