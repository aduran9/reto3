package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usa.c3.g25.reto3.model.Costume;
import usa.c3.g25.reto3.repository.CostumeRepository;

@Service
public class ImplementsCostumeService implements CostumeService{
 
    @Autowired
    CostumeRepository repositorioDisfraz;

    @Override
    public List<Costume> listarDisfraces() {
        return (List<Costume>) repositorioDisfraz.findAll();
    }

    @Override
    public Optional<Costume> listarDisfrazId(Integer id) {
        return repositorioDisfraz.findById(id);
    }

    @Override
    public Costume crearDisfraz(Costume costume) {
        return repositorioDisfraz.save(costume);
    }

    @Override
    public boolean borrarDisfraz(Integer id) {
        boolean estado=true;
        if (repositorioDisfraz.findById(id).isPresent()){
            repositorioDisfraz.deleteById(id);
        }
        else{
            estado=false;
        }
        return estado;
    }

}
