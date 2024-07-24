<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
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
<body>
    <h1>Loan Application Form</h1>
    <form action="${pageContext.request.contextPath}/submitApplication" method="post" accept-charset="UTF-8">
        <label for="firstName">First Name:</label>
        <input type="text" id="firstName" name="firstName" required /><br/>

        <label for="lastName">Last Name:</label>
        <input type="text" id="lastName" name="lastName" required /><br/>

        <label for="middleName">Middle Name:</label>
        <input type="text" id="middleName" name="middleName" /><br/>

        <label for="passport">Passport Data:</label>
        <input type="text" id="passport" name="passport" required /><br/>

        <label for="maritalStatus">Marital Status:</label>
        <input type="text" id="maritalStatus" name="maritalStatus" required /><br/>

        <label for="address">Address:</label>
        <input type="text" id="address" name="address" required /><br/>

        <label for="contactPhone">Contact Phone:</label>
        <input type="text" id="contactPhone" name="contactPhone" required /><br/>

        <label for="employmentPeriod">Employment Period:</label>
        <input type="text" id="employmentPeriod" name="employmentPeriod" required /><br/>

        <label for="position">Position:</label>
        <input type="text" id="position" name="position" required /><br/>

        <label for="organization">Organization Name:</label>
        <input type="text" id="organization" name="organization" required /><br/>

        <label for="loanAmount">Desired Loan Amount:</label>
        <input type="number" id="loanAmount" name="loanAmount" required /><br/>

        <input type="submit" value="Submit Application" />
    </form>
</body>
</html>
