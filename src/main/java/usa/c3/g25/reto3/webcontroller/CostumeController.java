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

import usa.c3.g25.reto3.model.Costume;
import usa.c3.g25.reto3.service.ImplementsCostumeService;

@RestController
@RequestMapping("/api/Costume")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

public class CostumeController {

    @Autowired
    ImplementsCostumeService serviciosDisfraz;

    @GetMapping("/all")
    public List<Costume> ListadoDisfraces() {
        return serviciosDisfraz.listarDisfraces();              
    }

    @GetMapping("/{id}")
    public Optional<Costume> detalleDisfraz(@PathVariable("id") Integer id){
        return serviciosDisfraz.listarDisfrazId(id);
    }

    @PostMapping("/save")  
    @ResponseStatus(HttpStatus.CREATED)
    public Costume anadirDisfraz(@RequestBody Costume disfraz){
        return serviciosDisfraz.crearDisfraz(disfraz);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean eliminarDisfraz(@PathVariable("id") Integer id){
        return serviciosDisfraz.borrarDisfraz(id);
    }
    
}
