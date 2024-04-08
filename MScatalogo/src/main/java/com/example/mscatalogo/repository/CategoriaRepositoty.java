package com.example.mscatalogo.repository;

import com.example.mscatalogo.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositoty extends JpaRepository<Categoria,Integer>  {
}


