package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usa.c3.g25.reto3.model.Message;
import usa.c3.g25.reto3.repository.MessageRepository;

@Service
public class ImplementsMessageService implements MessageService{
    
    @Autowired
    MessageRepository repositorioMensaje;

    @Override
    public List<Message> listarMensajes() {
        return (List<Message>) repositorioMensaje.findAll();
    }

    @Override
    public Optional<Message> listarMensajeId(Integer id) {
        return repositorioMensaje.findById(id);
    }

    @Override
    public Message crearMensaje(Message message) {
        return repositorioMensaje.save(message);
    }

    @Override
    public boolean borrarMensaje(Integer id) {
        boolean estado=true;
        if (repositorioMensaje.findById(id).isPresent()){
            repositorioMensaje.deleteById(id);
        }
        else{
            estado=false;
        }
        return estado;
    }

}
