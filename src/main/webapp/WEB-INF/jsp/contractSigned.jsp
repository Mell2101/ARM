<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title>Contract Signed</title>
</head>
<body>
    <h1>Contract Signed</h1>
    <p>Thank you, your contract has been signed successfully.</p>
    <p>Contract ID: ${contract.id}</p>
    <p>Loan Amount: ${contract.loanApplication.approvedLoanAmount}</p>
    <p>Loan Term: ${contract.loanApplication.loanTerm} days</p>
    <p>Signing Date: ${contract.signingDate}</p>
    <p>Signed: ${contract.signed ? 'Yes' : 'No'}</p>

    <a href="/credit-manager">Return to the homepage</a>
</body>
</html>
