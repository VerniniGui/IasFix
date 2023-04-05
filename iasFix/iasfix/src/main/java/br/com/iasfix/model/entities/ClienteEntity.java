package br.com.iasfix.model.entities;

import br.com.iasfix.model.domain.Cliente;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity(name = "cliente")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoCliente;
    @Column(name = "nome_cliente", length = 80)
    private String nome;
    @Column(name = "cpf_cliente", nullable = false, length = 11)
    private String cpf;
    @Column(length = 20)
    private String telefone;
    @Column(length = 20)
    private String celular;
    @Column(name ="data_nascimento", nullable = false)
    private LocalDate dataNascimento;


    public ClienteEntity(Cliente cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
        this.telefone = cliente.getTelefone();
        this.celular = cliente.getCelular();
        this.dataNascimento = cliente.getDataNascimento();
    }

    public Cliente toCliente(){
        return new Cliente(this.nome, this.cpf, this.telefone, this.celular, this.dataNascimento);
    }
}
