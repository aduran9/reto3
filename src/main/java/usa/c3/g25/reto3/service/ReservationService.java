package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import usa.c3.g25.reto3.model.Reservation;

@Component
public interface ReservationService {
 
    public List<Reservation> listarReservaciones();
    public Optional<Reservation> listarReservacionId(Integer id);
    public Reservation crearReservacion(Reservation reservation);
    public boolean borrarReservacion(Integer id);

}
