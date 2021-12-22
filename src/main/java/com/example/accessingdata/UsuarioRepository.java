package com.example.accessingdata;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;



public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

    public Usuario findById(int id);
    public Iterable<Usuario> findAll(Sort sort);
    public Usuario findByEmail(String email);
    
    
}
