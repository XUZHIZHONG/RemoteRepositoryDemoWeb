<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form</title>
</head>
<body>

<form action="/DemoWeb/function/demo1.view" method="POST">     
<input type="text" name="name" value="Samuel">
<input type="checkbox" name="game" value="S">數獨
<input type="checkbox" name="game" value="M">麻將
<input type="submit" value="送出"> 

</form>
</body>
</html>