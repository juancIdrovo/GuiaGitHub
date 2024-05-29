package com.crud.tendencias.decorators;

import java.time.LocalDateTime;

import com.crud.tendencias.entity.Usuario;

public class UsuarioAuditadoDecorator extends UsuarioDecorator {
    
	public UsuarioAuditadoDecorator(UsuarioComponent decoratedUsuario) {
        super(decoratedUsuario);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
        actualizarFecha();
    }

    @Override
    public void setClave(String clave) {
        super.setClave(clave);
        actualizarFecha();
    }

    @Override
    public void setMail(String mail) {
        super.setMail(mail);
        actualizarFecha();
    }

    @Override
    public void setEstado(boolean estado) {
        super.setEstado(estado);
        actualizarFecha();
    }

    private void actualizarFecha() {
        ((Usuario) decoratedUsuario).setLocalDateTime(LocalDateTime.now());
    }

    @Override
    public void setLocalDateTime(LocalDateTime last_updated) {
        ((Usuario) decoratedUsuario).setLocalDateTime(last_updated);
    }

    @Override
    public LocalDateTime getLocalDateTime() {
        return ((Usuario) decoratedUsuario).getLocalDateTime();
    }
}