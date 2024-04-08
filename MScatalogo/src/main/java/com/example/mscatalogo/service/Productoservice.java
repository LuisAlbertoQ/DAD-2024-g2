package com.example.mscatalogo.service;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.entity.Producto;

import java.util.List;
import java.util.Optional;

public interface Productoservice {

    public List<Producto> listar();
    public Producto guardar(Producto producto);
    public Producto actualizar(Producto producto);
    public Optional<Producto> listarPorld(Integer id);
    public void eliminarPorld(Integer id);
}
