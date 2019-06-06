<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather</title>
</head>
<body>

<h1>Adam's Crappy Weather Site</h1>
<p>Please enter the city you would like to see the weather for</p>
<form action="weather">
City: <input type="text" name="location" required>
<input type="submit" value="Weather Me">
</form>
</body>
</html>