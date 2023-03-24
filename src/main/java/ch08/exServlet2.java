package ch08;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch08/exServlet2")
public class exServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//서블릿 라이프 사이클 : init, service, destory
	
	@Override //서블릿 처음 요청 한번만 실행
	public void init() throws ServletException {
		System.out.println("init호출");

	}
	
	@Override //Client가 요청이 있을때 마다 실행
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service호출");
	}
	
	@Override//서비스 종료 및 서블릿 코드가 수정이 될 때
	public void destroy() {
		System.out.println("destory호출");
	}
}
