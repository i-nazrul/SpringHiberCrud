<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
       
    </head>

    <body>
        <a href="home.jsp">Home</a>
        <c:url var="action" value="/user/add"></c:url>
        <form:form method="post" action="${action}" commandName="user">
          
                        <label>Email</label>
                        <form:input type="email" path="email"/><br>
              
                        <label>Name</label>
                        <form:input type="text" path="name"/><br>
            
                        <label>Password</label>
                        <form:input type="password" path="pass"/><br>
              
                        <label>Registration Date</label>
                        <form:input type="text" path="regdate"/><br>
             
                        <input type="submit" value="Add user"/>
           
        </form:form>

    </body>
</html>
