<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Weather Report for ${ loc }</title>
</head>
<body>
<h1>${ loc }</h1>
<div class="container">
		<table class="table" border=3>
			<thead>
				<tr>
					<td></td>
					<td>Temperature (F)</td>
					<td>Weather</td>
					<td>Description</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ weather.time.startPeriodName }" var="w" varStatus="loop">
					<tr>
						<td>${ w }</td>
						<td>${ weather.data.temperature[loop.index] }</td>
						<td>${ weather.data.weather[loop.index] }</td>
						<td>${ weather.data.text[loop.index] }</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		</div>
		

</body>
</html>