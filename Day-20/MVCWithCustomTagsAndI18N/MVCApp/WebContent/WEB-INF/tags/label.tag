<%@tag import="java.util.Locale"%>
<%@tag import="java.util.ResourceBundle"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="key" type="java.lang.String" required="true" %>
<!-- <script>
window.addEventListener("load",init);
function init(){
	
	var language = location.href.substring(location.href.indexOf("?")+1).split("&")[0].split("=")[1];
	var country = location.href.substring(location.href.indexOf("?")+1).split("&")[1].split("=")[1];
	localStorage.language=language;
	localStorage.country=country;
	//alert("URL is ")
}
</script> -->
<%
String language = request.getParameter("language");
String country = request.getParameter("country");


Locale locale = new Locale(language,country);
ResourceBundle rb = ResourceBundle.getBundle("messages",locale);
String value = rb.getString(key);
%>
<%=value%>