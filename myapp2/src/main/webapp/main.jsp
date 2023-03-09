<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="myapp2.MyUtil"%>

<%
	String money = "10000000";
%>
표현식 : <%=MyUtil.getMoneyForm(money)%><p>