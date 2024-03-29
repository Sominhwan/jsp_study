package ch08;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ch08/exServlet1")
public class ExServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest req, 
    		HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html; charset=UTF-8");
    	// 응답 스크림
    	PrintWriter out = resp.getWriter();
    	HttpSession session = req.getSession();
    	
    	out.println("<html>");
		out.println("<body>");
		out.println("<h1>이클립스로 서블릿 만들기</h1>");
		out.println("세션ID : " + session.getId());
		out.println("</body>");
		out.println("</html>");
    }
}
