package com.biblioteca.Biblioteca.IRepository;

import com.biblioteca.Biblioteca.Entity.Categoria;
import org.springframework.stereotype.Repository;
@Repository
public interface ICategoriaRepository extends IBaseRepository<Categoria, Long> {
}
