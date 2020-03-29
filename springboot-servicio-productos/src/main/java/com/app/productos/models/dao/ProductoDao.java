package com.app.productos.models.dao;

import com.app.productos.models.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// Not necessary to annotate Repository because CrudRepository is already a spring bean
public interface ProductoDao extends CrudRepository<Producto, Long> {
}
