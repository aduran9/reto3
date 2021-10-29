package usa.c3.g25.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import usa.c3.g25.reto3.model.Category;

@Component
public interface CategoryService {

    public List<Category> listarCategorias();
    public Optional<Category> listarCategoriaId(Integer id);
    public Category crearCategoria(Category category);
    public boolean borrarCategoria(Integer id);

}
