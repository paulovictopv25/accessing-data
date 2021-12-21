package com.example.accessingdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Isso diz ao Hibernate para fazer uma tabela desta classe
public class Usuario{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    private String email;
   

        
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if(nome.equals("")){
            throw new IllegalArgumentException("Erro no Preenchimento do Nome.");
        }
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if(email.equals("")){
            throw new IllegalArgumentException("Erro no Preenchimento do E-mail.");

        }
        this.email = email;
    }

}