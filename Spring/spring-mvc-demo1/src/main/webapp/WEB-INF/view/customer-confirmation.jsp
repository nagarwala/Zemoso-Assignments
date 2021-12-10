<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>
<title> Customer Confirmation</title>
</head>

<body>

<h2> The customer is confirmed:  ${customer.firstName} ${customer.lastName} </h2>
<h2>The free passes given: ${customer.freePasses}</h2>
<h2>Postal Code: ${customer.postalCode}</h2>
<h2>Course Code: ${customer.courseCode}</h2>


</body>

</html>