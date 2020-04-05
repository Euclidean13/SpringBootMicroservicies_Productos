package com.app.item.springbootservicioitem.models.service;

import com.app.commons.springbootserviciocommons.models.entity.Producto;
import com.app.item.springbootservicioitem.models.Item;

import java.util.List;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);

    public Producto save(Producto producto);
    public Producto update(Producto producto, Long id);
    public void delete(Long id);
}
