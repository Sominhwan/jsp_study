<!-- ch12/cookCookie.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
	String cookieName = "myCookie";
	// 쿠키를 생성
	Cookie cookie = new Cookie(cookieName,"Apple");
	cookie.setMaxAge(60); // 1분
	// 쿠키의 값을 변경
	cookie.setValue("Melon");
	// 쿠키 생성은 JSP 에서 했지만 Client 에게 전송
	response.addCookie(cookie);
%>
쿠키를 만들었습니다.<br>
쿠키 내용은 <a href="tasteCookie.jsp">여기로!!</a>
