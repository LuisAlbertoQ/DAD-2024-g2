package com.example.mspedido.reposotiry;

import com.example.mspedido.entity.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidosRepository extends JpaRepository<Pedidos,Integer> {
}
