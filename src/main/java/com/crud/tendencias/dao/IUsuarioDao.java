package com.crud.tendencias.dao;

import org.springframework.data.repository.CrudRepository;

import com.crud.tendencias.entity.Usuario;


public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

}
