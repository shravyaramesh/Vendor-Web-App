<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Vendor</title>
</head>
<body>
<pre>
<form action="saveVendor" method="post">
Id: <input name="id" type="text"/>
Code: <input name="code" type="text"/>
Name: <input name="name" type="text"/>
Type: <select name="type">
		<option ></option>
		<option>Regular</option>
		<option>Contract</option>
		</select>
Email: <input name="email" type="text"/>
Phone: <input name="phone" type="text"/>
Address: <textarea name="address" rows="4" cols="50"></textarea>
<input type="submit" value="Save"/>
</form>
${msg}

<a href="displayVendors">View All</a>
</pre>
</body>
</html>