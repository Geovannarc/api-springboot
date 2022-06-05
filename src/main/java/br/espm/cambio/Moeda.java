package br.espm.cambio;

import java.util.UUID;

public class Moeda {
    
    private UUID id;
    private String nome;
    private String simbolo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public Moeda(){
        //sempre bom deixar um construtor e branco, 1berto
    }

    public Moeda(String nome, String simbolo){
        this.nome = nome;
        this.simbolo = simbolo;
    }

    public Moeda(UUID id, String nome, String simbolo){
        this.id = id;
        this.nome = nome;
        this.simbolo = simbolo;
    }
}
