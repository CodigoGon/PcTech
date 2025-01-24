package com.gamer.pctech.Service;

import com.gamer.pctech.Model.Cliente;

import java.util.List;

public interface IClienteService {
    public void createCliente(Cliente cli);
    public void deleteCliente(Long id);
    public Cliente findCliente (Long id);
    public List<Cliente> getCliente();
    public void editCliente (Long idOriginal,Cliente cli);
}
