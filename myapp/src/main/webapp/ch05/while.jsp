<!-- ch05/while.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.Random"%>
<%!
	public String randomColor(){
		Random r = new Random();
		String rgb = Integer.toHexString(r.nextInt(256));
		rgb += Integer.toHexString(r.nextInt(256));
		rgb += Integer.toHexString(r.nextInt(256));
		return "#"+rgb;
	}
%>
<%
	request.setCharacterEncoding("UTF-8");
	String msg = request.getParameter("msg");
	int number = Integer.parseInt(request.getParameter("number"));
	
	int count = 0;
	while(number>count){
%>
	<font color="<%=randomColor()%>"><%=msg%></font><p>
<%
		count++;
	}
%>
