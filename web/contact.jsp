<%-- 
    Document   : contact
    Created on : Dec 18, 2019, 10:51:34 PM
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
    </head>
    <body>
        <div class="contact container text-white">
            <div class="row" style="margin-left: 70px;">
                <div class="col-sm">
                    <div>
                        <h3><span style=" font-weight: bold; text-decoration: line-through;">ADDRESS</span></h3>
                    </div>
                    <div>
                        <p>500 Terry Francois Street<br>
                            San Francisco, CA 94158<br>
                            info@mysite.com<br>
                            Tel: 123-456-7890</p>
                    </div>
                    <div>
                        <a href="https://www.facebook.com/vgdackhai"><i class="fa fa-facebook text-white"></i></a>
                        <a href="https://twitter.com/home"><i class="fa fa-twitter text-white"></i></a>
                        <a href="https://www.instagram.com/carot_xanh_/"><i class="fa fa-instagram text-white"></i></a>
                    </div>
                </div>
                <div class="col-sm">
                    <div>
                        <h3><span style=" font-weight: bold; text-decoration: line-through;">CONTACT US</span></h3>
                    </div>
                    <div>
                        <form action="">
                            <div>
                                <table style="width:100%">
                                    <tr>
                                        <th><input style="color: white" type="text" name="name" placeholder="name"></th>
                                        <th rowspan="3"> <input type="text" name="message"
                                                                placeholder="Type your message here..."
                                                                style="padding-top: 40px;padding-bottom: 45px; color: white"></th>
                                    </tr>
                                    <tr>
                                        <td><input style="color: white" type="text" name="email" placeholder="email"></td>
                                    </tr>
                                    <tr>
                                        <td><input style="color: white" type="text" name="phone" placeholder="phone"></td>
                                    </tr>
                                </table>
                            </div>
                            <div>
                                <input style="margin-left: 217px;" type="submit" name="" value="Submit Contact">
                            </div>
                            <p style="margin-left: 177px;margin-top: 5px;">Thanks for submitting!</p>
                        </form>
                    </div>
                </div>
                <div class="col-sm">
                    <div>
                        <h3><span style=" font-weight: bold; text-decoration: line-through;">STAY IN TOUCH</span></h3>
                    </div>
                    <div>
                        <form action="">
                            Join our mailist list<br>
                            <input style="color: white" class="w-75" type="text" name="mailist" placeholder="Enter your email here*"><br>
                            <input class="w-75" type="submit" name="Subscribe" value="Subscribe Now">
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <div style="height: 150px;">
        </div>
    </body>
</html>
