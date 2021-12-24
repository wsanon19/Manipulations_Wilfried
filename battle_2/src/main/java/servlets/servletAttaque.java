package servlets;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import partie_jeu.Partie;


/**
 * Servlet implementation class servletAttaque
 */
@WebServlet("/servletAttaque")
public class servletAttaque extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
//	Perso Joueur = new Perso();
//	Adversaire adv = new Adversaire();
//	
	@EJB
	Partie partie = new Partie();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servletAttaque() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		RequestDispatcher attaque = request.getRequestDispatcher("/WEB-INF/jeu.jsp");
		attaque.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				HttpSession masession = request.getSession();
				partie.attack(masession);
				RequestDispatcher attaque = request.getRequestDispatcher("/WEB-INF/jeu.jsp");
				attaque.forward(request, response);
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				partie.ripost(masession);
				response.sendRedirect("http://localhost:8080/battle_2/servletJeu");
		
		
	}

}
