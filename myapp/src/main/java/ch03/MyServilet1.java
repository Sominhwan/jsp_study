package ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet1", urlPatterns = { "/ch03/myServlet1" })
public class MyServilet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>MyServlet1</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>Fighting Korea!!!</h1>");
	        out.println("</body>");
	        out.println("</html>");
	}

}
