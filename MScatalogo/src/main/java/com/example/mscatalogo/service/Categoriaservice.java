package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Categoria;

import java.util.List;
import java.util.Optional;
public interface Categoriaservice {

    public List<Categoria> listar();
    public Categoria guardar(Categoria categoria);
    public Categoria actualizar(Categoria categoria);
    public Optional<Categoria>listarPorld(Integer id);
    public void eliminarPorld(Integer id);

}
