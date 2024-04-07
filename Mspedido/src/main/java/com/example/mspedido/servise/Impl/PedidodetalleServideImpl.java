package com.example.mspedido.servise.Impl;

import com.example.mspedido.entity.Pedidodetalle;
import com.example.mspedido.reposotiry.PedidodetalleRepository;
import com.example.mspedido.servise.PedidodetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidodetalleServideImpl implements PedidodetalleService {
    @Autowired
    private PedidodetalleRepository pedidodetalleRepository;


    @Override
    public List<Pedidodetalle> listar() {
        return pedidodetalleRepository.findAll();
    }


    @Override
    public Pedidodetalle guardar(Pedidodetalle pedidodetalle) {
        return pedidodetalleRepository.save(pedidodetalle);
    }


    @Override
    public Pedidodetalle actualizar(Pedidodetalle pedidodetalle) {
        return pedidodetalleRepository.save(pedidodetalle);
    }


    @Override
    public Optional<Pedidodetalle> listarPorId(Integer id) {
        return pedidodetalleRepository.findById(id);
    }


    @Override
    public void eliminarPorId(Integer id) {
        pedidodetalleRepository.deleteById(id);
    }
}
