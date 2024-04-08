package com.example.mscatalogo.controller;


import com.example.mscatalogo.entity.Producto;
import com.example.mscatalogo.service.Productoservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private Productoservice productoservice;
    @GetMapping
    public ResponseEntity<List<Producto>> listar(){
        return ResponseEntity.ok(productoservice.listar());
    }
    @PostMapping
    public ResponseEntity<Producto> guardar(@RequestBody Producto producto){
        return ResponseEntity.ok(productoservice.guardar(producto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(productoservice.listarPorld(id).get());
    }
    @PutMapping
    public ResponseEntity<Producto> actualizar(@RequestBody Producto producto){
        return ResponseEntity.ok(productoservice.actualizar(producto));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Producto>> deleteById(@PathVariable(required = true)Integer id){
        productoservice.eliminarPorld(id);
        return ResponseEntity.ok(productoservice.listar());
    }
}
