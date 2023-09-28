package com.example.examen.InterfacesService;


import java.util.List;
import java.util.Optional;

import com.example.examen.model.Producto;


public interface IProductoServices {
    public Producto save( Producto producto);
    public Optional<Producto> Buscar(String id);
    public void update(Producto producto);
    public void delete(String id);
    public List<Producto> findAll();
}