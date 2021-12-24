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
 * Servlet implementation class servletJeu
 */
@WebServlet("/servletJeu")
public class servletJeu extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
//	Perso Joueur = new Perso();
//	Adversaire adv = new Adversaire();
//	
//	@EJB
//	Partie part = new Partie(Joueur, adv);
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletJeu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String [] test = {"Red", "Yellow", "black"};
		
		request.setAttribute("test", test);
		
		HttpSession masession = request.getSession();
//		PrintWriter ess = response.getWriter();
//		ess.println("Bien recu");
		
		
		RequestDispatcher vue_jeu = request.getRequestDispatcher("/WEB-INF/jeu.jsp");
		vue_jeu.forward(request, response);
		System.out.println("name : " +  masession.getAttribute("u_name") + " Type : " + masession.getAttribute("u_type"));		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
