package ec.edu.ups.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.FactoryDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.model.Persona;

/**
 * Servlet implementation class Listar
 */
@WebServlet("/Listar")
public class Listar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Listar() {
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
		// TODO Auto-generated method stub
		
		String cedula=request.getParameter("cedula");
		PersonaDAO personadao=FactoryDAO.getFactoryDAO().getPersonaDAO();
		String url;
		try {
			//Persona persona=personadao.read(cedula);
			List<Persona>lisarpersona=personadao.find();
			List<Persona>lisarpersona1=personadao.allAdmin();
			List<Persona>lisarpersona2=personadao.allMedico();
			List<Persona>lisarpersona3=personadao.allSecretaria();
			request.setAttribute("Persona", lisarpersona);
			request.setAttribute("Admin", lisarpersona1);
			request.setAttribute("Medico", lisarpersona2);
			request.setAttribute("Secretaria", lisarpersona3);
			url="/listar.jsp";
		} catch (Exception e) {
			url="/listar.jsp";
			System.out.println("Error en la lista");
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		getServletContext().getRequestDispatcher(url).forward(request,response);

	}

}
