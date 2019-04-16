<%-- 
    Document   : MenuSidebar
    Created on : Feb 13, 2019, 10:39:15 PM
    Author     : monster
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%>

<aside class="main-sidebar col-12 col-md-3 col-lg-2 px-0">
    <div class="main-navbar">
        <nav class="navbar align-items-stretch navbar-light bg-white flex-md-nowrap border-bottom p-0">
            <a class="navbar-brand w-100 mr-0" href="#" style="line-height: 25px;">
                <div class="d-table m-auto">
                    <img id="main-logo" class="d-inline-block align-top mr-1" style="max-width: 25px;" src="./res/images/shards-dashboards-logo.svg" alt="Shards Dashboard">
                    <span class="d-none d-md-inline ml-1">My Dashboard</span>
                </div>
            </a>
            <a class="toggle-sidebar d-sm-inline d-md-none d-lg-none">
                <i class="material-icons">&#xE5C4;</i>
            </a>
        </nav>
    </div>
    <form action="#" class="main-sidebar__search w-100 border-right d-sm-flex d-md-none d-lg-none">
        <div class="input-group input-group-seamless ml-3">
            <div class="input-group-prepend">
                <div class="input-group-text">
                    <i class="fas fa-search"></i>
                </div>
            </div>
            <input class="navbar-search form-control" type="text" placeholder="Search for something..." aria-label="Search"> </div>
    </form>
    <div class="nav-wrapper">
        <ul class="nav flex-column">
            <%String menu=request.getParameter("menu"); %>
            <li class="nav-item">
                <a class="nav-link <% if(menu.equals("dashboard")){ out.print("active"); } %>" href="dashboard.html">
                    <i class="material-icons">edit</i>
                    <span>Home [Demo]</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="#">
                    <i class="material-icons">vertical_split</i>
                    <span>Marks</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="#">
                    <i class="material-icons">note_add</i>
                    <span>Assignments</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="#">
                    <i class="material-icons">view_module</i>
                    <span>Fees &amp; Payments</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link <% if(menu.equals("timetable")){ out.print("active"); } %>" href="timetable">
                    <i class="material-icons">table_chart</i>
                    <span>Time Table [Demo]</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="#">
                    <i class="material-icons">person</i>
                    <span>School Events</span>
                </a>
            </li>
            <li class="nav-item">
                <a class="nav-link " href="#">
                    <i class="material-icons">error</i>
                    <span>Fun &amp; Games</span>
                </a>
            </li>
        </ul>
    </div>
</aside>
