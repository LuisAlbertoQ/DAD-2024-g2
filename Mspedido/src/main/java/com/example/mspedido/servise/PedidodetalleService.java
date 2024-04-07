package com.example.mspedido.servise;

import com.example.mspedido.entity.Pedidodetalle;

import java.util.List;
import java.util.Optional;

public interface PedidodetalleService {
    public List<Pedidodetalle> listar();
    public Pedidodetalle guardar(Pedidodetalle pedidodetalle);
    public Pedidodetalle actualizar(Pedidodetalle pedidodetalle);
    public Optional<Pedidodetalle> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
