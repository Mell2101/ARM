<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Clients</title>
</head>
<body>
<h2>Clients</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${clients}" var="client">
        <tr>
            <td>${client.id}</td>
            <td>${client.name}</td>
            <td>${client.address}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="clients/add">Add New Client</a>
</body>
</html>
