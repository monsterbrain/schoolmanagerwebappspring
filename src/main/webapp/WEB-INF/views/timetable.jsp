<%-- 
    Document   : timetable
    Created on : Feb 13, 2019, 10:37:17 PM
    Author     : monster
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js h-100" lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Student Dashboard – Welcome Home !</title>
        <meta name="description" content="A high-quality &amp; free Bootstrap admin dashboard template pack that comes with lots of templates and components.">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://use.fontawesome.com/releases/v5.0.6/css/all.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" id="main-stylesheet" data-version="1.0.0" href="./res/styles/shards-dashboards.1.0.0.min.css">
        <link rel="stylesheet" href="./res/styles/extras.1.0.0.min.css">
        <script async defer src="https://buttons.github.io/buttons.js"></script>
        <link href='./res/plugins/fullcalendar/fullcalendar.min.css' rel='stylesheet' />
        <link href='./res/plugins/fullcalendar/fullcalendar.print.min.css' rel='stylesheet' media='print' />
    </head>
    <body class="h-100">
        <div class="container-fluid">
            <div class="row">

                <!-- Main Sidebar -->                
                <jsp:include page="MenuSidebar.jsp">
                    <jsp:param name="menu" value="objectValue"/>
                </jsp:include>
                <!-- End Main Sidebar -->

                <main class="main-content col-lg-10 col-md-9 col-sm-12 p-0 offset-lg-2 offset-md-3">
                    <div class="main-navbar sticky-top bg-white">
                        <!-- Main Navbar -->
                        <nav class="navbar align-items-stretch navbar-light flex-md-nowrap p-0">
                            <form action="#" class="main-navbar__search w-100 d-none d-md-flex d-lg-flex">
                                <div class="input-group input-group-seamless ml-3">
                                    <div class="input-group-prepend">
                                        <div class="input-group-text">
                                            <i class="fas fa-search"></i>
                                        </div>
                                    </div>
                                    <input class="navbar-search form-control" type="text" placeholder="Search for something..." aria-label="Search"> </div>
                            </form>
                            <ul class="navbar-nav border-left flex-row ">
                                <li class="nav-item border-right dropdown notifications">
                                    <a class="nav-link nav-link-icon text-center" href="#" role="button" id="dropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        <div class="nav-link-icon__wrapper">
                                            <i class="material-icons">&#xE7F4;</i>
                                            <span class="badge badge-pill badge-danger">2</span>
                                        </div>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-small" aria-labelledby="dropdownMenuLink">
                                        <a class="dropdown-item" href="#">
                                            <div class="notification__icon-wrapper">
                                                <div class="notification__icon">
                                                    <i class="material-icons">&#xE6E1;</i>
                                                </div>
                                            </div>
                                            <div class="notification__content">
                                                <span class="notification__category">Analytics</span>
                                                <p>Your website’s active users count increased by
                                                    <span class="text-success text-semibold">28%</span> in the last week. Great job!</p>
                                            </div>
                                        </a>
                                        <a class="dropdown-item" href="#">
                                            <div class="notification__icon-wrapper">
                                                <div class="notification__icon">
                                                    <i class="material-icons">&#xE8D1;</i>
                                                </div>
                                            </div>
                                            <div class="notification__content">
                                                <span class="notification__category">Sales</span>
                                                <p>Last week your store’s sales count decreased by
                                                    <span class="text-danger text-semibold">5.52%</span>. It could have been worse!</p>
                                            </div>
                                        </a>
                                        <a class="dropdown-item notification__all text-center" href="#"> View all Notifications </a>
                                    </div>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle text-nowrap px-3" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
                                        <img class="user-avatar rounded-circle mr-2" src="./res/images/avatars/0.jpg" alt="User Avatar">
                                        <span class="d-none d-md-inline-block">Sierra Brooks</span>
                                    </a>
                                    <div class="dropdown-menu dropdown-menu-small">
                                        <a class="dropdown-item" href="user-profile-lite.html">
                                            <i class="material-icons">&#xE7FD;</i> Profile</a>
                                        <a class="dropdown-item" href="components-blog-posts.html">
                                            <i class="material-icons">vertical_split</i> Blog Posts</a>
                                        <a class="dropdown-item" href="add-new-post.html">
                                            <i class="material-icons">note_add</i> Add New Post</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item text-danger" href="#">
                                            <i class="material-icons text-danger">&#xE879;</i> Logout </a>
                                    </div>
                                </li>
                            </ul>
                            <nav class="nav">
                                <a href="#" class="nav-link nav-link-icon toggle-sidebar d-md-inline d-lg-none text-center border-left" data-toggle="collapse" data-target=".header-navbar" aria-expanded="false" aria-controls="header-navbar">
                                    <i class="material-icons">&#xE5D2;</i>
                                </a>
                            </nav>
                        </nav>
                    </div>
                    <!-- / .main-navbar -->
                    <div class="main-content-container container-fluid px-4">
                        <!-- Page Header -->
                        <div class="page-header row no-gutters py-4">
                            <div class="col-12 col-sm-4 text-center text-sm-left mb-0">
                                <span class="text-uppercase page-subtitle">Overview</span>
                                <h3 class="page-title">Time-Table</h3>
                            </div>
                        </div>
                        <!-- End Page Header -->
                        <!-- Default Light Table -->
                        <div class="row">
                            <div class="col">
                                <div class="card card-small mb-4">
                                    <div class="card-header border-bottom">
                                        <h6 class="m-0">Monday - Feb 20, 2019</h6>
                                    </div>
                                    <div class="card-body p-0 pb-3 text-center">
                                        <table class="table mb-0" id="timeTable">
                                            <thead class="bg-light">
                                                <tr>
                                                    <th scope="col" class="border-0">Day</th>
                                                    <!--                                                    <th scope="col" class="border-0">First Name</th>
                                                                                                        <th scope="col" class="border-0">Last Name</th>
                                                                                                        <th scope="col" class="border-0">Country</th>
                                                                                                        <th scope="col" class="border-0">City</th>
                                                                                                        <th scope="col" class="border-0">Phone</th>-->
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <!--<tr>
                                                    <td>1</td>
                                                    <td>Ali</td>
                                                    <td>Kerry</td>
                                                    <td>Russian Federation</td>
                                                    <td>GdaÅ„sk</td>
                                                    <td>107-0339</td>
                                                </tr>-->
                                                <!--<tr>
                                                        <td>2</td>
                                                        <td>Clark</td>
                                                        <td>Angela</td>
                                                        <td>Estonia</td>
                                                        <td>Borghetto di Vara</td>
                                                        <td>1-660-850-1647</td>
                                                    </tr>
                                                    <tr>
                                                        <td>3</td>
                                                        <td>Jerry</td>
                                                        <td>Nathan</td>
                                                        <td>Cyprus</td>
                                                        <td>Braunau am Inn</td>
                                                        <td>214-4225</td>
                                                    </tr>
                                                    <tr>
                                                        <td>4</td>
                                                        <td>Colt</td>
                                                        <td>Angela</td>
                                                        <td>Liberia</td>
                                                        <td>Bad Hersfeld</td>
                                                        <td>1-848-473-7416</td>
                                                    </tr>-->
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!-- End Default Light Table -->
                    </div>
                    <footer class="main-footer d-flex p-2 px-3 bg-white border-top">
                        <ul class="nav">
                            <li class="nav-item">
                                <a class="nav-link" href="#">Home</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Services</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">About</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Products</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#">Blog</a>
                            </li>
                        </ul>
                        <span class="copyright ml-auto my-auto mr-2">Copyright © 2018
                            <a href="https://designrevision.com" rel="nofollow">DesignRevision</a>
                        </span>
                    </footer>
                </main>
            </div>
        </div>

        <script src='./res/jquery-3.3.1.js'></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.1/Chart.min.js"></script>-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.3/Chart.min.js"></script>
        <script src="https://unpkg.com/shards-ui@latest/dist/js/shards.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Sharrre/2.0.1/jquery.sharrre.min.js"></script>
        <script src="./res/scripts/extras.1.0.0.min.js"></script>
        <script src="./res/scripts/shards-dashboards.1.0.0.min.js"></script>
        <script src="./res/scripts/app/app-blog-overview.1.0.0.js"></script>

        <script src='./res/lib/moment.min.js'></script>

        <style>
            th:first-child {
                background-color: #B3E5FC;
            }

            td:first-child {
                background-color: #ebf9ff;
            }
        </style>
        <script>
            $.ajax({
                method: "GET",
                url: "getTimeTable",
                data: {}
            }).done(function (msg) {
                var data = JSON.parse(msg);
                console.log({data});
                if (data != null) {

                    $('#timeTable>tbody').append('<tr></tr>');
                    for (var i = 0; i < data.length; i++) {
                        // [1, "09:00:00 AM", "10:00:00 AM", "Jim Carrey", "Mathematics"]
                        var dayData = data[i];

                        // header set
                        $('#timeTable>thead>tr').append('<th scope="col" class="border-0"> Period ' + (dayData[0]) + '</th>');

                        // add day
                        i == 0 ? $('#timeTable>tbody>tr').append('<td>' + 'Monday' + '</td>') : 0;
                        // add subject
                        $('#timeTable>tbody>tr').append('<td>' + dayData[4] + '</td>');
                    }
                }
            });
        </script>
    </body>
</html>
