package com.itb.inf2am.pizzariaa.controller;

public class CategoriaController {

    public Long id;
    public String nome;
    public String descricao;
    public CategoriaController(Long id, String nome, String descricao) {
        this.id = id;
    }
    public CategoriaController() {
        super();
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        
    }
}
