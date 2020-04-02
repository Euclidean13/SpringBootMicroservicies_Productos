package com.app.productos.controllers;

import com.app.productos.models.entity.Producto;
import com.app.productos.models.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class ProductoController {

    // @Autowired
    // private Environment env;

    @Value("${server.port}")
    private Integer port;

    @Autowired
    private IProductoService productoService;

    @GetMapping("/listar")
    public List<Producto> listar() {
        return productoService.findAll().stream().map(producto -> {
            // producto.setPort(Integer.parseInt(Objects.requireNonNull(env.getProperty("local.server.port"))));
            producto.setPort(port);
            return producto;
        }).collect(Collectors.toList());
    }

    @GetMapping("/ver/{id}")
    public Producto detalle(@PathVariable Long id) {
        Producto producto = productoService.findById(id);
        // producto.setPort(Integer.parseInt(Objects.requireNonNull(env.getProperty("local.server.port"))));
        producto.setPort(port);

        // Forced exception in order to test Hystix. Check that metodo alternativo is called in item
//        boolean ok = false;
//        if (ok == false) {
//             throw new Exception("No se pudo cargar el producto");
//        }

//        try {
//            Thread.sleep(2000L);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return producto;
    }
}
