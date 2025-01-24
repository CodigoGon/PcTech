package com.gamer.pctech.Service;

import com.gamer.pctech.Model.Pedido;

import java.util.List;

public interface IPedidoService {
    public void createPedido(Pedido pedi);
    public void deletePedido(Long id);
    public Pedido findPedido (Long id);
    public List<Pedido> getPedidos();
    public void editPedidos (Long idOriginal,Pedido Pedi);
}
