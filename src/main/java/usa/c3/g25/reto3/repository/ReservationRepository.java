package usa.c3.g25.reto3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import usa.c3.g25.reto3.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer>{
    
}
