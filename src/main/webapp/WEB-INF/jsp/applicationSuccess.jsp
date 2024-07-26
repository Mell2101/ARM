<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Application Status</title>
</head>
<body>
    <h1>Loan Application Status</h1>
    <p>Thank you for your application! We have processed your loan application.</p>
    <p>Below is the information about your application:</p>

    <c:if test="${not empty contractId}">
        <p>Your credit contract ID is: ${contractId}</p>
    </c:if>

    <table border="1">
        <tr>
            <th>Last Name</th>
            <td>${application.lastName}</td>
        </tr>
        <tr>
            <th>First Name</th>
            <td>${application.firstName}</td>
        </tr>
        <tr>
            <th>Middle Name</th>
            <td>${application.middleName}</td>
        </tr>
        <tr>
            <th>Passport Details</th>
            <td>${application.passport}</td>
        </tr>
        <tr>
            <th>Marital Status</th>
            <td>${application.maritalStatus}</td>
        </tr>
        <tr>
            <th>Address</th>
            <td>${application.address}</td>
        </tr>
        <tr>
            <th>Contact Phone</th>
            <td>${application.contactPhone}</td>
        </tr>
        <tr>
            <th>Employment Period</th>
            <td>${application.employmentPeriod}</td>
        </tr>
        <tr>
            <th>Position</th>
            <td>${application.position}</td>
        </tr>
        <tr>
            <th>Organization Name</th>
            <td>${application.organization}</td>
        </tr>
        <tr>
            <th>Desired Loan Amount</th>
            <td>${application.loanAmount}</td>
        </tr>
        <tr>
            <th>Status</th>
            <td>${application.status}</td>
            <c:if test="${application.status == 'Approved'}">
                    <form action="signContract" method="post">
                        <input type="hidden" name="contractId" value="${contractId}">
                        <button type="submit">Sign Contract</button>
                    </form>
            </c:if>
        </tr>

        <tr>
            <th>Approved Loan Amount</th>
            <td>${application.approvedLoanAmount}</td>
        </tr>
        <tr>
            <th>Loan Term (days)</th>
            <td>${application.loanTerm}</td>
        </tr>
    </table>


    <p>A manager will contact you shortly to clarify details.</p>

    <a href="/credit-manager">Return to the homepage</a>
</body>
</html>
