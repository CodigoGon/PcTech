package com.gamer.pctech.Service;

import com.gamer.pctech.Model.Producto;

import java.util.List;

public interface IProductoService {
    public void createProducto(Producto prod);
    public void deleteProd(Long id);
    public Producto findProducto (Long id);
    public List<Producto> getProductos();
    public void editProducto (Long idOriginal,Producto Prod);

    public List<Producto> getTipo(String tipo);
}
