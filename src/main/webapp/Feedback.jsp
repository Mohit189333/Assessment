<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 15-05-2025
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Feedback Form</title>
</head>
<body>
<h2>Feedback Form</h2>
<form action="feedbackservlet" method="post">

    Name:
    <input type="text" name="name" required><br>
    Email:
    <input type="email" name="email" required><br>
    Course:
    <input type="text" name="course" required><br>
    Rating:
    <select name="rating" required>
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
    </select><br><br>
    Comments:
    <textarea name="comments" rows="4" cols="50" required></textarea><br><br>
    <input type="submit" value="Submit">

</form>

</body>
</html>
