<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
<meta charset="ISO-8859-1">
<title>Edit Activity</title>
</head>
   <!--Navbar-->
   <nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <div class="container-fluid">
       <img src="/wanderBe/resources/images/passport.png" alt="passport" class="logo" style="width:3%;"> <a class="navbar-brand" style="margin-right: auto; padding: 10px;"><strong>WanderBe</strong></a>
      
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup" >
        <div class="navbar-nav">
          <a class="home"  href="destinations">Destinations</a> 
          <a class="home" href="activities">Activities</a>
          <a class="home" href="resources">Resources</a>
          <a class="home" href="logout">Logout </a>
        </div>
      </div>
    </div>
  </nav> 
  <br>
   <br>
    <br>
<body style="background: url(https://www.patternpictures.com/wp-content/uploads/Diamond-subtle-pattern-seamless-white-texture-patternpictures-180201-1600x996.jpg) no-repeat center center fixed; background-size: cover; overflow: auto; text-align: center;">

        
      <form:form action="editActivities" method="post" modelAttribute="activities" id="act" style="margin: 15%;">
        <span class="close">&times;</span>
          <input name="aId" value="${activities.aId}" type="hidden">
        <div class="form-group">
          <label for="recipient-name" style= "width: 100%;" class="col-form-label line" >Activity Name</label>
          <input name="aName" value="${activity.aName}" type="text"  class="form-control"placeholder="Example: Florida" id="act-name">
        </div>
        <div class="form-group">
          <label for="message-text" class="col-form-label line">Activity Notes</label>
          <textarea name="aNotes" class="form-control" placeholder="Example: Buy tickets early" id="res-url">${activities.aNotes}</textarea>
          </div>
         <div class="modal-footer">
        <input   type="submit" style="background-color: rgba(166, 221, 255, 0.728); width:10%"  id="save" class="btn btn-primary">
   
         </div>
         </form:form>    
        
</body>
<%@include file="footer.jsp"%>