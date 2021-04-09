<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://fonts.googleapis.com/css2?family=Berkshire+Swash&family=Chango&family=Dancing+Script:wght@700&family=Paytone+One&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css"/>
    <title>Activities</title>
</head>

   <!--Navbar-->
   <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <img src="/wanderBe/resources/images/passport.png" alt="passport" class="logo" style="width:3%;"> <a class="navbar-brand" style="margin-right: auto; padding: 10px;"><strong>WanderBe</strong></a>
      
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
        <div class="navbar-nav">
          <a class="home" href="destinations">Destinations</a>
          <a class="home" href="restaurants">Restaurants</a>
          <a class="home" href="activities">Activities</a>
          <a class="home" href="resources">Resources</a>
          <a class="home" href="logout">Logout </a>
        </div>
      </div>
    </div>
  </nav>

<body style="background: url(https://www.patternpictures.com/wp-content/uploads/Diamond-subtle-pattern-seamless-white-texture-patternpictures-180201-1600x996.jpg) no-repeat center center fixed; background-size: cover; overflow: hidden; text-align: center;">
   
  <!--Bootstrap Jumbotron -->
  <div class="jumbotron" style="text-align: center;" >
    <h1 class="display-4">Activities</h1>
    <p class="lead"> </p>
    <hr class="my-4">
    <p>Let's add some more details to your trip.</p>

    <div class="dropdown">
      <button class="btn btn-outline-dark dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
        Your Destinations
      </button>
      <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
      </div>
    </div>
    <!-- button for modal  -->
    <button type="button" class="btn btn-outline-dark" id="myBtn" data-two="Image URL">+Activity</button>
  </div>

  <div class = "container">
    <div class = "row">
      <div class = "col-sm-12">
      <div id ="newActivity"></div>
    </div>
    </div>
  </div>
    
    <!-- The Modal -->
    <div id="myModal" class="modal" style= "width: ; padding: 10%;">
        <div class="modal-body" style="border-style: ridge; margin: 5%;  " >
          <form>
            <span class="close">&times;</span>
            <div class="form-group">
              <label for="recipient-name" style= "width: 100%;" class="col-form-label line" >Activity Name</label>
              <input type="text"  class="form-control"placeholder="Example: Go to the Art Museum" id="act-name">
            </div>
            <div class="form-group">
              <label for="message-text" class="col-form-label line" >Notes</label>
              <textarea class="form-control" placeholder= "Example: Buy tickets early" id="act-notes"></textarea>
            </div>
            <div class="form-group">
              <label for="message-text" class="col-form-label line">Resources URL</label>
              <textarea class="form-control" placeholder="Example: Link to buy tickets" id="res-url"></textarea>
          </form>
          <div class="modal-footer">
            <button id="save" type="button" style="background-color: rgba(166, 221, 255, 0.728); width:10%"  class="btn btn-primary">Save </button>
          </div>
      </div>
    </div>
    </body>
    
    <script>
      // Get the modal
      var modal = document.getElementById("myModal");
      
      // Get the button that opens the modal
      var btn = document.getElementById("myBtn");
      
      // Get the <span> element that closes the modal
      var span = document.getElementsByClassName("close")[0];
      
      // When the user clicks the button, open the modal 
      btn.onclick = function() {
        modal.style.display = "block";
      }
      
      // When the user clicks on <span> (x), close the modal
      span.onclick = function() {
        modal.style.display = "none";
      }
      
      // When the user clicks anywhere outside of the modal, close it
      window.onclick = function(event) {
        if (event.target == modal) {
          modal.style.display = "none";
        }
      }
      </script>
      
</html>