package com.example.accessingdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Sort;


public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    public Usuario findById(int id);
    public Iterable<Usuario> findAll(Sort sort);
}
