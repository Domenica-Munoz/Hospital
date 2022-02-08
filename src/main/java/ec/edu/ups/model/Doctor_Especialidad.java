package ec.edu.ups.model;

import java.io.Serializable;

public class Doctor_Especialidad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idmedicoespecialidad;
	private Persona persona;
	private Especialidad especialidad;
	
	
	
	
	
	
	public Doctor_Especialidad(int idmedicoespecialidad, Persona persona, Especialidad especialidad) {
		super();
		this.idmedicoespecialidad = idmedicoespecialidad;
		this.persona = persona;
		this.especialidad = especialidad;
	}
	public int getIdmedicoespecialidad() {
		return idmedicoespecialidad;
	}
	public void setIdmedicoespecialidad(int idmedicoespecialidad) {
		this.idmedicoespecialidad = idmedicoespecialidad;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Especialidad getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(Especialidad especialidad) {
		this.especialidad = especialidad;
	}
	
	
	@Override
	public String toString() {
		return "Doctor_Especialidad [idmedicoespecialidad=" + idmedicoespecialidad + ", persona=" + persona
				+ ", especialidad=" + especialidad + "]";
	}
	
	

}
