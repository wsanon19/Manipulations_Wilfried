package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class servletCreation
 */
@WebServlet("/servletCreation")
public class servletCreation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
//	@EJB
//	Creation config = new Creation();
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletCreation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//RequestDispatcher vue_creation = request.getRequestDispatcher("/WEB-INF/creation_vue.jsp");
		//vue_creation.forward(request, response);
		RequestDispatcher vue_creation = request.getRequestDispatcher("/WEB-INF/Test1.jsp");
		vue_creation.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession masession = request.getSession();
		System.out.println(request.getParameter("user_name") +";"+ request.getParameter("user_type") +";"+ request.getParameter("user_age"));
		
		masession.setAttribute("u_type", request.getParameter("user_type"));
		masession.setAttribute("u_name", request.getParameter("user_name"));
		response.sendRedirect("http://localhost:8080/battle_2/servletJeu"); //	Redirection vers la page de jeu
	}

}
