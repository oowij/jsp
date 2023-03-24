<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@page contentType="text/html; charset=UTF-8"%>
<%
	//업로드 파일 저장 위치
	final String SAVEFOLDER = "C:/Jsp/myapp/src/main/webapp/ch13/storage";
	//업로드 파일명 인코딩
	final String ENCODING = "UTF-8";
	//업로드 파일 크기
	final int MAXSIZE = 1024*1024*20;//20DB
	try{
		//request는 null임
		//두번째 매개변수가 재밌있는 놈임.
		MultipartRequest multi = new MultipartRequest(
				request, SAVEFOLDER, MAXSIZE, ENCODING, new DefaultFileRenamePolicy());
				//DefaultFileRenamePolicy는 이름이 같은 경우 a.txt -> a1.txt로 자동 저장됨. 덮어쓰기 걱정 ㄴㄴ
		String user = multi.getParameter("user");
		String title = multi.getParameter("title");
		String fileName = multi.getFilesystemName("myfile");
		String fileType = multi.getContentType("myfile");
		//파일정보
		File f = multi.getFile("myfile");
		long len = 0;
		if(f!=null)
			len = f.length();
		out.println("user: " + user + "<br>");
		out.println("title: " + title + "<br>");
		out.println("파일명: " + fileName + "<br>");
		out.println("파일타입: " + fileType+ "<br>");
		out.println("파일크기: " + len + "byte");
	}catch(Exception e){
		e.printStackTrace();
	}
%>