<%-- 
    Document   : login
    Created on : Mar 21, 2024, 10:04:52 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="authentication/login" method="GET">
            <div>
                Username
                <input type="text" name="user" required="">
            </div>
            <div>
                Password
                <input type="password" name="pass" required="">
            </div>
            <div>
                <input type="submit" value="Login">
            </div>
        </form>
    </body>
</html>
