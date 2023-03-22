<%@page contentType="text/html; charset=UTF-8"%>
<%
	String id = request.getParameter("id");	
	String pwd = request.getParameter("pwd");
	//DB에 왔다 갔다 가정하고~~ 응 알겠어^^
	boolean result = true;
	String msg = "로그인 실패하였습니다.";
	//msg 가득 애미야 국이 짜다~~~
	String url = "login.jsp";
	if(result){
		msg = "국이 짜다 님이 로그인 되었습니다.";
		url ="loginOK.jsp";
		session.setAttribute("idKey", id);
	}
%>
<!-- 요즘은 잘 안쓴다는데 왜 -->
<script>
	alert("<%=msg%>");
	location.href = "<%=url%>";
</script>