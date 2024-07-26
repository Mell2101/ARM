<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Clients</title>
</head>
<body>

<h1>Clients List</h1>
<table border="1">
    <thead>
    <tr>
        <th>ID</th>
        <th>Signing Date</th>
        <th>Contract Signed</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach var="contracts" items="${contracts}">
        <tr>
            <td>${contracts.id}</td>
            <td>${contracts.signingDate}</td>
            <td>${contract != null && contract.signed ? 'No' : 'Yes'}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
