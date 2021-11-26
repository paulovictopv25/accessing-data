package com.example.accessingdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Significa que esta classe é um controlador
@RequestMapping(path = "/demo") // Significa que as URLs começam com demo (após o caminho do aplicativo)
@CrossOrigin(origins = "*")
public class PrincipalController {

    @Autowired // faz o start do nosso objeto ( uRepository)
    private UsuarioRepository uRepository;


    @PostMapping(path = "/add")
    public @ResponseBody String addNovoUsuario(@RequestParam String nome, @RequestParam String email) {

        Usuario u = new Usuario();
        u.setNome(nome);
        u.setEmail(email);
        uRepository.save(u);
             return "Ok ao Gravar";

    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Usuario> getAllUsuarios() {
        return uRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    @PutMapping(path = "/update/{id}")
    public @ResponseBody String updateUsuario(@PathVariable int id, @RequestParam String nome, @RequestParam String email){

        Usuario u = uRepository.findById(id);
        u.setNome(nome);
        u.setEmail(email);
        uRepository.save(u);
            
        return "Ok ao atualizar.";
    }

    @DeleteMapping(path = "/delete/{id}")
    public @ResponseBody String deleteUsuario(@PathVariable int id){

       uRepository.deleteById(id);
            
        return "Ok ao Apagar.";
    }

}