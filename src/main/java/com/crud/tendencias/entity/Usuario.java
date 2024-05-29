package com.crud.tendencias.entity;

import java.time.LocalDateTime;

import com.crud.tendencias.decorators.UsuarioComponent;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario implements UsuarioComponent {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	private String nombre;
	private String clave;
	private String mail;
	private boolean estado;

	
	@Column(name = "last_updated")
	private LocalDateTime last_updated;

	// Métodos getter y setter 

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String getClave() {
		return clave;
	}

	@Override
	public void setClave(String clave) {
		this.clave = clave;
	}

	@Override
	public String getMail() {
		return mail;
	}

	@Override
	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public boolean isEstado() {
		return estado;
	}

	@Override
	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	@Override
	public LocalDateTime getLocalDateTime() {
		return this.last_updated;
	}

	@Override
	public void setLocalDateTime(LocalDateTime last_updated) {
		this.last_updated = last_updated;
	}
}
