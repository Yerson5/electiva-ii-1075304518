package com.biblioteca.Biblioteca.IRepository;

import com.biblioteca.Biblioteca.Entity.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface ILibroRepository extends IBaseRepository<Libro, Long> {
}
