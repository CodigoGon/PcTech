package com.gamer.pctech.Service;

import com.gamer.pctech.Model.Producto;
import com.gamer.pctech.Repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{

    @Autowired
    private IProductoRepository prodRepo;

    @Override
    public void createProducto(Producto prod) {
        prodRepo.save(prod);
    }

    @Override
    public void deleteProd(Long id) {
        prodRepo.deleteById(id);
    }

    @Override
    public Producto findProducto(Long id) {
        return prodRepo.findById(id).orElse(null);
    }

    @Override
    public List<Producto> getProductos() {
        return prodRepo.findAll();
    }

    @Override
    public void editProducto(Long idOriginal, Producto prod) {
        Producto prodEditar = this.findProducto(idOriginal);

        prodEditar.setMarca(prod.getMarca());
        prodEditar.setModelo(prod.getModelo());
        prodEditar.setTipo(prod.getTipo());
        prodEditar.setPuntosGamerValor(prod.getPuntosGamerValor());
        prodEditar.setPrecio(prod.getPrecio());
        prodEditar.setStock(prod.getStock());
        prodEditar.setEtiquetas(prod.getEtiquetas());

        this.createProducto(prodEditar);
    }

    @Override
    public List<Producto> getTipo(String tipo) {
        return prodRepo.getProductosAll(tipo);
    }
}
