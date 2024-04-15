package com.example.mspedido.servise.Impl;

import com.example.mspedido.dto.ClientesDto;
import com.example.mspedido.entity.Pedidodetalle;
import com.example.mspedido.entity.Pedidos;
import com.example.mspedido.feign.ClienteFeign;
import com.example.mspedido.feign.ProductoFeign;
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

    @Autowired
    private ClienteFeign clienteFeign;

    @Autowired
    private ProductoFeign productoFeign;
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
        Optional<Pedidos> pedidos = pedidosRepository.findById(id);
        ClientesDto clientesDto = clienteFeign.listById(pedidos.get().getClienteid()).getBody();

        List<Pedidodetalle> pedidodetalles = pedidos.get().getDetalle().stream().map(pedidodetalle -> {
            pedidodetalle.setProductoDto(productoFeign.listById(pedidodetalle.getProductoid()).getBody());
            return pedidodetalle;
        }).toList();
        pedidos.get().setClientesDto(clientesDto);
        pedidos.get().setDetalle(pedidodetalles);
        return pedidosRepository.findById(id);
    }

    @Override
    public void eliminarPorId(Integer id) {
        pedidosRepository.deleteById(id);
    }

}
