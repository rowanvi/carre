<%-- 
    Document   : person
    Created on : 4-okt-2016, 11:18:40
    Author     : Rowan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>User list</h1>

        <table> 
            <tr>
                <th>ID</th><th>Name</th><th>Country</th>

            </tr>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td>
                        <c:out value="${user.getId()}"></c:out>
                        </td>
                        <td>
                        <c:out value="${user.getName()}"></c:out>
                        </td>
                        <td>
                        <c:out value="${user.getCountry()}"></c:out>
                        </td>
                    </tr>
            </c:forEach>            
        </table>
    </body>
</html>
