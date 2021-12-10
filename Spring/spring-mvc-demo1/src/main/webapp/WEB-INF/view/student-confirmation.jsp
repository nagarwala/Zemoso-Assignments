<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<head>
<title> Student Confirmation</title>
</head>

<body>

<h2> The student is confirmed:  ${student.firstName} ${student.lastName} </h2>
<h3> Country is: ${student.country} </h3>
<h3> The favourite language is: ${student.favouriteLanguage} </h3>

<h3> Operating Systems </h3>
<ul>
      <c:forEach var="temp" items="${student.operatingSystems}">
         <li> ${temp} </li>
       </c:forEach>
</ul>

</body>

</html>