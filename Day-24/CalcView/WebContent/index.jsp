<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calc App</title>
</head>
<body>
<form action='calcCtrl' method='post'>
<table>
<tr>
<td><label>First No</label></td>
<td><input type='text' name='firstno'></td>
</tr>
<tr>
<td><label>Second No</label></td>
<td><input type='text' name='secondno'></td>
</tr>
<tr>
<td colspan='2'><button type='submit'>Add</button></td>

</tr>
</table>
</form>
</body>
</html>