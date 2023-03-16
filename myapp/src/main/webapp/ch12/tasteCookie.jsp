<!-- tasteCookie.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%
		// 응답된 쿠키의 정보는 request에 저장
		Cookie []cookies = request.getCookies();
		if(cookies!=null){
			for(int i=0;i<cookies.length;i++){
		%>
			Cokkie Name : <%=cookies[i].getName() %><br>
			Cokkie Value : <%=cookies[i].getValue() %><br>
		<% 
			}
		}
%>