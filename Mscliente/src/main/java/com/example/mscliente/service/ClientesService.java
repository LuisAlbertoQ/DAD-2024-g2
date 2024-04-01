package com.example.mscliente.service;

import com.example.mscliente.entity.Clientes;

import java.util.List;
import java.util.Optional;

public interface ClientesService {

    public List<Clientes> listar();
    public Clientes guardar(Clientes clientes);
    public Clientes actualizar(Clientes clientes);
    public Optional<Clientes> listarPorld(Integer id);
    public void eliminarPorld(Integer id);
}
