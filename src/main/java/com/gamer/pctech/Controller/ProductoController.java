package com.gamer.pctech.Controller;

import com.gamer.pctech.Model.Producto;
import com.gamer.pctech.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {

    @Autowired
    private IProductoService produServ;

    @PostMapping("/crear")
    public void crearProdu(@RequestBody Producto prod) {
        produServ.createProducto(prod);
    }

    @DeleteMapping("/borrar")
    public void borrarProdu(@PathVariable Long id) {
        produServ.deleteProd(id);
    }

    @GetMapping("/get")
    public List<Producto> listaProductos() {
        return produServ.getProductos();
    }

    @GetMapping("/traer/{id}")
    public Producto elprodu(@PathVariable Long id) {
        return produServ.findProducto(id);
    }

    @PutMapping("/editar/{idOriginal}")
    public void editarCliente(@PathVariable Long idOriginal,
                              @RequestBody Producto prod){
        produServ.editProducto(idOriginal, prod);
    }

    @GetMapping("/tipo/{tipo}")
    public List<Producto> listaPorTipo(@PathVariable String tipo) {
        return produServ.getTipo(tipo);
    }
}
