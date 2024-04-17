package com.biblioteca.Biblioteca.Controller;

import com.biblioteca.Biblioteca.Entity.Categoria;
import com.biblioteca.Biblioteca.IService.ICategoriaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/categoria")
public class CategoriaController extends ABaseController<Categoria, ICategoriaService> {
    public CategoriaController(ICategoriaService service) {
        super(service, "categoria");
    }
}
