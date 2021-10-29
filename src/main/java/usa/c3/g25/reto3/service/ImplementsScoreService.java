package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usa.c3.g25.reto3.model.Score;
import usa.c3.g25.reto3.repository.ScoreRepository;

@Service
public class ImplementsScoreService implements ScoreService{

    @Autowired
    ScoreRepository repositorioCalificacion;

    @Override
    public List<Score> listarCalificaciones() {
        return (List<Score>) repositorioCalificacion.findAll();
    }

    @Override
    public Optional<Score> listarCalificacionId(Integer id) {
        return repositorioCalificacion.findById(id);
    }

    @Override
    public Score crearCalificacion(Score score) {
        return repositorioCalificacion.save(score);
    }

    @Override
    public boolean borrarCalificacion(Integer id) {
        boolean estado=true;
        if (repositorioCalificacion.findById(id).isPresent()){
            repositorioCalificacion.deleteById(id);
        }
        else{
            estado=false;
        }
        return estado;
    }    

}
