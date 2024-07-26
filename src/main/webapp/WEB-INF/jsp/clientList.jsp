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
        <th>First Name</th>
        <th>Last Name</th>
        <th>Phone Number</th>
        <th>Passport</th>
        <th>Loan Amount</th>
        <th>Approved Loan Amount</th>
        <th>Loan Term</th>
        <th>Status</th>
        <th>Contract Signed</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="application" items="${applications}">
        <tr>
            <td>${application.id}</td>
            <td>${application.firstName}</td>
            <td>${application.lastName}</td>
            <td>${application.contactPhone}</td>
            <td>${application.passport}</td>
            <td>${application.loanAmount}</td>
            <td>${application.approvedLoanAmount}</td>
            <td>${application.loanTerm}</td>
            <td>${application.status}</td>
            <td>${application.contract != null && application.contract.signed ? 'Yes' : 'No'}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
