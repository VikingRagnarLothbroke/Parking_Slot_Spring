<%@page import="com.twg.Time_SheeT.Entities.User"%>
<% User user=(User)session.getAttribute("user"); %>
<html>
<head>
<link rel="stylesheet" href="/css/demo.css">
</head>
<body><table class="center" border="5">
    <tr>
      <td><a href="dateselect">BOOK SLOT</a></td>
    </tr>
    <tr>
      <td><a href="">ACTIVE BOOKINGS</a></td>  
    </tr>
    <tr>
        <td><form action="gethistory" method="post" ><input type="hidden" name="id" value=<%= user.getId() %>><button type="submit">BOOKING HISTORY</button></form></td>
  
    </tr>

  </table></body>
</html>