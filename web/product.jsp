<%-- 
    Document   : product
    Created on : Dec 19, 2019, 3:17:52 AM
    Author     : USER
--%>

<%@page import="model.Product"%>
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
        <% Product p = (Product) request.getAttribute("p");%>
        <title><%=p.getName()%></title>
    </head>
    <body>
        <!-- header -->
        <%@include file="header.jsp" %>
        <!-- men content -->
        <div class="content">
            <div class="logo container d-flex align-items-center text-white" style="height: 215px;">
                <span style="font-size: 40px;text-decoration: line-through"><%=p.getName()%></span>
            </div>
            <div class="product">
                <div class="container">
                    <table style="width:100%">
                        <tr>
                            <th class=" w-25">
                                <img src="image/<%=p.getImg()%>" style="height: 416px; width: 585px">
                            </th>
                            <th class="w-75">
                                <p style="font-size: 30px"><%=p.getName()%></p>
                                <p>Price: <span style="color: red"><%=p.getPrice()%></span></p>
                                <form action="cart" method="post">
                                    <input name="pid" type="hidden" value="<%=p.getId()%>"/>
                                    <input type="submit" value="Buy"/>
                                </form>
                            </th>
                        </tr>
                    </table>
                </div>
            </div>
            <div style="height: 150px;">
            </div>
            <%@include file="contact.jsp" %>
    </body>
</html>
