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
    <title>Search Clients</title>
</head>
<body>
<h1>Search Clients</h1>
<form action="search" method="get">
    <label for="phone">Phone:</label>
    <input type="text" id="phone" name="phone">

    <label for="firstName">First Name:</label>
    <input type="text" id="firstName" name="firstName">

    <label for="lastName">Last Name:</label>
    <input type="text" id="lastName" name="lastName">

    <label for="passport">Passport:</label>
    <input type="text" id="passport" name="passport">

    <button type="submit">Search</button>
</form>
-
<form action="apply" method="get">
    <button type="submit">Loan Application Form</button>
</form>

<form action="creditContractBySigned" method="get">
    <input type="hidden" name="signed" value="true"/>
    <button type="submit">Show Signed Credit Contract</button>
</form>

<form action="applicationsByStatus" method="get">
    <input type="hidden" name="status" value="Approved"/>
    <button type="submit">Show Approved Contracts</button>
</form>
</body>
</html>
