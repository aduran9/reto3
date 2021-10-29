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

import usa.c3.g25.reto3.model.Reservation;
import usa.c3.g25.reto3.service.ImplementsReservationService;

@RestController
@RequestMapping("/api/Reservation")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
public class ReservationController {
    
    @Autowired
    ImplementsReservationService serviciosReservacion;

    @GetMapping("/all")
    public List<Reservation> listadoReservaciones() {
        return serviciosReservacion.listarReservaciones();              
    }

    @GetMapping("/{id}")
    public Optional<Reservation> detalleReservacion(@PathVariable("id") Integer id){
        return serviciosReservacion.listarReservacionId(id);
    }

    @PostMapping("/save")  
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation anadirReservacion(@RequestBody Reservation reservacion){
        return serviciosReservacion.crearReservacion(reservacion);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean eliminarReservacion(@PathVariable("id") Integer id){
        return serviciosReservacion.borrarReservacion(id);
    }
    
}
