<!-- ch06/forawrd2_2.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
String bloodType = request.getParameter("bloodType");	
String name = "홍길동";	
%>
<!-- 이페이지가 클라이언에게 응답된다. -->
<jsp:include page='<%=bloodType+".jsp"%>'>
	<jsp:param name="name" value="<%=name%>"/>
</jsp:include>