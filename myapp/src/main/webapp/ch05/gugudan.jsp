<!-- ch05/gugudan.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>

<body style="background-color: black">
	<div class="row mt-5">
		<div class="col">
			<div class="card" style="border: none">
				<div class="card-header border-0 pb-0"
					style="background-color: #17181e">
					<h1 class="text-black fs-30" style="color: #ffb11a">&nbsp;구구단</h1>
				</div>
			</div>
			
		</div>
	</div>
	<div class="card" style="border: none">
		<div class="card-body pb-0 pt-1" style="background-color: #17181e">
			<div class="table-responsive">
				<%
				for (int i = 1; i < 10; i++) {
				%>
				<table class="table text-center"
					style="background-color: #17181e; border-color: gray">
					<thead>
						<tr style="color: #20B26C">
							<th>&nbsp;<%=i%>단
							</th>
						</tr>
						<tr>
							<%
							for (int j = 1; j < 10; j++) {
							%>
							<td style="color: #eeeeee;">&nbsp;<%=i%> x <%=j%> = <%=i * j%>
								&nbsp;
							</td>
							<%
							}
							%>
							<hr>
						</tr>
					</thead>
					<%
					}
					%>
					</div>
					</div>
					</div>
</body>
<%

%>
