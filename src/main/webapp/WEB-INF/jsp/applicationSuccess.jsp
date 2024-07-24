<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Loan Application Accepted</title>
    <link rel="stylesheet" href="styles.css"> <!-- Link to styles, if needed -->
</head>
<body>
    <h1>Loan Application Accepted</h1>
    <p>Thank you for your application! We have received your loan application.</p>
    <p>Below is the information about your application:</p>

    <table border="1">
        <tr>
            <th>Last Name</th>
            <td>${client.lastName}</td>
        </tr>
        <tr>
            <th>First Name</th>
            <td>${client.firstName}</td>
        </tr>
        <tr>
            <th>Middle Name</th>
            <td>${client.middleName}</td>
        </tr>
        <tr>
            <th>Passport Details</th>
            <td>${client.passport}</td>
        </tr>
        <tr>
            <th>Marital Status</th>
            <td>${client.maritalStatus}</td>
        </tr>
        <tr>
            <th>Address</th>
            <td>${client.address}</td>
        </tr>
        <tr>
            <th>Contact Phone</th>
            <td>${client.contactPhone}</td>
        </tr>
        <tr>
            <th>Employment Period</th>
            <td>${client.employmentPeriod}</td>
        </tr>
        <tr>
            <th>Position</th>
            <td>${client.position}</td>
        </tr>
        <tr>
            <th>Organization Name</th>
            <td>${client.organization}</td>
        </tr>
        <tr>
            <th>Desired Loan Amount</th>
            <td>${client.loanAmount}</td>
        </tr>
    </table>

    <p>A manager will contact you shortly to clarify details.</p>

    <a href="/">Return to the homepage</a> <!-- Link to the homepage or a new application page -->
</body>
</html>
