package br.com.iasfix.model.dto;

import java.time.LocalDate;

import br.com.iasfix.model.entities.ClienteEntity;

public class ClienteDto {

    private String nome;

    private String cpf;

    private String telefone;

    private String celular;

    private LocalDate dataNascimento;

    public ClienteDto(ClienteEntity cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.telefone = cliente.getTelefone();
        this.celular = cliente.getCelular();
        this.dataNascimento = cliente.getDataNascimento();
    }



}
