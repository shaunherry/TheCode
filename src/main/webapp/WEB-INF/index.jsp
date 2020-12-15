<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Secret Code</title>
</head>
<body>

<h1 class = "head" >What is the Code???</h1>

<p class = "error"> <c:out value="${error}"/> </p>

<form method="POST" action="/success">
 	<input type="text" name="code" class="form-control" placeholder="Enter Code Here" aria-label="Enter Code" aria-describedby="button-addon2">
  	<button class="btn btn-outline-secondary" type="submit" id="button-addon2">Submit</button>
 </form>	

</body>
</html>