package com.crud.tendencias.decorators;

import java.time.LocalDateTime;

import com.crud.tendencias.entity.Usuario;

public abstract class UsuarioDecorator implements UsuarioComponent{
	
	protected UsuarioComponent decoratedUsuario;

    public UsuarioDecorator(UsuarioComponent decoratedUsuario) {
        this.decoratedUsuario = decoratedUsuario;
    }
    
    @Override
    public Long getId() {
        return decoratedUsuario.getId();
    }

    @Override
    public void setId(Long id) {
        decoratedUsuario.setId(id);
    }

    @Override
    public String getNombre() {
        return decoratedUsuario.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        decoratedUsuario.setNombre(nombre);
    }

    @Override
    public String getClave() {
        return decoratedUsuario.getClave();
    }

    @Override
    public void setClave(String clave) {
        decoratedUsuario.setClave(clave);
    }

    @Override
    public String getMail() {
        return decoratedUsuario.getMail();
    }

    @Override
    public void setMail(String mail) {
        decoratedUsuario.setMail(mail);
    }

    @Override
    public boolean isEstado() {
        return decoratedUsuario.isEstado();
    }

    @Override
    public void setEstado(boolean estado) {
        decoratedUsuario.setEstado(estado);
    }
	
    public Usuario getUsuario() {
        if (decoratedUsuario instanceof UsuarioDecorator) {
            return ((UsuarioDecorator) decoratedUsuario).getUsuario();
        }
        return (Usuario) decoratedUsuario;
    }

	public void setLocalDateTime(LocalDateTime last_updated) {
		// TODO Auto-generated method stub
		decoratedUsuario.setLocalDateTime(last_updated);
	}

}
