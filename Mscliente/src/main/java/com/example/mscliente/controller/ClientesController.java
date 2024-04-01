package com.example.mscliente.controller;


import com.example.mscliente.entity.Clientes;
import com.example.mscliente.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClientesController {

    @Autowired
    private ClientesService clientesService;
    @GetMapping
    public ResponseEntity<List<Clientes>> listar(){
        return ResponseEntity.ok(clientesService.listar());
    }
    @PostMapping
    public ResponseEntity<Clientes> guardar(@RequestBody Clientes clientes){
        return ResponseEntity.ok(clientesService.guardar(clientes));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(clientesService.listarPorld(id).get());
    }
    @PutMapping
    public ResponseEntity<Clientes> actualizar(@RequestBody Clientes clientes){
        return ResponseEntity.ok(clientesService.actualizar(clientes));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Clientes>> deleteById(@PathVariable(required = true)Integer id){
        clientesService.eliminarPorld(id);
        return ResponseEntity.ok(clientesService.listar());
    }
}
