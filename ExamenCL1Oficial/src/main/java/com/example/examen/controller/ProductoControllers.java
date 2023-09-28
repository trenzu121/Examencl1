package com.example.examen.controller;


import java.io.IOException;
import java.util.Optional;

import com.example.examen.InterfacesService.IProductoServices;
import com.example.examen.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ProductoControllers {

    @Autowired
    private IProductoServices productosService;

    @GetMapping("/productos")
    public String show(Model model) {
        model.addAttribute("productos", productosService.findAll());
        return "productos";
    }

    @GetMapping("/productos/create")
    public String create() {
        return "productos/create";
    }

    @PostMapping("/productos/save")
    public String save(Producto producto, @RequestParam("img") MultipartFile file) throws IOException { 
        return "redirect:/productos";
    }

    @GetMapping("/productos/edit/{id}")
    public String edit(@PathVariable String id, Model model) {
        Optional<Producto> optionalProducto = productosService.Buscar(id);
        if (optionalProducto.isPresent()) {
            Producto producto = optionalProducto.get();
            model.addAttribute("producto", producto);
            return "productos/edit";
        } else {
            // Manejo de error si el producto no se encuentra
            return "redirect:/productos";
        }
    }

    @PostMapping("/productos/update")
    public String update(Producto producto, @RequestParam("img") MultipartFile file) throws IOException {
        return "redirect:/productos";
    }

   
}
