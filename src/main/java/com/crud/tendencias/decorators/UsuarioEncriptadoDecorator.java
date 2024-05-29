package com.crud.tendencias.decorators;

import java.time.LocalDateTime;

public class UsuarioEncriptadoDecorator extends UsuarioDecorator {
	
	public UsuarioEncriptadoDecorator(UsuarioComponent decoratedUsuario) {
        super(decoratedUsuario);
    }

    @Override
    public void setClave(String clave) {
        String claveEncriptada = encriptarClave(clave);
        super.setClave(claveEncriptada);
    }

    private String encriptarClave(String clave) {
        // Implementa el método de encriptación
        return "ENCRIPTADO_" + clave;
    }

	@Override
	public LocalDateTime getLocalDateTime() {
		// TODO Auto-generated method stub
		return decoratedUsuario.getLocalDateTime();
	}
}
