package com.example.mscliente.repository;

import com.example.mscliente.entity.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientesRepository extends JpaRepository<Clientes,Integer> {
}
