<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
    <head>
        <title>product Page</title>
        <style type="text/css">
            .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
            .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
            .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
            .tg .tg-4eph{background-color:#f9f9f9}
        </style>
    </head>
    <body>
        <a href="/">HOME</a>
        <c:url var="addAction" value="${pageContext.request.contextPath}/admin/products/add" ></c:url>

        <form:form action="${addAction}" commandName="product">
            <table>
                <c:if test="${!empty product.id}">
                    <tr>
                        <td>
                            <form:label path="id">
                                <spring:message text="ID"/>
                            </form:label>
                        </td>
                        <td>
                            <form:input path="id" readonly="true" size="8"  disabled="true" />
                            <form:hidden path="id" />
                        </td> 
                    </tr>
                </c:if>
                <tr>
                    <td>
                        <form:label path="productnaam">
                            <spring:message text="Name"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="productnaam" />
                    </td> 
                </tr>
                <tr>
                    <td>
                        <form:label path="voorraad">
                            <spring:message text="Voorraad"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="voorraad" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <form:label path="prijs">
                            <spring:message text="Prijs"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="prijs" />
                    </td>
                </tr>
                	<tr>
		<td>
			<form:label path="omschrijving">
				<spring:message text="Omschrijving"/>
			</form:label>
		</td>
		<td>
			<form:input path="omschrijving" />
		</td>
	</tr>
                <tr>
                    <td>
                        <form:label path="categorieid">
                            <spring:message text="CategorieID"/>
                        </form:label>
                    </td>
                    <td>
                        <form:input path="categorieid" />
                    </td>
                </tr>
                	<tr>
		<td>
			<form:label path="image">
				<spring:message text="Image"/>
			</form:label>
		</td>
		<td>
			<form:input path="image" />
		</td>
	</tr>
        	<tr>
		<td>
			<form:label path="status">
				<spring:message text="Status"/>
			</form:label>
		</td>
		<td>
			<form:input path="status" />
		</td>
	</tr>
                <tr>
                    <td colspan="2">
                        <c:if test="${!empty product.productnaam}">
                            <input type="submit"
                                   value="<spring:message text="Edit Person"/>" />
                        </c:if>
                        <c:if test="${empty product.productnaam}">
                            <input type="submit"
                                   value="<spring:message text="Add Person"/>" />
                        </c:if>
                    </td>
                </tr>
            </table>	
        </form:form>
        <br>
        <br>
        <h3>Persons List</h3>
        <c:if test="${!empty listProduct}">
            <table class="tg">
                <tr>
                    <th width="80">ID</th>
                    <th width="80">Naam</th>
                    <th width="120">Voorraad</th>
                    <th width="120">Prijs</th>
                    <th width="80">CategorieID</th>
                    <th width="80">Image</th>
                    <th width="80">Status</th>
                    <th width="80">Edit</th>

                </tr>
                <c:forEach items="${listProduct}" var="product">
                    <tr>
                        <td>${product.id}</td>
                        <td>${product.productnaam}</td>
                        <td>${product.voorraad}</td>
                        <td>${product.prijs}</td>
                        <td>${product.categorieid}</td>
                        <td>${product.image}</td>
                        <td>${product.status}</td>
                       	<td><a href="<c:url value='${pageContext.request.contextPath}/admin/products/edit/${product.id}' />" >Edit</a></td>


                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>
