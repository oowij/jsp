<!-- /ch05/script.jsp -->
<%@ page contentType="text/html; charset=UTF-8"%>
<!-- 선언문() -->
<%!
	//필드 선언
	String dec = "선언문 변수";
	//메소드 선언
	public String decMethod(){
		return dec;
	}
%>
<!-- 스크립트(Scriptlet) -->
<%
	String scriptlet = "스크립트릿";
	out.println("내장객체를 이용한 출력: " + dec + "<p>");
%>
<!-- 표현문(Expression) -->
선언문1 : <%=dec%><p>
선언문2 : <%=decMethod()%><p>
선언문3 : <%=scriptlet%><p> 
<!-- JSP 주석 <%=%>-->
