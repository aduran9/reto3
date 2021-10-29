package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import usa.c3.g25.reto3.model.Message;

@Component
public interface MessageService {
    
    public List<Message> listarMensajes();
    public Optional<Message> listarMensajeId(Integer id);
    public Message crearMensaje(Message message);
    public boolean borrarMensaje(Integer id);

}
