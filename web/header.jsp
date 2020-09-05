<%-- 
    Document   : header
    Created on : Dec 18, 2019, 10:43:59 PM
    Author     : USER
--%>

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
        <script>
            function submitDataToInsert()
            {
                document.getElementById("frm").submit();
            }
        </script>
    </head>
    <body>
        <div class="header" style="font-size: 20px;">
            <nav class="container navbar navbar-expand-lg navbar-light">
                <a class="navbar-brand text-white" href="home"><span
                        style="font-size: 40px;text-decoration: line-through">HF</span></a>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="home"><span style="font-size: 15px;">Awesome Sneaker</span>
                            </a>
                        </li>
                        <li class="nav-item mx-3">
                            <a class="nav-link text-white" href="home">Home </a>
                        </li>
                        <li class="nav-item mx-3 dropdown">
                            <a class="nav-link dropdown-toggle text-white" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Shop
                            </a>
                            <div class="dropdown-menu" style="background-color: black;" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item text-white" href="men">Men</a>
                                <a class="dropdown-item text-white" href="women">Women</a>
                                <a class="dropdown-item text-white" href="sale">Sale</a>
                            </div>
                        </li>
                        <li class="nav-item mx-3">
                            <a class="nav-link text-white" href="<%=request.getSession().getAttribute("user") == null ? "login" : "logout"%>"><%=request.getSession().getAttribute("user") == null ? "Login" : "LogOut"%></a>
                        </li>
                        <li class="nav-item mx-3">
                            <a class="nav-link text-white" href="#">Customer Service</a>
                        </li>
                    </ul>
                </div>
                        <form id="frm" action="search" method="GET">
                            <input type="text" name="search" value="<%=(request.getSession().getAttribute("search")== null?"":request.getSession().getAttribute("search") )%>" placeholder="Search...">
                </form>
                <button style="border:1px solid black;background-color: black; padding-left: 2px"><i
                        class="fa fa-search text-white" onclick="submitDataToInsert();"></i></button>
                <a href="cart" style="border:1px solid black;background-color: black; padding: 2px"><i
                        class="fa fa-shopping-cart text-white"></i></a>
            </nav>
        </div>
    </body>
</html>
