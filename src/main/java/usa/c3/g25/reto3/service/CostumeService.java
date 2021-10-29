package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import usa.c3.g25.reto3.model.Costume;

@Component
public interface CostumeService {
    
    public List<Costume> listarDisfraces();
    public Optional<Costume> listarDisfrazId(Integer id);
    public Costume crearDisfraz(Costume costume);
    public boolean borrarDisfraz(Integer id);

}
