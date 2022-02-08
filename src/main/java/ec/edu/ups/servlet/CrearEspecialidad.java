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
import ec.edu.ups.model.Especialidad;

/**
 * Servlet implementation class CreaeEspecialidad
 */
@WebServlet("/CreaeEspecialidad")
public class CrearEspecialidad extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Especialidad especialidad;
	private EspecialidadDAO especialidaddao;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearEspecialidad() {
        super();
        especialidad=new Especialidad();
        especialidaddao=FactoryDAO.getFactoryDAO().getEspecialidadDAO();
 
    }
			public void update(Especialidad entity) {
				// TODO Auto-generated method stub
				
			}
			
			
			public Especialidad read(String id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			public Especialidad getEmailbyUsername(String email) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			public List<Especialidad> find() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			public void delete(Especialidad entity) {
				// TODO Auto-generated method stub
				
			}
			
			
			public void createTable() {
				// TODO Auto-generated method stub
				
			}
			
			
			public void create(Especialidad entity) {
				// TODO Auto-generated method stub
				
			}
			
			
			public List<Especialidad> allSecretaria() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			public List<Especialidad> allMedico() {
				// TODO Auto-generated method stub
				return null;
			}
			
			
			public List<Especialidad> allAdmin() {
				// TODO Auto-generated method stub
				return null;
			}
		
        // TODO Auto-generated constructor stub
    

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
		String url;
		try {
			especialidad.setNombreespecialidad(request.getParameter("nombre_especialidad"));
			especialidad.setDescripcionespecialidad(request.getParameter("descripcion_especilidad"));
			
			especialidaddao.create(especialidad);
			url="/Doctores/Especilidad.jsp";
		} catch (Exception e) {
			// TODO: handle exception
			url="/Doctores/Especilidad.jsp";
		}
		doGet(request, response);
	}

}
