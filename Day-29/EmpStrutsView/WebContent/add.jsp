<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="empform.heading"/></title>
</head>
<body>
<h1><s:text name="empform.heading"/></h1>
<s:form method="post" action="addEmployee">
<s:textfield name="id" key="empform.id"/>
<s:textfield name="name" key="empform.name"/>
<s:textfield name="salary" key="empform.salary"/>
<s:submit  key="empform.add"/>

</s:form>
</body>
</html>