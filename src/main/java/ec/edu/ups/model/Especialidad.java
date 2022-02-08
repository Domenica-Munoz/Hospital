package ec.edu.ups.model;

import java.io.Serializable;

public class Especialidad implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int idespecialidad;
	private String nombreespecialidad;
	private String descripcionespecialidad;		
	
	
	public Especialidad() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Especialidad(int idespecialidad, String nombreespecialidad, String descripcionespecialidad) {
		super();
		this.idespecialidad = idespecialidad;
		this.nombreespecialidad = nombreespecialidad;
		this.descripcionespecialidad = descripcionespecialidad;
	}
	public int getIdespecialidad() {
		return idespecialidad;
	}
	public void setIdespecialidad(int idespecialidad) {
		this.idespecialidad = idespecialidad;
	}
	public String getNombreespecialidad() {
		return nombreespecialidad;
	}
	public void setNombreespecialidad(String nombreespecialidad) {
		this.nombreespecialidad = nombreespecialidad;
	}
	public String getDescripcionespecialidad() {
		return descripcionespecialidad;
	}
	public void setDescripcionespecialidad(String descripcionespecialidad) {
		this.descripcionespecialidad = descripcionespecialidad;
	}
	@Override
	public String toString() {
		return "Especialidad [idespecialidad=" + idespecialidad + ", nombreespecialidad=" + nombreespecialidad
				+ ", descripcionespecialidad=" + descripcionespecialidad + "]";
	}
	
	
	

}
