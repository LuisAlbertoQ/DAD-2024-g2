package com.example.mspedido.feign;

import com.example.mspedido.dto.ClientesDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "mscliente-service", path = "/clientes")
public interface ClienteFeign {

    @GetMapping("/{id}")
    public ResponseEntity<ClientesDto> listById(@PathVariable(required = true) Integer id);
}
