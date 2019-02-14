<%-- 
    Document   : Login
    Created on : Feb 10, 2019, 8:15:47 AM
    Author     : monster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js h-100" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Global School - Demo Login Page</title>
        <meta name="description" content="An all in one school software solutions to manage school related tasks efficiently">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" id="main-stylesheet" data-version="1.0.0" href="res/styles/shards-dashboards.1.0.0.min.css">
        <link rel="stylesheet" href="res/styles/extras.1.0.0.min.css">
    </head>
    <body>
    <body class="h-100">
        <div class="container-fluid">
            <div class="row">
                <div class="main-content w-100">
                    <!--Login Div-->
                    <div class="col-lg-3 col-md-6 col-sm-12 mb-4" style="margin: 164px auto;">
                        <!-- Quick Post -->
                        <div class="card h-100">
                            <div class="card-header border-bottom">
                                <div class="d-table m-auto">
                                    <div class="text-center mt-3">
                                        <img id="main-logo" class="d-inline-block align-top mr-1 mt-2" style="max-width: 36px;" src="res/images/shards-dashboards-logo.svg" alt="Shards Dashboard">
                                        <span class="d-md-inline ml-1 mt-2" style="font-size: 1.5rem;">Global School</span>
                                    </div>

                                    <div class="mt-4 text-primary text-center">Demo - Login</div>
                                </div>
                            </div>
                            <div class="card-body d-flex flex-column">
                                <form class="quick-post-form" id="login-form">
                                    <div class="form-group">
                                        <input type="text" class="form-control" id="username" aria-describedby="emailHelp" placeholder="username / email ID" required> 
                                        <div class="invalid-feedback">This username is taken.</div>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="password">
                                        <div class="invalid-feedback">This password is incorrect.</div>
                                    </div>
                                    <div class="form-group mb-0">
                                        <button type="submit" class="btn btn-accent w-100">LOGIN</button>
                                    </div>
                                    <div class="form-group mb-0">
                                        <button class="btn mt-2 btn-outline-primary w-100">SIGN UP</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!--Footer Div-->
                    <footer class="main-footer d-flex p-2 px-3 bg-white border-top w-100" style="position: fixed; bottom: 0;">
                        <ul class="nav">
                            <li class="nav-item">
                                <a class="nav-link" href="#" onclick="onLoginClick()">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">FAQ</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Contact us</a>
                            </li>
                        </ul>
                        <span class="copyright ml-auto my-auto mr-2">Copyright © 2018
                            <a href="https://monsterbraininc.com" rel="nofollow">Monster Brain Labs. version : ${version}</a>
                        </span>
                    </footer>
                </div>
            </div>
        </div>

        <script src="./res/jquery-3.3.1.js"></script>
        <script>
            $('#login-form').submit((e) => {
                console.log({e});
                e.preventDefault();

                $.ajax({
                    method: "POST",
                    url: "login",
                    data: {username: $('#username').val(), password: $('#password').val()}
                }).done(function (msg) {
                    var data = JSON.parse(msg);
                    console.log({data});
                    if(data.isSuccess){
                        location.href = "dashboard";
                        //window.open("dashboard-student.html");
                    }
                });
                
                
                
            });

        </script>

        <script>
            function onLoginClick() {
                window.open("dashboard-student.html");
            }
        </script>
    </body>
</html>
