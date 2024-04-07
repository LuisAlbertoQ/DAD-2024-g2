package com.example.mspedido.controller;

import com.example.mspedido.entity.Pedidodetalle;
import com.example.mspedido.servise.PedidodetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/pedidodetalle")
public class PedidodetalleController {

    @Autowired
    private PedidodetalleService pedidodetalleService;
    @GetMapping
    public ResponseEntity<List<Pedidodetalle>> listar(){
        return ResponseEntity.ok(pedidodetalleService.listar());
    }
    @PostMapping
    public ResponseEntity<Pedidodetalle> guardar(@RequestBody Pedidodetalle pedidodetalle){
        return ResponseEntity.ok(pedidodetalleService.guardar(pedidodetalle));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidodetalle> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(pedidodetalleService.listarPorId(id).get());
    }
    @PutMapping
    public ResponseEntity<Pedidodetalle> actualizar(@RequestBody Pedidodetalle pedidodetalle){
        return ResponseEntity.ok(pedidodetalleService.actualizar(pedidodetalle));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Pedidodetalle>> deleteById(@PathVariable(required = true)Integer id){
        pedidodetalleService.eliminarPorId(id);
        return ResponseEntity.ok(pedidodetalleService.listar());
    }
}
