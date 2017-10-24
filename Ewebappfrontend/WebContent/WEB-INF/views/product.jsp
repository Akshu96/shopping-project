

<%@ page language="java" import="com.niit.backendmodel.product" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>PRODUCTS</title>
</head>
<body>

<form:form action="InsertProduct" modelAttribute="product" enctype="multipart/form-data">

<table align="center">
	<tr>
		<td colspan="2">Product Detail</td>
	</tr>	
	<tr>
		<td>Product ID</td>
		<td><form:input path="pro_id"/></td>
	</tr>
	<tr>
		<td>Product Name</td>
		<td><form:input path="pro_name"/></td>
	</tr>
	<tr>
		<td>Product Desc</td>
		<td><form:textarea path="pro_desc"/></td>
	</tr>
	
	<tr>
		<td>Product Price</td>
		<td><form:input path="pro_price"/></td>
	</tr>
	<tr>
		<td>Category</td>
		<td>
			<form:select path="cat_id">
				<form:option value="0" label="---Select---"/>
				<form:options items="${categoryList}"/>
			</form:select>
		</td>
	</tr>
	<tr>
		<td>Supplier</td>
		<td><form:input path="su_Id"/></td>
	</tr>
	<tr>
		<td>Product Image</td>
		<td><form:input type="file" path="pimage"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<center><input type="submit" value="Insert"/></center>
		</td>
	</tr>
	
</table>
</form:form>

</body>
</html>