<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1><s:text name="empform.heading"/></h1>
<s:form method="get" action="searchjpa">

<s:textfield name="id" key="empform.id"/>
<s:submit  key="empform.search"/>

</s:form>
<s:if test="%{empList.size>0}">
<table>
         <s:iterator value="empList">
            <tr style="background-color: #99CCFF">      
              <td><s:property value="id"/></td>
              <td><s:property value="name"/></td>
              <td><s:property value="salary"/></td>
                            
          </tr>
      </s:iterator>
 </table>
</s:if>
</body>
</html>