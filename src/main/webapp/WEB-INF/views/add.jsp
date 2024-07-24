<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Client</title>
</head>
<body>
<h2>Add Client</h2>
<form action="add" method="post">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    <br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address" required>
    <br>
    <button type="submit">Add</button>
</form>
</body>
</html>
