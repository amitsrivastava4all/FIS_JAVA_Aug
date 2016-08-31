<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
function setLanguage(language, country){
	//var language = location.href.substring(location.href.indexOf("?")+1).split("&")[0].split("=")[1];
	//var country = location.href.substring(location.href.indexOf("?")+1).split("&")[1].split("=")[1];
	alert("Language is "+language+" And Country is "+country);
	if(localStorage){
	localStorage.language=language;
	localStorage.country=country;
	alert("Data Store in LocalStorage....");
	//location.href="search.jsp?language=en&country=US";
	}
	else
	{alert("Ur Browser Not Support Local Storage....");}
	
}
</script>
</head>
<body>
Select Your Language
<a href="search.jsp?language=en&country=US" onclick="setLanguage('en','US')">English</a>
<a href="search.jsp?language=hi&country=IN" onclick="setLanguage('hi','IN')">Hindi</a>
</body>
</html>