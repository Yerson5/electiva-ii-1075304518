package com.biblioteca.Biblioteca.Service;

import com.biblioteca.Biblioteca.Entity.Libro;
import com.biblioteca.Biblioteca.IRepository.IBaseRepository;
import com.biblioteca.Biblioteca.IRepository.ILibroRepository;
import com.biblioteca.Biblioteca.IService.ILibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroService extends BaseService<Libro> implements ILibroService {
    @Override
    protected IBaseRepository<Libro, Long> getRepository() {  return repository;   }
    @Autowired
    private ILibroRepository repository;
}
