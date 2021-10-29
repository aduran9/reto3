package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import usa.c3.g25.reto3.model.Category;
import usa.c3.g25.reto3.repository.CategoryRepository;

@Service
public class ImplementsCategoryService implements CategoryService{
    
    @Autowired
    CategoryRepository repositorioCategoria;

    @Override
    public List<Category> listarCategorias() {
        return (List<Category>) repositorioCategoria.findAll();
    }

    @Override
    public Optional<Category> listarCategoriaId(Integer id) {
        return repositorioCategoria.findById(id);
    }

    @Override
    public Category crearCategoria(Category category) {
        return repositorioCategoria.save(category);
    }

    @Override
    public boolean borrarCategoria(Integer id) {
        boolean estado=true;
        if (repositorioCategoria.findById(id).isPresent()){
            repositorioCategoria.deleteById(id);
        }
        else{
            estado=false;
        }
        return estado;
    }
    
}
