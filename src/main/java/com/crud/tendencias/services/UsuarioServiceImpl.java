package com.crud.tendencias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.crud.tendencias.decorators.UsuarioAuditadoDecorator;
import com.crud.tendencias.decorators.UsuarioComponent;
import com.crud.tendencias.decorators.UsuarioDecorator;
import com.crud.tendencias.decorators.UsuarioEncriptadoDecorator;
import com.crud.tendencias.dao.IUsuarioDao;
import com.crud.tendencias.entity.Usuario;


@Service
public class UsuarioServiceImpl implements IUsuarioService {

	
	@Autowired
	private IUsuarioDao usuarioDao;

	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	
	@Override
	@Transactional
	public Usuario save(Usuario usuario) {
		// Aplica decoradores
		UsuarioComponent usuarioDecorado = new UsuarioEncriptadoDecorator(usuario);
		usuarioDecorado = new UsuarioAuditadoDecorator(usuarioDecorado);

		// Asegura que el objeto final a guardar es un Usuario
		Usuario finalUsuario = ((UsuarioDecorator) usuarioDecorado).getUsuario();

		return usuarioDao.save(finalUsuario);
	}

	
	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		return usuarioDao.findById(id).orElse(null);
	}

	
	@Override
	@Transactional
	public void delete(Long id) {
		usuarioDao.deleteById(id);
	}
}
