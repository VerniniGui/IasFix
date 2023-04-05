package br.com.iasfix.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClienteEntitiy {
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

}
