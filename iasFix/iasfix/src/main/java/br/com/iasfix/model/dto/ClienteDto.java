package br.com.iasfix.model.dto;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.model.entities.ClienteEntitiy;


import java.time.LocalDate;

public class ClienteDto {

    private String nome;

    private String cpf;

    private String telefone;

    private String celular;

    private LocalDate dataNascimento;

    public ClienteDto(ClienteEntitiy cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.telefone = cliente.getTelefone();
        this.celular = cliente.getCelular();
        this.dataNascimento = cliente.getDataNascimento();
    }



}
