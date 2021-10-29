package usa.c3.g25.reto3.webcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import usa.c3.g25.reto3.model.Client;
import usa.c3.g25.reto3.service.ImplementsClientService;

@RestController
@RequestMapping("/api/Client")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ClientController {

    @Autowired
    ImplementsClientService serviciosCliente;

    @GetMapping("/all")
    public List<Client> ListadoClientes() {
        return serviciosCliente.listarClientes();              
    }

    @GetMapping("/{id}")
    public Optional<Client> detalleCliente(@PathVariable("id") Integer id){
        return serviciosCliente.listarClienteId(id);
    }

    @PostMapping("/save")  
    @ResponseStatus(HttpStatus.CREATED)
    public Client anadirCliente(@RequestBody Client cliente){
        return serviciosCliente.crearCliente(cliente);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean eliminarCliente(@PathVariable("id") Integer id){
        return serviciosCliente.borrarCliente(id);
    }

}
