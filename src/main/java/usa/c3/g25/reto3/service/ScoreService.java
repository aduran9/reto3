package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import usa.c3.g25.reto3.model.Score;

@Component
public interface ScoreService {
    
    public List<Score> listarCalificaciones();
    public Optional<Score> listarCalificacionId(Integer id);
    public Score crearCalificacion(Score score);
    public boolean borrarCalificacion(Integer id);

}
