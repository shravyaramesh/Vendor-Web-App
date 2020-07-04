<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Vendor</title>
</head>
<body>
<pre>
<form action="saveVendor" method="post">
Id: <input name="id" type="text" value="${vendor.id}"/>
Code: <input name="code" type="text" value="${vendor.code}"/>
Name: <input name="name" type="text" value="${vendor.name}"/>
Type: <select name="type">
		<option ${vendor.type==''?'selected' :''}></option>
		<option ${vendor.type=='Regular'?'selected':''}>Regular</option>
		<option ${vendor.type=='Contract'?'selected':''}>Contract</option>
		</select>
Email: <input name="email" type="text" value="${vendor.email}"/>
Phone: <input name="phone" type="text" value="${vendor.phone}"/>
Address: <textarea name="address" type="text" value="${vendor.address}"></textarea>
<input type="submit" value="Save"/>
</form>
</pre>
<a href="displayVendors">View All</a>
</body>
</html>