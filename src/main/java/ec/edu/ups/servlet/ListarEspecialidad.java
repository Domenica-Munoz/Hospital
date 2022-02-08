package ec.edu.ups.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.EspecialidadDAO;
import ec.edu.ups.dao.FactoryDAO;
import ec.edu.ups.dao.PersonaDAO;
import ec.edu.ups.model.Especialidad;
import ec.edu.ups.model.Persona;

/**
 * Servlet implementation class ListarEspecialidad
 */
@WebServlet("/ListarEspecialidad")
public class ListarEspecialidad extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarEspecialidad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre_especialidad=request.getParameter("nombre_especialidad");
		EspecialidadDAO especilidaddao=FactoryDAO.getFactoryDAO().getEspecialidadDAO();
		PersonaDAO personadao=FactoryDAO.getFactoryDAO().getPersonaDAO();
		String url;
		try {
			List<Persona>listarEspecilidad=personadao.listarpersonas(nombre_especialidad);
			request.setAttribute("Persona", listarEspecilidad);
			
			
			url="/Listarespecialidad.jsp";
		} catch (Exception e) {
			url="/index.html";
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		getServletContext().getRequestDispatcher(url).forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response, String especilidad) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	}

}
