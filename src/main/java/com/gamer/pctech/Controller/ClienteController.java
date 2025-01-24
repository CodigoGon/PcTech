package com.gamer.pctech.Controller;

import com.gamer.pctech.Model.Cliente;
import com.gamer.pctech.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private IClienteService cliServ;

    @PostMapping("/crear")
    public void crearCliente(@RequestBody Cliente cli) {
        cliServ.createCliente(cli);
    }

    @DeleteMapping("/borrar")
    public void borrarCli(@PathVariable Long id) {
        cliServ.deleteCliente(id);
    }

    @GetMapping("/get")
    public List<Cliente> getCliente() {
        return cliServ.getCliente();
    }

    @GetMapping("/uncliente/{id}")
    public Cliente elcliente(@PathVariable Long id) {
        return cliServ.findCliente(id);
    }

    @PutMapping("/editar/{idOriginal}")
    public void editarCli (@PathVariable Long idOriginal,
                           @RequestBody Cliente cli) {
        cliServ.editCliente(idOriginal,cli);
    }
}
