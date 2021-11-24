package com.example.accessingdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Significa que esta classe é um controlador
@RequestMapping(path = "/demo") // Significa que as URLs começam com demo (após o caminho do aplicativo)

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
    public @ResponseBody Iterable<Usuario> getAllUsuario(){

        return uRepository.findAll();
    }

}