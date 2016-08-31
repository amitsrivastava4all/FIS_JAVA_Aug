<%@tag import="java.text.NumberFormat"%>

<%@tag import="java.util.Locale"%>
<%@tag import="java.util.ResourceBundle"%>
<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ attribute name="amount" type="java.lang.Double" required="true" %>
<%
String language = request.getParameter("language");
String country = request.getParameter("country");
Locale locale =new Locale(language,country);
NumberFormat numformat = NumberFormat.getCurrencyInstance(locale);
String formattedAmount =numformat.format(amount);
%>
<%=formattedAmount%>