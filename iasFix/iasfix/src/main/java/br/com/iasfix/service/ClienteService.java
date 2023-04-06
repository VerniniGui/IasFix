package br.com.iasfix.service;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.model.dto.ClienteDtoNascimento;
import br.com.iasfix.model.entities.ClienteEntity;
import br.com.iasfix.model.exception.MyNotFoundException;
import br.com.iasfix.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente createCliente(Cliente cliente) {
        if (cliente == null) {
            return null;
        }
        ClienteEntity clienteEntitiy = repository.save(cliente.toClienteEntity());

        return clienteEntitiy.toCliente();
    }

    public Cliente findClienteByName(String name) {
        Optional<Cliente> optional = repository.findByNome(name);
        if (optional.isEmpty()) {
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

    public List<Cliente> findByDataNascimento(LocalDate dataNascimento) {
        List<ClienteEntity> lista = repository.findAllByDataNascimento(dataNascimento);
        List<Cliente> listaCliente = new ArrayList<>();
        List<ClienteDtoNascimento> listaAniversarioDto = new ArrayList<>();

        if (lista.isEmpty()){
            throw new MyNotFoundException("Nenhum cliente encontado");
        }

        for (ClienteEntity clienteE : lista) {
            listaCliente.add(clienteE.toCliente());
        }




        return listaCliente;
    }
}
