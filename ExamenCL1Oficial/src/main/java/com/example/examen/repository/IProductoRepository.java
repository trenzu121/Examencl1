package com.example.examen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer> {

}
