/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-04-05 02:37:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.ch16;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import ch16.PollItemBean;
import java.util.Vector;
import ch16.PollListBean;
import ch16.UtilMgr;

public final class pollView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Vector");
    _jspx_imports_classes.add("ch16.PollListBean");
    _jspx_imports_classes.add("ch16.PollItemBean");
    _jspx_imports_classes.add("java.util.Random");
    _jspx_imports_classes.add("ch16.UtilMgr");
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

      out.write("<!-- pollview.jsp -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      ch16.PollMgr mgr = null;
      mgr = (ch16.PollMgr) _jspx_page_context.getAttribute("mgr", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (mgr == null){
        mgr = new ch16.PollMgr();
        _jspx_page_context.setAttribute("mgr", mgr, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');

	int listNum = 0;
	if(request.getParameter("num")!=null){
		listNum = UtilMgr.parseInt(request, "num");
	}
	// 어떤 설문에 대한 값 
	PollListBean plBean = mgr.getPoll(listNum);
	Vector<PollItemBean> vlist = mgr.getView(listNum);
	// 현재 설문에 sum 투표수
	int sumCnt = mgr.sumCount(listNum);
	// 현재 설문에 가장 높은 투표수
	int maxCnt = mgr.getMaxCount(listNum);
	

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>JSP Poll</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body bgcolor=\"#FFFFCC\">\r\n");
      out.write("<div align=\"center\"><br/>\r\n");
      out.write("<h2>투표 결과</h2>\r\n");
      out.write("<table border=\"1\" width=\"400\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"4\"><b>Q : ");
      out.print(plBean.getQuestion());
      out.write("</b></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td colspan=\"3\"><b>총 투표자 :  ");
      out.print(sumCnt);
      out.write("명</b></td>\r\n");
      out.write("		<td width=\"40\"><b>count(%)</b></td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");

			Random r = new Random();
			for(int i=0;i<vlist.size();i++){
				PollItemBean piBean = vlist.get(i);
				String item = piBean.getItem()[0];
				int count = piBean.getCount();
				// 투표수/총투표수*100
				int ratio = (int)(Math.round((double)count/sumCnt*100));
				// 랜덤한 색상 
				String rgb = "#"+Integer.toHexString(r.nextInt(255*255*255));
	
      out.write("		\r\n");
      out.write("	<tr>\r\n");
      out.write("		<td width=\"20\" align=\"center\">");
      out.print(i+1);
      out.write("</td>\r\n");
      out.write("		<td width=\"120\">\r\n");
      out.write("			");
if(maxCnt==count){
      out.write("<font color=\"red\"><b>");
}
      out.write("\r\n");
      out.write("			");
      out.print(item);
      out.write("\r\n");
      out.write("			");
if(maxCnt==count){
      out.write("</b></font>");
}
      out.write("\r\n");
      out.write("		</td>\r\n");
      out.write("		<td>\r\n");
      out.write("			<table width=\"");
      out.print(ratio);
      out.write("\"height=\"15\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td bgcolor=\"");
      out.print(rgb);
      out.write("\">\r\n");
      out.write("				</td>\r\n");
      out.write("			</table>\r\n");
      out.write("			\r\n");
      out.write("		</td>\r\n");
      out.write("		<td width=\"40\">");
      out.print(count);
      out.write('(');
      out.print(ratio);
      out.write(")</td>\r\n");
      out.write("	</tr>\r\n");
      out.write("	");
}//---for
      out.write("\r\n");
      out.write("</table><br>\r\n");
      out.write("<a href=\"javascript:window.close()\">닫기</a>\r\n");
      out.write("</div>\r\n");
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
