package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usa.c3.g25.reto3.model.Client;
import usa.c3.g25.reto3.repository.ClientRepository;

@Service
public class ImplementsClientService implements ClientService{
    
    @Autowired
    ClientRepository repositorioCliente;
    
    @Override
    public List<Client> listarClientes() {
        return (List<Client>) repositorioCliente.findAll();
    }

    @Override
    public Optional<Client> listarClienteId(Integer id) {
        return repositorioCliente.findById(id);
    }

    @Override
    public Client crearCliente(Client client) {
        return repositorioCliente.save(client);
    }

    @Override
    public boolean borrarCliente(Integer id) {
        boolean estado=true;
        if (repositorioCliente.findById(id).isPresent()){
            repositorioCliente.deleteById(id);
        }
        else{
            estado=false;
        }
        return estado;
    }
}
