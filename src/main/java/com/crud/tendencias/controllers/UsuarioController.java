package com.crud.tendencias.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.crud.tendencias.entity.Usuario;
import com.crud.tendencias.entity.UsuarioBuilder;
import com.crud.tendencias.entity.UsuarioRequest;
import com.crud.tendencias.services.IUsuarioService;


@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/usuario")
	public List<Usuario> index() {
		return usuarioService.findAll();
	}

	@GetMapping("/usuario/{id}")
	public Usuario show(@PathVariable Long id) {
		return usuarioService.findById(id);
	}

	// Método para crear un nuevo usuario.
	@PostMapping("/usuario")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario create(@RequestBody UsuarioRequest usuarioRequest) {
		// Utiliza el UsuarioBuilder para crear un objeto Usuario a partir de la
		// solicitud.
		Usuario usuario = new UsuarioBuilder().withNombre(usuarioRequest.getNombre())
				.withClave(usuarioRequest.getClave()).withMail(usuarioRequest.getMail())
				.withEstado(usuarioRequest.isEstado()).build();

		// Guarda el nuevo usuario utilizando el servicio de Usuario.
		return usuarioService.save(usuario);
	}

	@PutMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Usuario update(@RequestBody Usuario usuario, @PathVariable Long id) {
		Usuario usu = usuarioService.findById(id);
		if (usu != null) {
			usu.setClave(usuario.getClave());
			usu.setNombre(usuario.getNombre());
			usu.setEstado(usuario.isEstado());
			usu.setMail(usuario.getMail());
		}
		return usuarioService.save(usu);
	}

	@DeleteMapping("/usuario/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		usuarioService.delete(id);
	}
}
