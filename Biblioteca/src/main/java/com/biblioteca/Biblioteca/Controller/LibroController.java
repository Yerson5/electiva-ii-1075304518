package com.biblioteca.Biblioteca.Controller;

import com.biblioteca.Biblioteca.Entity.Libro;
import com.biblioteca.Biblioteca.IService.ILibroService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/libro")
public class LibroController extends ABaseController<Libro, ILibroService> {
    public LibroController(ILibroService service) { super(service, "libro"); }
}
