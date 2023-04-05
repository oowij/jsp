<!-- mailSendProc.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="msend" class="mail.MailSend"/>
<%
	//전송 성공 및 실패 -> mailSend.jsp응답
	String id = request.getParameter("id");
	String email = request.getParameter("email");
	boolean result = msend.sendPwd(id, email);
	String msg = "전송실패";
	if(result){
		msg = "전송성공";
	}

%>
<script>
	alert("<%=msg%>");
	location.href = "mailSend.jsp";
</script>