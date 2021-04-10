<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Berkshire+Swash&family=Chango&family=Dancing+Script:wght@700&family=Paytone+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
    <title>Destinations</title>
</head>

<body>

<div class="card-group">
<c:forEach items="${desList}" var="destinations">
  <div class="card">
    <img class="card-img-top" src="${destinations.dImageUrl}" alt="Card image cap">
    <div class="card-body">
      <h5 class="card-title">${destinations.dName}</h5>
    </div>
  </div>
 </c:forEach>
 </div>
 
 <div class="row row-cols-1 row-cols-md-3">
  <c:forEach items="${desList}" var="destinations">
  <div class="col mb-4">
 
    <div class="card h-100">
      <img src="${destinations.dImageUrl}" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">${destinations.dName}</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
  </c:forEach>
  </div>

	
		
</body>
</html>