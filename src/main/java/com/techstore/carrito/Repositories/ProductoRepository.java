package com.techstore.carrito.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techstore.carrito.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
