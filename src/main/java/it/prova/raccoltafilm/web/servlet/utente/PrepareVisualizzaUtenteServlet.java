package it.prova.raccoltafilm.web.servlet.utente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.prova.raccoltafilm.service.MyServiceFactory;

@WebServlet("/admin/PrepareVisualizzaUtenteServlet")
public class PrepareVisualizzaUtenteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PrepareVisualizzaUtenteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/utente/search.jsp").forward(request, response);
	}
	

}
