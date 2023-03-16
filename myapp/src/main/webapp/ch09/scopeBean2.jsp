<!-- ch09/scopeBean2.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
	// 세션에 특정한 값만 제거
	session.removeAttribute("sBean");
	// 세션 전체를 제거, 무효화, 초기화
	session.invalidate();
	response.sendRedirect("scopeBean.jsp");
%>
