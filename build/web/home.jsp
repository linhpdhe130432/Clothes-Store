<%-- 
    Document   : home
    Created on : Dec 11, 2019, 11:20:57 PM
    Author     : USER
--%>

<%@page import="model.Product"%>
<%@page import="java.util.ArrayList"%>
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
        <title>Home</title>
        <%
            ArrayList<Product> products = (ArrayList<Product>) request.getAttribute("products");
        %>
    </head>
    <body class="w-100">
        <!-- header -->
        <%@include file="header.jsp" %>
        <!-- main -->
        <div class="main">
            <div class="women d-flex justify-content-center align-items-center">
                <a class="px-2 py-2" href="women">
                    OUR AWESOME WOMEN'S EDITION >
                </a>
            </div>
            <div class="men d-flex justify-content-center align-items-center">
                <a class="px-2 py-2" href="men">
                    AS MEN'S >
                </a>
            </div>
            <div class="fsale d-flex justify-content-center align-items-center">
                <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                    <div class="carousel-inner">
                        <div class="carousel-item active">
                            <img class="d-block" src="image/1.png" alt="First slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block" src="image/2.png" alt="Second slide">
                        </div>
                        <div class="carousel-item">
                            <img class="d-block" src="image/3.png" alt="Third slide">
                        </div>
                         <div class="carousel-item">
                            <img class="d-block" src="image/4.jpg" alt="Fourth slide">
                        </div>
                         <div class="carousel-item">
                            <img class="d-block" src="image/5.jpg" alt="Fifth slide">
                        </div>
                         <div class="carousel-item">
                            <img class="d-block" src="image/6.jpg" alt="Sixth slide">
                        </div>
                    </div>
                    <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                        <span class="carousel-control-next-icon" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>
            </div>
            <div class="preview w-100 " style="height: 792px;background-color:mintcream;">
                <div class="container">
                    <div class="row">
                        <%for (int i = 0; i < 6; i++) {%>
                        <div class="col-12 col-md-4">
                            <a href=""> <img src="./image/<%=products.get(i).getImg()%>" alt="" style="height: 245px;width: 325px"></a>
                        </div>
                        <%}%>
                    </div>
                </div>
            </div>
        </div>
        <!-- footer -->
        <%@include file="footer.jsp" %>
    </body>
</html>
