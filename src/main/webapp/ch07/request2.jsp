<%@page import="ch07.MyUtil"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%
	String protocal = request.getProtocol();
	int port = request.getLocalPort();
	//ip값
	String remoteAddr = request.getRemoteAddr();
	String uri = request.getRequestURI();
	StringBuffer url =request.getRequestURL();
	//?이후에 요청 조건값
	String query = request.getQueryString();
	//정수타입으로 매개변수 받는 방법
	int age = Integer.parseInt(request.getParameter("age"));
	int age2 = MyUtil.parseInt(request, "age");
%>
protocal : <%=protocal%><br>
port : <%=port%><br>
remoteAddr : <%=remoteAddr%><br>
uri : <%=uri%><br>
url : <%=url%><br>
query : <%=query%><br>
