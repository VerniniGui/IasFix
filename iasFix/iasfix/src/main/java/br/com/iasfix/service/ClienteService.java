package br.com.iasfix.service;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.model.entities.ClienteEntitiy;
import br.com.iasfix.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public ClienteEntitiy criarCliente(Cliente cliente){
        return repository.save(cliente.toClienteEntity());
    }
}
