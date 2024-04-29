package com.example.mspedido.dto;

import lombok.Data;

@Data
public class ClientesDto {
    private Integer id;
    private String nombres;
    private String apellidos;
    private String dni;
    private Number celular;
}
