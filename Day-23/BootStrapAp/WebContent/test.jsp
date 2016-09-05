<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
	<head>
		<title>Struts 2 dynamic method invocation example</title>
	</head>
	<body>
		<h3>This is a dynamic method invocation example.</h3>
	 
		<s:form action="Test">
			<s:submit value="Submit"/>
			<s:submit value="Show" action="showTest"/>
		</s:form>
	 
	</body>
</html>
