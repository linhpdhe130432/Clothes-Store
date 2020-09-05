<%-- 
    Document   : login
    Created on : Dec 19, 2019, 3:55:07 AM
    Author     : USER
--%>

<%@page import="model.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
              integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
                integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
                integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
                integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
        <link rel="stylesheet" href="style.css">
        <link href="https://fonts.googleapis.com/css?family=Spinnaker&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Login</title>
        <% Integer check = (Integer) request.getAttribute("check");%>
    </head>
    <body>
        <!-- header -->
        <%@include file="header.jsp" %>
        <div class="content">
            <div class="logo container d-flex align-items-center text-white" style="height: 215px;">
                <span style="font-size: 40px;text-decoration: line-through">LOGIN</span>
            </div>
            <div class="container text-white d-flex justify-content-center">
                <form action="login" method="POST" >
                    Username:<input style="margin-left: 5px" type="text" name="username"/> <br/>
                    Password:<input style="margin-left: 8px"type="password" name="password"/><br/>
                    <input style="margin-top: 5px" type="submit" value="Login"/>
                    <a class="text-white" style="margin-left: 20px" href="register" >Register</a>
                    <p <%=check == 0 ? "hidden" : ""%> >Login failed! Please check your username or password</p>
                </form>
            </div>
        </div>
        <div style="height: 150px;">
        </div>
        <%@include file="contact.jsp" %>
    </body>
</html>
