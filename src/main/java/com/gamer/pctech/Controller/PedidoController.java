package com.gamer.pctech.Controller;

import com.gamer.pctech.Model.Pedido;
import com.gamer.pctech.Service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private IPedidoService pediServ;

    @PostMapping("/crear")
    public void pedidoCrear (@RequestBody Pedido pedi) {
        pediServ.createPedido(pedi);
    }

    @DeleteMapping("/borrar")
    public void borrarPedido (@PathVariable Long id) {
        pediServ.deletePedido(id);
    }

    @GetMapping("/get")
    public List<Pedido> losPedidos() {
        return pediServ.getPedidos();
    }

    @GetMapping("/elpedido/{id}")
    public Pedido elpedido(@PathVariable Long id) {
        return pediServ.findPedido(id);
    }

    @PutMapping ("/edita/{id}")
    public void editando(@PathVariable Long id,
                         @RequestBody Pedido pedi) {
        pediServ.editPedidos(id,pedi);
    }
}
