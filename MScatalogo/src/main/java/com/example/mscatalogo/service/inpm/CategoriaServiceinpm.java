package com.example.mscatalogo.service.inpm;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.repository.CategoriaRepositoty;
import com.example.mscatalogo.service.Categoriaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceinpm implements Categoriaservice {

    @Autowired
    private CategoriaRepositoty categoriaRepositoty;


    @Override
    public List<Categoria> listar() {
        return categoriaRepositoty.findAll();
    }

    @Override
    public Categoria guardar(Categoria categoria) {
        return categoriaRepositoty.save(categoria);
    }

    @Override
    public Categoria actualizar(Categoria categoria) {
        return categoriaRepositoty.save(categoria);
    }

    @Override
    public Optional<Categoria> listarPorld(Integer id) {
        return categoriaRepositoty.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        categoriaRepositoty.deleteById(id);

    }
}
