package servlets;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import partie_jeu.Partie;

/**
 * Servlet implementation class servletRestauration
 */
@WebServlet("/servletRestauration")
public class servletRestauration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	Partie partie = new Partie();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletRestauration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession masession = request.getSession();
		partie.restaur(masession);
//		RequestDispatcher restaur = request.getRequestDispatcher("/WEB-INF/jeu.jsp");//Creer une nouvelle JSP pour la MAJ
//		restaur.forward(request, response);
//		try {
//			TimeUnit.SECONDS.sleep(10);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		response.sendRedirect("http://localhost:8080/battle_2/servletJeu");
	}

}
