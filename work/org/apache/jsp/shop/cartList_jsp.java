/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-04-06 03:00:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.shop;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import shop.ProductBean;
import java.util.Enumeration;
import shop.UtilMgr;
import shop.OrderBean;
import java.util.Hashtable;

public final class cartList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/shop/bottom.jsp", Long.valueOf(1680680625479L));
    _jspx_dependants.put("/shop/top.jsp", Long.valueOf(1680680637629L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("shop.OrderBean");
    _jspx_imports_classes.add("java.util.Enumeration");
    _jspx_imports_classes.add("shop.ProductBean");
    _jspx_imports_classes.add("shop.UtilMgr");
    _jspx_imports_classes.add("java.util.Hashtable");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!-- cartList.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      shop.CartMgr cMgr = null;
      synchronized (session) {
        cMgr = (shop.CartMgr) _jspx_page_context.getAttribute("cMgr", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (cMgr == null){
          cMgr = new shop.CartMgr();
          _jspx_page_context.setAttribute("cMgr", cMgr, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      shop.ProductMgr pMgr = null;
      pMgr = (shop.ProductMgr) _jspx_page_context.getAttribute("pMgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (pMgr == null){
        pMgr = new shop.ProductMgr();
        _jspx_page_context.setAttribute("pMgr", pMgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	if((String)session.getAttribute("idKey")==null){
		response.sendRedirect("login.jsp");
		return;//이후에 코드를 무력화
	}
	Hashtable<Integer, OrderBean> hCart = cMgr.getCartList();
	int totalPrice = 0;

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Simple Shopping Mall</title>\r\n");
      out.write("<script src=\"script.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#996600\" topmargin=\"100\">\r\n");
      out.write("	");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\r\n");

	String id = (String)session.getAttribute("idKey");
	
	String log="";
	if(id == null) log ="<a href=login.jsp>로그인</a>";
	else log = "<a href=logout.jsp>로그아웃</a>";

	String reg="";
	if(id == null) reg ="<a href=member.jsp>회원가입</a>";
	else reg = "<a href=memberUpdate.jsp>회원수정</a>";

      out.write("\r\n");
      out.write("<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("  <tr bgcolor=\"#FFCC00\"> \r\n");
      out.write("    <th>");
      out.print(log);
      out.write("</th>\r\n");
      out.write("    <th>");
      out.print(reg);
      out.write("</th>\r\n");
      out.write("    <th><a href=\"productList.jsp\">상품목록</a></th>\r\n");
      out.write("    <th><a href=\"cartList.jsp\">장바구니</a></th>\r\n");
      out.write("    <th><a href=\"orderList.jsp\">구매목록</a></th>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>\r\n");
      out.write("\r\n");
      out.write("	<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("	<tr>\r\n");
      out.write("	<td align=\"center\" bgcolor=\"#FFFFCC\">\r\n");
      out.write("		<table width=\"95%\" align=\"center\" bgcolor=\"#FFFF99\" border=\"1\">\r\n");
      out.write("			<tr align=\"center\" bgcolor=\"#996600\">\r\n");
      out.write("				<td><font color=\"#FFFFFF\">제품</font></td>\r\n");
      out.write("				<td><font color=\"#FFFFFF\">수량</font></td>\r\n");
      out.write("				<td><font color=\"#FFFFFF\">가격</font></td>\r\n");
      out.write("				<td><font color=\"#FFFFFF\">수정/삭제</font></td>\r\n");
      out.write("				<td><font color=\"#FFFFFF\">조회</font></td>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
if(hCart.isEmpty()){
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"5\" align=\"center\">장바구니는 비어 있습니다.</td>\r\n");
      out.write("			</tr>	\r\n");
      out.write("			");
}else{
				//Hashtable에 저장된 키값을 리턴
				Enumeration<Integer> hCartkey = hCart.keys();
				while(hCartkey.hasMoreElements()){
					//키값으로 주문객체를 리턴
					OrderBean order = hCart.get(hCartkey.nextElement());
					int productNo = order.getProductNo();
					//상품정보를 리턴
					ProductBean pbean = pMgr.getProduct(productNo);
					String pName = pbean.getName();
					int price = pbean.getPrice();
					int quantity = order.getQuantity();
					int subTotal = price * quantity;//주문가격
					//전체주문가격
					totalPrice+=subTotal;
			
      out.write("\r\n");
      out.write("			<tr align=\"center\">\r\n");
      out.write("			<form method=\"post\" action=\"cartProc.jsp\">\r\n");
      out.write("				<input type=\"hidden\" name=\"productNo\" value=\"");
      out.print(productNo);
      out.write("\">\r\n");
      out.write("				<td>");
      out.print(pName);
      out.write("</td>\r\n");
      out.write("				<td><input name=\"quantity\" style = \"text-align:right;\" \r\n");
      out.write("					value=\"");
      out.print(quantity);
      out.write("\" size=\"3\">개</td>\r\n");
      out.write("				<td>");
      out.print(UtilMgr.monFormat(subTotal));
      out.write("</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<input type=\"button\" value=\"수정\" size=\"3\" onclick=\"javascript:cartUpdate(this.form)\"> /\r\n");
      out.write("					<input type=\"button\" value=\"삭제\" size=\"3\" onclick=\"javascript:cartDelete(this.form)\">\r\n");
      out.write("				</td>\r\n");
      out.write("				<td>\r\n");
      out.write("					<a href=\"javascript:productDetail('");
      out.print(productNo);
      out.write("')\">상세보기</a>\r\n");
      out.write("				</td>\r\n");
      out.write("				<input type=\"hidden\" name=\"flag\">\r\n");
      out.write("				</form>\r\n");
      out.write("			</tr>\r\n");
      out.write("			");
}//while
      out.write("				\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"4\" align=\"right\">\r\n");
      out.write("					총 주문금액 : ");
      out.print(UtilMgr.monFormat(totalPrice));
      out.write("원	\r\n");
      out.write("				</td>\r\n");
      out.write("				<td align=\"center\">\r\n");
      out.write("					<a href=\"orderProc.jsp\">주문하기</a>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("		");
}
      out.write("\r\n");
      out.write("		</table>\r\n");
      out.write("	</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	</table>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<table width=\"75%\" align=\"center\" bgcolor=\"#FFFF99\">\r\n");
      out.write("  <tr bgcolor=\"#FFCC00\">\r\n");
      out.write("  <th width=\"90%\">\r\n");
      out.write("  Simple Shopping Mall 에 오신 것을 환영합니다.\r\n");
      out.write("  </th>\r\n");
      out.write("  <th><a href=\"admin/index.jsp\">관리자</a></th>\r\n");
      out.write("  </tr>\r\n");
      out.write("</table>");
      out.write("\r\n");
      out.write("	<form name=\"detail\" method=\"post\" action=\"productDetail.jsp\" >\r\n");
      out.write("		<input type=\"hidden\" name=\"no\">\r\n");
      out.write("	</form>	\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
