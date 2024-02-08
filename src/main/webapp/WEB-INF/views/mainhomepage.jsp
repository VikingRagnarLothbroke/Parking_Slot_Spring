<%@page import="com.twg.Time_SheeT.Entities.User"%>
<%@page import="com.twg.Time_SheeT.Entities.Entry"%>
<%@page import="java.util.List" %>
<% List<Entry> slots=(List<Entry>)request.getAttribute("entries"); %>
<% User user=(User)session.getAttribute("user"); %>

<html>
<head>
    <link rel="stylesheet" href="/css/demo.css">
</head>
<body style="text-align: center;"><table class="center" border="5">
    <tr>
      <th>BOOK SLOT</th>
      <th>STATUS</th>
      <th>BOOKNOW</th>
      
    
    </tr>
    <tr>
        <td><a href="">slot-1</a></td>
        <% if (slots.get(0).getStatus()==0) { %>
        <td>Available</td>
        <form action="slotbook">
            <input type="hidden" name="mahesh" value=<%=slots.get(0).getId() %>>
        <input type="hidden" name="slot" value=<%=slots.get(0).getSlot() %>>
        <input type="hidden" name="date" value=<%=slots.get(0).getDate() %>>
        <input type="hidden" name="entrydate" value=<%=slots.get(0).getDate() %>>
        <input type="hidden" name="userid" value=<%=user.getId() %>>
        
        <td><button type="submit">Book</button></td>
        </form>
    
        <%} else {%>
            <td>Not Available</td>
  
       <% } %>
       
    
    </tr>
    <tr>
        <td><a href="">slot-2</a></td>
        <% if (slots.get(1).getStatus()==0) { %>
        <td>Available</td>
        <form action="slotbook">
            <input type="hidden" name="mahesh" value=<%=slots.get(1).getId() %>>
        <input type="hidden" name="slot" value=<%=slots.get(1).getSlot() %>>
        <input type="hidden" name="date" value=<%=slots.get(1).getDate() %>>
        <input type="hidden" name="entrydate" value=<%=slots.get(1).getDate() %>>
        <input type="hidden" name="userid" value=<%=user.getId() %>>
        
        <td><button type="submit">Book</button></td>
        </form>
    
        <%} else {%>
      
       <td>Not Available</td>
  
       <% } %>

    
      
    </tr>
    <tr>
        <td><a href="">slot-3</a></td>
        <% if (slots.get(2).getStatus()==0) { %>
        <td>Available</td>
        <form action="slotbook">
        <input type="hidden" name="mahesh" value=<%=slots.get(2).getId() %>>
        <input type="hidden" name="slot" value=<%=slots.get(2).getSlot() %>>
        <input type="hidden" name="date" value=<%=slots.get(2).getDate() %>>
        <input type="hidden" name="entrydate" value=<%=slots.get(2).getDate() %>>
        <input type="hidden" name="userid" value=<%=user.getId() %>>
       
        <td><button type="submit">Book</button></td>
        </form>
        
        <%} else {%>
      
       <td>Not Available</td>
  
       <% } %>
       
      
    </tr>
    <tr>
        <td><a href="">slot-4</a></td>
        <% if (slots.get(3).getStatus()==0) { %>
        <td>Available</td>
        <form action="slotbook">
        <input type="hidden" name="mahesh" value=<%=slots.get(3).getId() %>>
        <input type="hidden" name="slot" value=<%=slots.get(3).getSlot() %>>
        <input type="hidden" name="date" value=<%=slots.get(3).getDate() %>>
        <input type="hidden" name="entrydate" value=<%=slots.get(3).getDate() %>>
        <input type="hidden" name="userid" value=<%=user.getId() %>>
        
        <td><button type="submit">Book</button></td>
        </form>
    
        <%} else {%>
            <td>Not Available</td>
  
       <% } %>
    
    </tr>
    <tr>
      <td><a href="">slot-5</a></td>
      <% if (slots.get(4).getStatus()==0) { %>
      <td>Available</td>
      <form action="slotbook">
    <input type="hidden" name="mahesh" value=<%=slots.get(4).getId() %>>
    <input type="hidden" name="slot" value=<%=slots.get(4).getSlot() %>>
    <input type="hidden" name="date" value=<%=slots.get(4).getDate() %>>
    <input type="hidden" name="entrydate" value=<%=slots.get(4).getDate() %>>
    <input type="hidden" name="userid" value=<%=user.getId() %>>
    
    <td><button type="submit">Book</button></td>
    </form>

    <%} else {%>
        <td>Not Available</td>
  
       <% } %>
    
      
    </tr>
  
  </table>
 

</body>
</html>