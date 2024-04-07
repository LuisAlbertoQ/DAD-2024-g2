package com.example.mspedido.controller;

import com.example.mspedido.entity.Pedidos;
import com.example.mspedido.servise.PedidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/pedidos")
public class PedidosController {

    @Autowired
    private PedidosService pedidosService;
    @GetMapping
    public ResponseEntity<List<Pedidos>> listar(){
        return ResponseEntity.ok(pedidosService.listar());
    }
    @PostMapping
    public ResponseEntity<Pedidos> guardar(@RequestBody Pedidos pedidos){
        return ResponseEntity.ok(pedidosService.guardar(pedidos));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(pedidosService.listarPorId(id).get());
    }
    @PutMapping
    public ResponseEntity<Pedidos> actualizar(@RequestBody Pedidos pedidos){
        return ResponseEntity.ok(pedidosService.actualizar(pedidos));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Pedidos>> deleteById(@PathVariable(required = true)Integer id){
        pedidosService.eliminarPorId(id);
        return ResponseEntity.ok(pedidosService.listar());
    }
}

