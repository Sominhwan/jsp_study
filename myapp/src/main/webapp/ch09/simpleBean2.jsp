<!-- ch09/simpleBean2.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="bean" class="ch09.SimpleBean"/>
<!--jsp:setProperty property="msg" name="bean"/-->
<!--jsp:setProperty property="cnt" name="bean"/-->
<!-- property="*" 는 모든 변수를 선언하다와 같은 뜻 -->
<jsp:setProperty property="*" name="bean"/>
<h3>SimplBean2</h3>
msg : <%=bean.getMsg()%><br>
cnt : <%=bean.getCnt()%><br>
msg : <jsp:getProperty property="msg" name="bean"/><br>
cnt : <jsp:getProperty property="cnt" name="bean"/><br>