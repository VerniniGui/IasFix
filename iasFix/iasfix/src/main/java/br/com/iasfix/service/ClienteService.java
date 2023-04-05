package br.com.iasfix.service;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.model.entities.ClienteEntity;
import br.com.iasfix.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente newCliente(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteEntity clienteEntitiy = repository.save(cliente.toClienteEntity());

        return clienteEntitiy.toCliente();
    }

    public Cliente findClienteByName(String name) {
        Optional<Cliente> optional = repository.findByNome(name);
        if(optional.isEmpty()){
            return null;
        }
        Cliente cliente = optional.get();
        return cliente;
    }

    public List<Cliente> findAllCliente() {
        List<ClienteEntity> listaOptional = (List<ClienteEntity>) repository.findAll();
        List<Cliente> listaCliente = new ArrayList<>();
        if (listaOptional.isEmpty()) {
            return null;
        }
        for (ClienteEntity clienteEntity : listaOptional) {
            listaCliente.add(clienteEntity.toCliente());
        }

        return listaCliente;
    }
}
