<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="mgr" class="ch14.MemberMgr"/>
<jsp:useBean id="bean" class="ch14.MemberBean" scope="session"/>
<jsp:setProperty property="*" name="bean"/>
<%
	//가입을 하고 실패하면 '가입실패' 알림 member.jsp
	//가입을 하고 성공하면 '가입성공' 후에 login.jsp 응답(session에 id갑 저장)	
	boolean result = mgr.insertMember(bean);
	String msg = "가입 실패";
	String url = "member.jsp";
	if(result){
		msg = "가입 성공";
		url = "login.jsp";
		session.setAttribute("idkey", bean.getId());
	}
%>
<script>
	alert("<%=msg%>");
	location.href = "<%=url%>";
</script>