package com.gamer.pctech.Service;

import com.gamer.pctech.Model.Pedido;
import com.gamer.pctech.Repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements IPedidoService{

    @Autowired
    private IPedidoRepository pediRepo;

    @Override
    public void createPedido(Pedido pedi) {
        pediRepo.save(pedi);
    }

    @Override
    public void deletePedido(Long id) {
        pediRepo.deleteById(id);
    }

    @Override
    public Pedido findPedido(Long id) {
        return pediRepo.findById(id).orElse(null);
    }

    @Override
    public List<Pedido> getPedidos() {
        return pediRepo.findAll();
    }

    @Override
    public void editPedidos(Long idOriginal, Pedido Pedi) {
        Pedido pediEditar = this.findPedido(idOriginal);

        pediEditar.setUnCliente(Pedi.getUnCliente());
        pediEditar.setFechaPedido(Pedi.getFechaPedido());
        pediEditar.setFechaEntrega(Pedi.getFechaEntrega());
        pediEditar.setListaProductos(Pedi.getListaProductos());
        pediEditar.setTotal(Pedi.getTotal());
        pediEditar.setPuntosGamerTotal(Pedi.getPuntosGamerTotal());
        pediEditar.setEstadoPedido(Pedi.getEstadoPedido());
        pediEditar.setEstadoPago(Pedi.getEstadoPago());

        this.createPedido(pediEditar);
    }
}
