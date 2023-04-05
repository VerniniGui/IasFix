package br.com.iasfix.model.domain;

import br.com.iasfix.model.dto.ClienteDto;
import br.com.iasfix.model.entities.ClienteEntitiy;

import java.time.LocalDate;

public class Cliente {
    private String nome;

    private String cpf;

    private String telefone;

    private String celular;

    private LocalDate dataNascimento;

    public Cliente(String nome, String cpf, String telefone, String celular, LocalDate dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.celular = celular;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCelular() {
        return celular;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public ClienteEntitiy toClienteEntity(){
        return new ClienteEntitiy(null,
                this.nome,
                this.cpf,
                this.telefone,
                this.celular,
                this.dataNascimento);
    }

}
