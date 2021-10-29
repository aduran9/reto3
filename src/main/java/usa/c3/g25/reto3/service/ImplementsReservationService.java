package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usa.c3.g25.reto3.model.Reservation;
import usa.c3.g25.reto3.repository.ReservationRepository;

@Service
public class ImplementsReservationService implements ReservationService{

    @Autowired
    ReservationRepository repositorioReservacion;

    @Override
    public List<Reservation> listarReservaciones() {
        return (List<Reservation>) repositorioReservacion.findAll();
    }

    @Override
    public Optional<Reservation> listarReservacionId(Integer id) {
        return repositorioReservacion.findById(id);
    }

    @Override
    public Reservation crearReservacion(Reservation reservation) {
        return repositorioReservacion.save(reservation);
    }

    @Override
    public boolean borrarReservacion(Integer id) {
        boolean estado=true;
        if (repositorioReservacion.findById(id).isPresent()){
            repositorioReservacion.deleteById(id);
        }
        else{
            estado=false;
        }
        return estado;
    }    
    
}
