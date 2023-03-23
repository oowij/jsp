<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="bean" class="ch14.MemberBean"/>
<jsp:setProperty property="hobby" name="bean"/>
<%
	String hobby[] = request.getParameterValues("hobby");
	for(int i=0;i<hobby.length;i++){
		out.println(hobby[i] + "<br>");
	}
%><hr>
<%
	String hobby2[] = request.getParameterValues("hobby");
	for(int i=0;i<hobby2.length;i++){
		out.println(hobby2[i] + "<br>");
	}
%>