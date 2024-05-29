package com.crud.tendencias.decorators;

import java.time.LocalDateTime;

public interface UsuarioComponent {
	Long getId();

	void setId(Long id);

	String getNombre();

	void setNombre(String nombre);

	String getClave();

	void setClave(String clave);

	String getMail();

	void setMail(String mail);

	boolean isEstado();

	void setEstado(boolean estado);

	LocalDateTime getLocalDateTime();

	void setLocalDateTime(LocalDateTime last_updated);
}
