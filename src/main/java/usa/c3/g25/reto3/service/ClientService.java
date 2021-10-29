package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import usa.c3.g25.reto3.model.Client;

@Component
public interface ClientService {

    public List<Client> listarClientes();
    public Optional<Client> listarClienteId(Integer id);
    public Client crearCliente(Client client);
    public boolean borrarCliente(Integer id);
        
}