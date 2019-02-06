<%-- 
    Document   : welcome
    Created on : Jan 3, 2019, 10:38:56 PM
    Author     : monster
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Hello World Page</title>

        
    </head>
    <body>
        <%@include file="header.jsp" %>
        
        Greeting : ${greeting}
        
        <a href="dashboard">Go to dashboard</a>

        <script src="./res/jquery-3.3.1.js"></script>
        <script>
            $.ajax({
                method: "GET",
                url: "ws/testapi"
                //data: {name: "John", location: "Boston"}
            })
                    .done(function (msg) {
                        var data = JSON.parse(msg);
                        console.log("Data get: " + data.name);
                    });
        </script>
    </body>
</html>
