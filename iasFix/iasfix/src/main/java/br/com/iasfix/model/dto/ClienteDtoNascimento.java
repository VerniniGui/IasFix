package br.com.iasfix.model.dto;

import br.com.iasfix.model.domain.Cliente;

import java.time.LocalDate;

public class ClienteDtoNascimento {
    String nome;
    LocalDate dataNascimento;

    public ClienteDtoNascimento(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}

