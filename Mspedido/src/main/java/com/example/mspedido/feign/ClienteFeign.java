package com.example.mspedido.feign;

import com.example.mspedido.dto.ClientesDto;
import com.example.mspedido.dto.ProductoDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "mscliente-service", path = "/clientes")
public interface ClienteFeign {

    @GetMapping("/{id}")
    @CircuitBreaker(name = "clientesListarPorIdCB", fallbackMethod = "fallBackCliente")
    public ResponseEntity<ClientesDto> listById(@PathVariable(required = true) Integer id);
    default ResponseEntity<ClientesDto> fallBackCliente(Integer id, Exception e) {

        return ResponseEntity.ok(new ClientesDto());
    }
}
