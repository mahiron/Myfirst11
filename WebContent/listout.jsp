<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="bean.KaiinBean" %>
    <jsp:useBean id="bean" class="bean.ListoutBean" scope="request" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% for(KaiinBean kaiin : bean.getList()) { %>
<%=kaiin.getId() %>
<%=kaiin.getName() %>
<%=kaiin.getDate() %>
<%=kaiin.getSex() %><br>
<%} %>
</body>
</html>