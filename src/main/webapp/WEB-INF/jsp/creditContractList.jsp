<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Application Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        h1 {
            color: #333;
        }
        form {
            max-width: 600px;
            margin: auto;
        }
        label {
            display: block;
            margin-top: 10px;
        }
        input[type="text"], input[type="number"] {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ddd;
            border-radius: 4px;
        }
        input[type="submit"] {
            margin-top: 20px;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            background-color: #28a745;
            color: white;
            font-size: 16px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #218838;
        }
    </style>
</head>

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

<a href="/credit-manager">Return to the homepage</a>
</body>
</html>
