<!-- member.jsp -->
<%@page contentType="text/html; charset=UTF-8" %>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("pwd");
	String name = request.getParameter("name");
	String profile = "profile";
	session.setAttribute("id", id);
	session.setAttribute("pwd", password);
	session.setAttribute("name", name);
	session.setAttribute("profile", profile);

%>
<!doctype html>
<html>
<head>
<title>회원가입</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
	function sign() {
		document.regFrm.submit();
		
	} 
</script>
</head>
<body bgcolor="#FFFFCC" onLoad="regFrm.id.focus()">
	<div align="center">
		<br /><br />
		<form name="regFrm" method="post" action="registerPost">
			<table cellpadding="5">
				<tr>
					<td bgcolor="#FFFFCC">
						<table border="1" cellspacing="0" cellpadding="2" width="600">
							<tr bgcolor="#996600">
								<td colspan="3"><font color="#FFFFFF"><b>회원 가입</b></font></td>
							</tr>
							<tr>
								<td width="20%">아이디</td>
								<td width="50%">
									<input name="id" size="15"> 
								
								</td>
								<td width="30%">아이디를 적어 주세요.</td>
							</tr>
							<tr>
								<td>비밀번호</td>
								<td><input type="password" name="pwd" size="15"></td>
								<td>비밀번호를 적어주세요.</td>
							</tr>
							<tr>
								<td>이름</td>
								<td><input name="name" size="15">
								</td>
								<td>이름을 적어주세요.</td>
							</tr>
							<tr>
								<td>회원 프로필 파일찾기</td> 
     							<td><input type="file" name="filename" size="50" maxlength="50"></td>
     							<td>업로드할 프로필 사진을 선택하세요</td>
    						</tr>

							
							<tr>
								<td colspan="3" align="center">
								   <input type="button" value="회원가입" onclick="sign()">
						
								 </td>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>