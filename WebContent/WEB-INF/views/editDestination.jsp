<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


        
          <form:form action="editDestinations" method="post" modelAttribute="destinations" id="dest">
            <span class="close">&times;</span>
              <input name="dId" value="${destination.dId}" type="hidden">
            <div class="form-group">
              <label for="recipient-name" style= "width: 100%;" class="col-form-label line" >Destination Name</label>
              <input name="dName" value="${destination.dName}" type="text"  class="form-control"placeholder="Example: Florida" id="act-name">
            </div>
            <div class="form-group">
              <label for="message-text" class="col-form-label line">Image URL</label>
              <textarea name="dImageUrl" class="form-control" placeholder="Copy and Paste Image Address" id="res-url">${destinations.dImageUrl}</textarea>
              </div>
             <div class="modal-footer">
            <input   type="submit" style="background-color: rgba(166, 221, 255, 0.728); width:10%"  id="save" class="btn btn-primary">
       
             </div>
             </form:form>   
        
</body>
</html>