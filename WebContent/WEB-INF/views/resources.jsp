<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Berkshire+Swash&family=Chango&family=Dancing+Script:wght@700&family=Paytone+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
     <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <title>Resources</title>
  

</head>

<body style="background: url(https://www.patternpictures.com/wp-content/uploads/Diamond-subtle-pattern-seamless-white-texture-patternpictures-180201-1600x996.jpg) no-repeat center center fixed; background-size: cover; overflow: auto; text-align: center;">
   
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
    
  
  <!--Bootstrap Jumbotron -->
  <div class="jumbotron" style="text-align: center;" >
    <h1 class="display-4">Resources</h1>
    <p class="lead"> </p>
    <hr class="my-4">
    <p> Check out this tab for helpful resources when planning your trip!</p> 
   </div>
   
   <div style="display: flex; justify-content: space-between; margin:10%;">
<iframe  src="https://calendar.google.com/calendar/embed?height=600&amp;wkst=1&amp;bgcolor=%23B39DDB&amp;ctz=America%2FChicago&amp;src=ZW4udXNhI2hvbGlkYXlAZ3JvdXAudi5jYWxlbmRhci5nb29nbGUuY29t&amp;color=%23B39DDB&amp;showPrint=0&amp;showTabs=0&amp;showCalendars=0&amp;showTz=0&amp;title=WanderBe%20Calander" style="border:solid 1px #777" width="800" height="600" frameborder="0" scrolling="no"></iframe>  
 
 <div id="tv">
 <div class="card border-light mb-3" style="width: 30rem; height: 30rem; margin-top:15%; background-color: lightgrey;">
  <div class="card-body">
    <h5 class="card-title"><strong> Helpful Links </strong></h5>
    
  
   
    	<table style="width:100% " class="card-text">
  <tr>
  	<td>Currency Converter:</td>
  	<td style="white-space: nowrap;"> <a href="https://www.xe.com/" target="_blank">https://www.xe.com/ </a></td>
 </tr>
 <tr>
 	<td style="white-space: nowrap;" >Trip Advisor:</td>
 	<td> <a href="https://www.tripadvisor.com/" target="_blank">https://www.tripadvisor.com/ </a></td>
  </tr>
 <tr>
 	<td style="white-space: nowrap;">Google Flights:</td>
 	<td> <a href="https://www.google.com/travel" target="_blank">https://www.google.com/travel/ </a></td>
  </tr>
 <tr>
    <td style="white-space: nowrap;">The Weather Channel:</td>
    <td> <a href="https://weather.com" target="_blank"> https://weather.com/ </a></td>
  </tr>
</table>

<br>
<br>
<h5 class="card-title"><strong> Travel Blogs </strong></h5>
    
  
   
    	<table style="width:100% " class="card-text">
  <tr>
  	<td>Air Treks:</td>
  	<td style="white-space: nowrap;"> <a href="https://news.airtreks.com/" target="_blank">https:https://news.airtreks.com/ </a></td>
 </tr>
 <tr>
 	<td style="white-space: nowrap;" >Gradling:</td>
 	<td> <a href="https://gadling.com/" target="_blank">https://gadling.com/ </a></td>
  </tr>
 <tr>
 	<td style="white-space: nowrap;">AnywhereWeRoam:</td>
 	<td> <a href="https://anywhereweroam.com/" target="_blank">https://anywhereweroam.com/ </a></td>
  </tr>
 <tr>
    <td style="white-space: nowrap;">Maptia</td>
    <td> <a href="https://maptia.com/" target="_blank"> https://maptia.com/</a></td>
  </tr>
</table>
</div>
</div>
</div>
    </div>
   
 
  <div class="card-columns" style="margin:5%; text-align: center;">
  <div class="card">
    <div class="card-body">
      <h5 class="card-title"><u> Travel Fact </u></h5>
      <p class="card-text">You can lose more than 60 fluid ounces of water from your body during a ten-hour flight.</p>
    </div>
  </div>
  <div class="card p-3" >
    <blockquote class="blockquote mb-0 card-body" >
      <p><i> "I am not the same, having seen the moon shine on the other side of the world."</i></p>
      <footer class="blockquote-footer">
        <small class="text-muted">
          <cite title="Source Title">Mary Anne Radmacher</cite>
        </small>
      </footer>
    </blockquote>
  </div>
  <div class="card">
    <div class="card-body">
      <h5 class="card-title"><u>Travel Fact</u></h5>
      <p class="card-text">Presently, almost 50% of Americans research, book, and plan their trips to a new travel destination using only a mobile device.</p>
    
    </div>
  </div>
  <div class="card  text-white text-center p-3" style="background-color: rgba(166, 221, 255, 0.728);">
    <blockquote class="blockquote mb-0">
      <p><i>"A journey is best measured in friends, rather than miles."</i></p>
      <footer class="blockquote-footer">
        <small>
          <cite title="Source Title">Tim Cahill</cite>
        </small>
      </footer>
    </blockquote>
  </div>
 
  <div class="card p-3 text-right">
    <blockquote class="blockquote mb-0">
      <p> <i>Travel makes one modest. You see what a tiny place you occupy in the world." </i></p>
      <footer class="blockquote-footer">
        <small class="text-muted">
          <cite title="Source Title">Gustave Flaubert</cite>
        </small>
      </footer>
    </blockquote>
  </div>
  <div class="card" >
    <div class="card-body">
      <h5 class="card-title"><u>Travel Fact</u></h5>
      <p class="card-text">During a normal flight, the temperature outside your plane is around -60F. That's colder than almost anywhere on Earth at any given moment of the year.</p>
    </div>
  </div>
</div>
<%@include file="footer.jsp"%>
