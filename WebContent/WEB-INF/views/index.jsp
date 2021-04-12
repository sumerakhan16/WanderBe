<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Berkshire+Swash&family=Chango&family=Dancing+Script:wght@700&family=Paytone+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
    <title>Welcome to  WanderBe</title>
   
</head>
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <img src="/wanderBe/resources/images/passport.png" alt="passport" class="logo"  style="width:3%;"> <a class="navbar-brand" style="margin-right: auto; padding: 10px;"><strong>WanderBe</strong></a>
          
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          </div>
    </nav>
<body style="background: url(https://i.pinimg.com/originals/ba/3c/f6/ba3cf615e04b769da22c9f4aa675e335.jpg) no-repeat center center fixed; background-size: cover; overflow: hidden; text-align: center;"  >
     <img src="/wanderBe/resources/images/passport.png" alt="passport" class="logo" style="width: 8%; padding-top: 5%;" class="image"> 
    <h1 class="header" style= "font-family: 'Berkshire Swash', cursive; font-family: 'Chango', cursive; font-family: 'Dancing Script', cursive; font-family: 'Paytone One', sans-serif; margin-bottom: 3%;">Welcome to WanderBe</h1>

    <a href="login" class="btn btn-primary btn-lg active" role="button" aria-pressed="true" style="background-color: rgba(0, 0, 0, 0.671); font-family: 'Berkshire Swash', cursive; font-family: 'Chango', cursive; font-family: 'Dancing Script', cursive; font-family: 'Paytone One', sans-serif; margin-bottom: 8%;">Login or Register Here</a>

</body>
<footer>
  <div class="card-body">
    <h3 style="font-family: 'Berkshire Swash', cursive; font-family: 'Chango', cursive; font-family: 'Dancing Script', cursive; font-family: 'Paytone One', sans-serif; padding-top: 10%;">About Us</h3>
   <p>WanderBe was designed creatviely to save all your traveling thoughts in one location that is accessible anywhere, anytime. This application serves as your travel board that was designed during the Covid-19 pandemic to keep track of all your adventures and imaginations for the future. 
  </p>
  </div>
</footer>

</html>