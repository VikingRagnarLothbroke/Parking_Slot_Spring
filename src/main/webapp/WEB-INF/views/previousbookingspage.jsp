<%@page import="com.twg.Time_SheeT.Entities.Bookingshistory"%>
<%@page import="java.util.List" %>
<% List<Bookingshistory> allentries=(List<Bookingshistory>)request.getAttribute("entries"); %>


<html>
<head>
    <style>
*{
    margin: 0%;
    padding: 0cap;
   
   }

    </style>
    
</head>

<body style="text-align: center">

    <table border="1">
        <tr>
    <th>Date</th>
     <th>SLOT</th>
        </tr> 
  <tr> 
    <% for(Bookingshistory entry:allentries){ %>
    <td><%=entry.getEntrydate() %></td>
    <td><%=entry.getSlot() %></td>
    <tr></tr>
<% } %>
</tr>

    </table>
</body>
</html>