<%
  java.util.Enumeration<String> en=session.getAttributeNames();
  while(en.hasMoreElements())
  {
      String name=en.nextElement();
      out.println(name+"<br>"+session.getAttribute(name));
  }
    %>