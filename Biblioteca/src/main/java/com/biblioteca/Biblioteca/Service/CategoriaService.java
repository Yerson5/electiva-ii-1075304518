package com.biblioteca.Biblioteca.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.Biblioteca.Entity.Categoria;
import com.biblioteca.Biblioteca.IRepository.IBaseRepository;
import com.biblioteca.Biblioteca.IRepository.ICategoriaRepository;
import com.biblioteca.Biblioteca.IService.ICategoriaService;
@Service
public class CategoriaService extends BaseService<Categoria> implements ICategoriaService{
    @Override
    protected IBaseRepository<Categoria, Long> getRepository() {  return repository;   }

    @Autowired
    private ICategoriaRepository repository;
}
