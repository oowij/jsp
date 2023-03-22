<%@page contentType="text/html; charset=UTF-8"%>
<%
	//세션에 특정한 값만 제거
	session.removeAttribute("pBean");
	//세션의 전체를 제거, 무효화, 초기화
	session.invalidate();//로그인 만들 때
	response.sendRedirect("scopeBean.jsp");
%>