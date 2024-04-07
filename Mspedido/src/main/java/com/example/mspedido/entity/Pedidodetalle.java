package com.example.mspedido.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Pedidodetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombreproducto;
    private int cantidad;
    private BigDecimal precio;

    @ManyToOne
    private Pedidos pedidos;
}
