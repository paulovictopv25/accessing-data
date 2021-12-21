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
    private String status;
    private String local;
    private String inicioPrevisto;
    private String inicioCirurgia;

        
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

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getInicioPrevisto() {
        return inicioPrevisto;
    }
    public void setInicioPrevisto(String inicioPrevisto) {
        this.inicioPrevisto = inicioPrevisto;
    }
    public String getInicioCirurgia() {
        return inicioCirurgia;
    }
    public void setInicioCirurgia(String inicioCirurgia) {
        this.inicioCirurgia = inicioCirurgia;
    }
    public String getSaidaPrevista() {
        return saidaPrevista;
    }
    public void setSaidaPrevista(String saidaPrevista) {
        this.saidaPrevista = saidaPrevista;
    }
    private String saidaPrevista;

    
}
