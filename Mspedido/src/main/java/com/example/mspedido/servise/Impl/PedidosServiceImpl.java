package com.example.mspedido.servise.Impl;

import com.example.mspedido.entity.Pedidos;
import com.example.mspedido.reposotiry.PedidosRepository;
import com.example.mspedido.servise.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidosServiceImpl implements PedidosService {
    @Autowired
    private PedidosRepository pedidosRepository;


    @Override
    public List<Pedidos> listar() {
        return pedidosRepository.findAll();
    }


    @Override
    public Pedidos guardar(Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }


    @Override
    public Pedidos actualizar(Pedidos pedidos) {
        return pedidosRepository.save(pedidos);
    }


    @Override
    public Optional<Pedidos> listarPorId(Integer id) {
        return pedidosRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        pedidosRepository.deleteById(id);
    }

}
