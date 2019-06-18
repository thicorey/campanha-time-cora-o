package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CtrUsuario")
public class CtrUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CtrUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String cmd = request.getParameter("cmd");
		
		if("Voltar".equals(cmd)){
			response.sendRedirect("./menu.jsp");
		}
	}

}
