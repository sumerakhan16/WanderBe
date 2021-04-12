<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
    <title>Login or Register</title>
    
</head>
     <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
           <img src="/wanderBe/resources/images/passport.png" alt="passport" class="logo"  style="width:3%;"> <a class="navbar-brand" style="margin-right: auto; padding: 10px;"><strong>WanderBe</strong></a>
          
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          </div>
      </nav>

<body style=" background: url(https://i.pinimg.com/originals/ba/3c/f6/ba3cf615e04b769da22c9f4aa675e335.jpg) no-repeat center center fixed; webkit-background-size: cover; moz-background-size: cover; -o-background-size: cover;
background-size: cover;">
    <div class="row">
        <div class="col-md-6 mx-auto p-0">
                <div class="login-box">
                    <div class="login-snip"> <input id="tab-1" type="radio" name="tab" class="sign-in" checked><label for="tab-1" class="tab"><strong>Login</strong></label> <input id="tab-2" type="radio" name="tab" class="sign-up"><label for="tab-2" class="tab"><strong>Register</strong></label>
                        <div class="login-space">
                            <div class="login">
                                <p style="color:green">${registrationSuccessful}</p>
									<hr>
				
							<form action="loginProcess" method="get"
								style="display: flex; flex-direction: column">
								Username: <input type="text" name="uName" ><br>
								Password: <input type="password" name="uPass"><br> 
								<span>${message}</span>
								
								<input type="submit" name="sign in" value="Sign in" style="width: 50%">
							</form>
                               
                            </div>
                            <form action="registerSubmit" method="post" modelAttribute="user" >
                           	 <div class="sign-up-form">
                            	Username: <input type="text" name="uName" required "><br>
								
								<br>
								Password: <input type="password" name="uPass" required><br>
								<br>
								Verify Password: <input type="password" name="verifyPass" required><br>
								<br>
								<input type="submit" name="register" value="Register" style="width:50%">
							</div>
							</form>
                            
                            </div>
                        </div>
                    </div>
                </div>
        </div>
    </div>
</body>
</html>