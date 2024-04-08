package com.example.mscatalogo.service.inpm;

import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.repository.ProductoRepository;
import com.example.mscatalogo.service.Productoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceinpm implements Productoservice {

    @Autowired
    private ProductoRepository productoRepository;


    @Override
    public List<Producto> listar() {
        return productoRepository.findAll();
    }

    @Override
    public Producto guardar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Optional<Producto> listarPorld(Integer id) {
        return productoRepository.findById(id);
    }

    @Override
    public void eliminarPorld(Integer id) {
        productoRepository.deleteById(id);

    }
}
