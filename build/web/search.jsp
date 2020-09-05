<%-- 
    Document   : sale
    Created on : Dec 18, 2019, 11:04:40 PM
    Author     : USER
--%>

<%@page import="util.HtmlHelper"%>
<%@page import="java.util.ArrayList"%>
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
        <title>Search</title>
        <%
            ArrayList<Product> products
                    = (ArrayList<Product>) request.getAttribute("products");
            Integer pageindex = (Integer) request.getAttribute("pageindex");
            Integer pagecount = (Integer) request.getAttribute("pagecount");
            String x = (String) request.getSession().getAttribute("search");
        %>
    </head>
    <body>
        <!-- header -->
        <%@include file="header.jsp" %>
        <!-- content -->
        <div class="content">
            <div class="logo container d-flex align-items-center text-white" style="height: 215px;">
                <span style="font-size: 40px;text-decoration: line-through">FOLLOW YOUR CHOICE</span>
            </div>
            <div class="product">
                <div class="container">
                    <div class="row">
                        <table style="width:100%">
                            <tr>
                                <th class=" w-25">
                                    <div class="filter">
                                        <h4>Filter by</h4>
                                        <hr>
                                        Price<br>
                                        <input class="w-100aaa" type="range" name="limit-price" min="0" max="1000">
                                        <hr>
                                        Color<br>
                                        <hr>
                                        Size<br>
                                        <hr>
                                    </div>
                                </th>
                                <th class="w-75">
                                    <div class="dropdown d-flex justify-content-end" style="margin-right: 50px;">
                                        <button class="btn btn-secondary dropdown-toggle bg-white text-dark" type="button"
                                                id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true"
                                                aria-expanded="false" style="margin-top: 50px;">
                                            Sort by
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="#">Newest</a>
                                            <a class="dropdown-item" href="#">Price (low to hight)</a>
                                            <a class="dropdown-item" href="#">price (hight to low)</a>
                                            <a class="dropdown-item" href="#">Name A-Z</a>
                                            <a class="dropdown-item" href="#">Name Z-A</a>
                                        </div>
                                    </div>
                                    <div class="item">
                                        <div class="row">
                                            <%for (Product d : products) {%>
                                            <div class="col-12 col-md-6 d-flex justify-content-end">
                                                <a class="py-5" href="product?id=<%=d.getId()%>"> <img src="./image/<%=d.getImg()%>" alt="" style="height: 200px; width: 288px"> 
                                                    <br><p class="text-dark"><%=d.getName()%></p></a>
                                            </div>
                                            <%}%>
                                            <div class="d-flex justify-content-center w-100"><%=HtmlHelper.pagerSearch(pageindex, pagecount, 1, x)%></div>
                                        </div>
                                    </div>
                                </th>
                            </tr>
                        </table>
                    </div>
                </div>
            </div>
            <div style="height: 150px;">
            </div>
            <%@include file="contact.jsp" %>
        </div>
    </body>
</html>
