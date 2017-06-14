<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <title>Login</title>
    </head>
    <body>
        <form:form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
          
                        <form:label path="email">Email: </form:label>
                        
                        <form:input path="email" name="email" id="email" /><br>
              
                        <form:label path="pass">Password:</form:label>
                        <form:password path="pass" name="pass" id="pass" /><br>
              
                  
                        <form:button id="login" name="login">Login</form:button>
                 
                        <a href="home.jsp">Home</a>
                       
        </form:form>

    </body>
</html>