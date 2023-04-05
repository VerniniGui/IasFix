package br.com.iasfix.model.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.model.entities.ClienteEntity;

import java.util.Optional;


public interface ClienteRepository extends CrudRepository<ClienteEntity, Long> {
    Optional findByNome(String nome);
}
