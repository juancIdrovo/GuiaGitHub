package com.crud.tendencias.entity;



public class UsuarioRequest {


	private String nombre;
	private String clave;
	private String mail;
	private boolean estado;

	
	public UsuarioRequest(String nombre, String clave, String mail, boolean estado) {
		this.nombre = nombre;
		this.clave = clave;
		this.mail = mail;
		this.estado = estado;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
