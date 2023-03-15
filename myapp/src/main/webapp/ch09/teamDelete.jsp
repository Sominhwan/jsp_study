<!-- ch09/teamDelete.jsp -->
<%@page import="ch09.MyUtil"%>
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch09.TeamMgr"/>
<%
	int num = MyUtil.parseInt(request, "num");
	mgr.deleteTeam(num); // 삭제
	response.sendRedirect("teamList.jsp");
%>