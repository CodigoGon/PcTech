package com.gamer.pctech.Service;

import com.gamer.pctech.Model.Cliente;
import com.gamer.pctech.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService implements IClienteService{

    @Autowired
    private IClienteRepository cliRepo;

    @Override
    public void createCliente(Cliente cli) {
        cliRepo.save(cli);
    }

    @Override
    public void deleteCliente(Long id) {
        cliRepo.deleteById(id);
    }

    @Override
    public Cliente findCliente(Long id) {
        return cliRepo.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> getCliente() {
        return cliRepo.findAll();
    }

    @Override
    public void editCliente(Long idOriginal, Cliente cli) {
        Cliente cliEdit = this.findCliente(idOriginal);

        cliEdit.setNombre(cli.getNombre());
        cliEdit.setApellido(cli.getApellido());
        cliEdit.setDni(cli.getDni());
        cliEdit.setDirección(cli.getDirección());
        cliEdit.setTelefono(cli.getTelefono());
        cliEdit.setCodigoPostal(cli.getCodigoPostal());
        cliEdit.setPuntosGamer(cli.getPuntosGamer());

        cliRepo.save(cliEdit);
    }
}
