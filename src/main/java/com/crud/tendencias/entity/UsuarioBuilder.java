package com.crud.tendencias.entity;


public class UsuarioBuilder {

	// Usuario que se está construyendo.
	private Usuario usuario;

	// Constructor del Builder.
	public UsuarioBuilder() {
		usuario = new Usuario();
	}

	// Métodos para configurar los atributos del Usuario.

	public UsuarioBuilder withNombre(String nombre) {
		usuario.setNombre(nombre);
		return this;
	}

	public UsuarioBuilder withClave(String clave) {
		usuario.setClave(clave);
		return this;
	}

	public UsuarioBuilder withMail(String mail) {
		usuario.setMail(mail);
		return this;
	}

	public UsuarioBuilder withEstado(boolean estado) {
		usuario.setEstado(estado);
		return this;
	}

	// Método para construir el objeto Usuario final.
	public Usuario build() {
		return usuario;
	}
}
