package br.com.iasfix.entities;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoCliente;
    @Column(name = "nome_cliente", length = 80)
    private String nome;
    @Column(name = "cpf_cliente", nullable = false, length = 11)
    private String cpf;
    @Column(length = 20)
    private String telefone;
    @Column(length = 20)
    private String celular;

    public Cliente(){};
}
