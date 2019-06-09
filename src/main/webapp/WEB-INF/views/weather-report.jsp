<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/cerulean/bootstrap.min.css" rel="stylesheet" integrity="sha384-C++cugH8+Uf86JbNOnQoBweHHAe/wVKN/mb0lTybu/NZ9sEYbd+BbbYtNpWYAsNP" crossorigin="anonymous">
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<title>Weather Report for ${ loc }</title>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <a class="navbar-brand" href="#">Adam's Weather</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor02" aria-controls="navbarColor02" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor02">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#"></a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
</head>
<body>
<h1>${ loc }</h1>
<div class="container">
		<table class="table" border=3>
			<thead>
				<tr class="table-primary">
					<td></td>
					<th scope="col">Temperature</th>
					<th scope="col">Weather</th>
					<th scope="col">Description</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${ weather.time.startPeriodName }" var="w" varStatus="loop">
					<tr>
						<th scope="row">${ w }</th>
						<td>${ weather.data.temperature[loop.index] } °F</td>
						<td>${ weather.data.weather[loop.index] }</td>
						<td>${ weather.data.text[loop.index] }</td>
					</tr>
				</c:forEach>
			</tbody>

		</table>
		</div>
		<br>

		<img src="${ img[0].image.current.preview }" style="float: left; width: 30%; margin-right: 1%; margin-bottom: 0.5em;">
	
		<div id="vid">
		 <iframe width="420" height="315"
src="${ vid[0].player.day.embed }">
</iframe> 
</div>

		

</body>
</html>