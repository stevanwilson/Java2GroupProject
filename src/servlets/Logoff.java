package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Logoff")
public class Logoff extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public Logoff() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = request.getRequestURL().toString();
		HttpSession session = request.getSession();
		session.removeAttribute("User");
		response.sendRedirect(url);
	}


}
