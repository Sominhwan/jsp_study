package register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class RegisterPostServlet
 */
@WebServlet(name = "RegisterPostServlet", urlPatterns = { "/register/registerPost" })
public class RegisterPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		HttpSession session = request.getSession();
		PrintWriter writer = response.getWriter();
		RegisterBean bean = new RegisterBean();
		RegisterMgr mgr = new RegisterMgr();
		String id = (String) session.getAttribute("id");
		String pwd = (String) session.getAttribute("pwd");
		String name = (String) session.getAttribute("name");
		String profile = (String) session.getAttribute("profile");
		bean.setId(id);
		bean.setPwd(pwd);
		bean.setName(name);
		bean.setProfile(profile);
		mgr.insertMember(bean);
		String url = "register.jsp";
			writer.println("<script>alert('가입성공'); location.href='"+url+"';</script>"); 
			writer.close();
	}

}
