package com.techstore.carrito.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.techstore.carrito.Entities.Producto;

public interface UsuarioRepository extends CrudRepository<Producto, Long> {

}
