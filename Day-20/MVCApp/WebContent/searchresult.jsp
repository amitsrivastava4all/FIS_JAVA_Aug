<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fieldset>
<legend>
Search Result 
</legend>
<%-- ${productlist } --%>
<%-- <% ArrayList<ProductDTO> productList = (ArrayList<ProductDTO>)request.getAttribute("productlist");  %>
 --%><%-- <%
if(productList!=null && productList.size()>0){
%> --%>
<c:if test="${productlist.size() gt 0 }">
<table>
<c:forEach items="${productlist}" var="product">
<tr>
<td>
<div style="border-width: 2px;border-style: solid">

<table>
<tr><td><a href='showdetails.jsp?id=${product.id}'><img src="images/${product.id}.jpg"></a></td></tr>
<tr><td>${product.id}</td></tr>
<tr><td>${product.name}</td></tr>
<tr><td>${product.price}</td></tr>
<tr><td>${product.desc}</td></tr>
</table>
</div>
</c:forEach>
</table>
</c:if>
<%-- <table>
<% for(ProductDTO productDTO: productList){ %>
<tr>
<td>
<div style="border-width: 2px;border-style: solid">

<table>
<tr><td><a href='showdetails.jsp?id=<%=productDTO.getId()%>'><img src="images/<%=productDTO.getId()%>.jpg"></a></td></tr>
<tr><td><%=productDTO.getId() %></td></tr>
<tr><td><%=productDTO.getName() %></td></tr>
<tr><td><%=productDTO.getPrice() %></td></tr>
<tr><td><%=productDTO.getDesc() %></td></tr>

</table>
</div>
</td>
</tr>
<%} %>
</table>
<% 
}
else{
%>
<h1>No Matching Record Found...</h1>
<%} %> --%>
</fieldset>
