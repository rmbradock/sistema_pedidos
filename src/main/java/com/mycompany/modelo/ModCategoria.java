/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelo;

/**
 *
 * @author batista.4995
 */
//modelos sao as classes que vao refletir nosso banco de dados
//categoria, cidade, cliente, endereço, etc.
//Strign = Varchar
public class ModCategoria {
    private int id;
    private String nome;
    private String descricao;
//Alt + insert Constructor
    public ModCategoria() {
    }
//Alt + insert Construcot - selecionar todos
    public ModCategoria(int id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }
//alt + insert 
    public int getId() {
        return id;
    }

    public void setId(int id) {
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
        this.descricao = descricao;
    }
//
    @Override
    public String toString() {
        return "ModCategoria{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + '}';
    }
    
    
}
