package com.example.mspedido.servise;

import com.example.mspedido.entity.Pedidos;
import java.util.List;
import java.util.Optional;
public interface PedidosService {
    public List<Pedidos> listar();
    public Pedidos guardar(Pedidos pedidos);
    public Pedidos actualizar(Pedidos pedidos);
    public Optional<Pedidos> listarPorId(Integer id);
    public void eliminarPorId(Integer id);
}
