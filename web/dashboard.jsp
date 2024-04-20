<%
    //to read something session skip  the first step 
    String uid =(String)session.getAttribute("Userid");
      if(uid==null)
       response.sendRedirect("index.jsp");
%>
<html>
    <body>
        
        <h1>user Dashboard</h1>
        <hr>
        <pre>
        <a href="activeservlet">TotalActiveCase</a>
        <a href="deathservlet">TotalDeathCase</a>
        <a href="recoverservlet">TotalRecoreCase</a>
        <a href="killsession">Login</a>
  </pre>
        </hr>
    </body>
</html>
