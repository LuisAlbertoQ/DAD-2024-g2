package com.example.mscatalogo.controller;

import com.example.mscatalogo.entity.Categoria;
import com.example.mscatalogo.service.Categoriaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private Categoriaservice categoriaservice;
    @GetMapping
    public ResponseEntity<List<Categoria>> listar(){
        return ResponseEntity.ok(categoriaservice.listar());
    }
    @PostMapping
    public ResponseEntity<Categoria> guardar(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaservice.guardar(categoria));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Categoria> insertPorld(@PathVariable(required = true) Integer id){
        return ResponseEntity.ok().body(categoriaservice.listarPorld(id).get());
    }
    @PutMapping
    public ResponseEntity<Categoria> actualizar(@RequestBody Categoria categoria){
        return ResponseEntity.ok(categoriaservice.actualizar(categoria));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<Categoria>> deleteById(@PathVariable(required = true)Integer id){
        categoriaservice.eliminarPorld(id);
        return ResponseEntity.ok(categoriaservice.listar());
    }

}
