package br.com.iasfix.controller;

import br.com.iasfix.model.domain.Cliente;
import br.com.iasfix.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    public ResponseEntity<Cliente> newCliente(@RequestBody Cliente cliente){
        Cliente clienteCriado  = service.newCliente(cliente);

        if(clienteCriado == null){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(clienteCriado);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllCliente() {
        List<Cliente> allCliente = service.findAllCliente();
        return ResponseEntity.ok().body(allCliente);
    }

    @GetMapping("/buscarNome/{nomeCliente}")
    public ResponseEntity<Cliente> getClienteByNome(@PathVariable String nomeCliente) {


        Cliente cliente = service.findClienteByName(nomeCliente);
        if(cliente == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(cliente);
    }
}
