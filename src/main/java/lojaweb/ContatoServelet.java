package lojaweb;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/contato")
public class ContatoServelet  extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 26514546089326548L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter writer = resp.getWriter();
		writer.print("<html><body><h2> Entre em contato </h2></body></html>");
		writer.close();
	}
}
