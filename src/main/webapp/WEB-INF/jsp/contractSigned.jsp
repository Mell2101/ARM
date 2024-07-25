<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
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
</body>
</html>
