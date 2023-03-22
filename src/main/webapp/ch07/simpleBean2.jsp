<!-- ch09/simpleBean2.jsp -->
<%@page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="bean" class="ch09.SimpleBean"/>
<jsp:setProperty property="" name="bean"/>
<%-- <jsp:setProperty property="msg" name="bean"/>
<jsp:setProperty property="cnt" name="bean"/> 
이 두줄이 위에 한줄로 요약--%>
<h3>SimpleBean2</h3>
msg : <%=bean.getMsg()%><br>
cnt : <%=bean.getCnt()%><br>
msg : <jsp:getProperty property="msg" name="bean"/><br>
cnt : <jsp:getProperty property="cnt" name="bean"/><br>