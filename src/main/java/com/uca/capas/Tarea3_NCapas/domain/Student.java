package com.uca.capas.Tarea3_NCapas.domain;

import javax.validation.constraints.Size;

public class Student {
	@Size(min = 1, max = 25, message ="Nombre debe contener minimo 1 carácter y máximo 25 caracteres")
	private	String nombre;
	
	@Size(min = 1, max = 25, message ="Apellidos deben contener minimo 1 carácter y máximo 25 caracteres")
	private	String apellidos;
	
	
	private	String fechaNacimiento;
	
	@Size(min = 1, max = 25, message ="El lugar de nacimiento  debe contener minimo 1 carácter y máximo 25 caracteres")
	private	String lugarNacimiento;
	
	@Size(min = 1, max = 100, message ="El lugar de procedencia  debe contener minimo 1 carácter y máximo 100 caracteres")
	private	String procedencia;
	
	@Size(min = 8, max = 8, message ="El numero de telefono fijo debe contener exactamente 8 caracteres")
	private	String telefono;

	@Size(min = 8, max = 8, message ="El numero de telefono movil debe contener exactamente 8 caracteres")
	private	String movil;
	
	
	
	
	public Student(String nombre, String apellidos, String fechaNacimiento, String lugarNacimiento, String procedencia,
			String telefono, String movil) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.lugarNacimiento = lugarNacimiento;
		this.procedencia = procedencia;
		this.telefono = telefono;
		this.movil = movil;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getLugarNacimiento() {
		return lugarNacimiento;
	}
	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	
	
	
}
