package ec.edu.ups.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ec.edu.ups.dao.EspecialidadDAO;
import ec.edu.ups.model.Especialidad;
import ec.edu.ups.model.Persona;

public class JDBCEspecialidadDAO extends JDBCGenericDAO<Especialidad, String> implements EspecialidadDAO {

	@Override
	public void createTable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Especialidad entity) {
		connection.insertBD("INSERT INTO public.\"Especialidad\"(nombreespecialidad,descripcionespecialidad)\n"
				+ "	VALUES ("
				+ "'" + entity.getNombreespecialidad() + "', "	
				+ "'" + entity.getDescripcionespecialidad() + "');");
		
	}

	@Override
	public Especialidad read(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Especialidad entity) {
		// TODO Auto-generated method stub
		connection.insertBD("UPDATE Especialidad SET nombreespecialidad = " 
		+ entity.getNombreespecialidad() + ", descripcionespecialidad = " 
		+ entity.getDescripcionespecialidad() );
		
	}

	@Override
	public void delete(Especialidad entity) {
		// TODO Auto-generated method stub
		connection.insertBD("DELETE FROM Especialidad e WHERE e.id_especialidad = " + entity.getIdespecialidad());
		
	}

	@Override
	public List<Especialidad> find() {
		// TODO Auto-generated method stub
		
		List<Especialidad> especialidad = new ArrayList<Especialidad>();
		ResultSet resultSet = connection.queryBD("SELECT *\n"
				+ "	FROM public.\"Especialidad\" e; ");
		
		
		try {
			while (resultSet.next()) {
				especialidad.add(new Especialidad(resultSet.getInt("id_especialidad"), resultSet.getString("nombre_especialidad"), resultSet.getString("descripcion_Especialidad"))
							);
				
				
			}
		} catch (SQLException e) {
			System.out.println(">>>WARNING (JDBCEspecialidadDAO especialidad): " + e.getMessage());
			
		}
		return especialidad;
	}

	@Override
	public Especialidad getEmailbyUsername(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especialidad> allSecretaria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especialidad> allMedico() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especialidad> allAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Especialidad> listarpersonas(String especilidad) {
		// TODO Auto-generated method stub
		return null;
	}
}


