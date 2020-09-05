<%-- 
    Document   : card
    Created on : Dec 18, 2019, 11:48:51 PM
    Author     : USER
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Order"%>
<%@page import="model.OrderLine"%>
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
        <title>Cart</title>
        <%
            Order order = (Order) session.getAttribute("cart");
        %>
    </head>
    <body>
        <!-- header -->
        <%@include file="header.jsp" %>
        <!-- men content -->
        <div class="content">
            <div class="logo container d-flex align-items-center text-white" style="height: 215px;">
                <span style="font-size: 40px;text-decoration: line-through">Your Cart</span>
            </div>

            <div class="container">
                <form id="frm" action="insertorder" method="POST">
                </form>    
                <table class="text-white w-100" style="border: 1px solid white"> 
                    <tr>
                        <td>Product</td>
                        <td>Quantity</td>
                        <td>Price</td>
                        <td>Total</td>
                    </tr>
                    <% for (OrderLine line : order.getLines()) {
                    %>
                    <tr>
                        <td><%=line.getProduct().getName()%></td>
                        <td><%=line.getQuantity()%></td>
                        <td><%=line.getPrice()%></td>
                        <td><%=line.total()%></td>
                    </tr>
                    <%}%>
                    <tr>
                        <td colspan="3">Total</td>
                        <td><%=order.total()%></td>
                    </tr>
                </table>
                <input type="button" value="Checkout" 
                       onclick="document.getElementById('frm').submit();"  />   
            </div>
            <div style="height: 150px;">
            </div>
            <%@include file="contact.jsp" %>
    </body>
</html>
