package br.com.iasfix.model.repository;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.model.entities.ClienteEntitiy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntitiy, Long> {
    Cliente findByName(String nome);
}
