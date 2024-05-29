package com.crud.tendencias.services;

import java.util.List;

import com.crud.tendencias.entity.Usuario;



public interface IUsuarioService {

	public List<Usuario> findAll();

	public Usuario save(Usuario usuario);

	
	public Usuario findById(Long id);

	
	public void delete(Long id);
}
