<%@ taglib uri="/struts-tags" prefix="s"%>

<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
	<head>
		<title>BootStrap Demo</title>
	<sb:head />		
	</head>
	<body>
		<h3>BootStrap Demo</h3>
		<!-- http://struts.jgeppert.com/struts2-bootstrap-showcase/index.action -->
	<s:form theme="simple" cssClass="well form-search">
    <s:textfield
            placeholder="Login" cssClass="form-control"
            name="login"
            tooltip="Enter your Name here"/>

    <s:password
            placeholder="Password" cssClass="form-control" tooltip="Enter Your Password Here"
            name="password"/>

    <s:submit cssClass="btn btn-primary"/>
</s:form>
	</body>
</html>
