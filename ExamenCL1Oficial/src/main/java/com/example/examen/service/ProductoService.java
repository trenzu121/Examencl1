package com.example.examen.service;

import java.util.List;
import java.util.Optional;

import com.example.examen.model.Producto;

public interface ProductoService {
	public Producto save( Producto producto);
	public Optional<Producto> get(Integer id);
	public void update(Producto producto);
	public void delete(Integer id);
	public List<Producto> findAll();

}
