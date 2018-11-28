package com.example.arthur_pc.receitas.Class;

import java.io.Serializable;

public class Pratos implements Serializable {
    private String nome;
    private String ingrediente;
    private String descricao;
    private int imagem;

    public Pratos(String nome, String ingrediente, String descricao, int imagem){
        this.nome = nome;
        this.ingrediente = ingrediente;
        this.descricao = descricao;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    @Override
    public String toString() {
        return "Pratos{" +
                "nome='" + nome + '\'' +
                ", ingrediente='" + ingrediente + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}