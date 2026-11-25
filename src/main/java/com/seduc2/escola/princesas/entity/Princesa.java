package com.seduc2.escola.princesas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity
public class Princesa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String nome;
    @Positive
    private int idade;
    private String reino;
    private String mascote;
    private Poder poder;

    public Princesa(int id, String nome, int idade, String reino, String mascote, Poder poder) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.reino = reino;
        this.mascote = mascote;
        this.poder = poder;
    }

    public Princesa(String nome, int idade, String reino, String mascote, Poder poder) {
        this.nome = nome;
        this.idade = idade;
        this.reino = reino;
        this.mascote = mascote;
        this.poder = poder;
    }

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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getReino() {
        return reino;
    }

    public void setReino(String reino) {
        this.reino = reino;
    }

    public String getMascote() {
        return mascote;
    }

    public void setMascote(String mascote) {
        this.mascote = mascote;
    }

    public Poder getPoder() {
        return poder;
    }

    public void setPoder(Poder poder) {
        this.poder = poder;
    }

}
