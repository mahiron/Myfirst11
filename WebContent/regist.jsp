<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="bean.KaiinBean" %>
<jsp:useBean id="bean" class="bean.RegistBean" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=bean.getMessege() %><br>
<% for(KaiinBean kaiin : bean.getList().getList()) { %>
<%=kaiin.getId() %>
<%=kaiin.getName() %>
<%=kaiin.getDate() %>
<%=kaiin.getSex() %><br>
<%} %>
<form  method="POST" action="index.html">
  <input type="submit" value="戻る"><br><br>
</form>

</body>
</html>