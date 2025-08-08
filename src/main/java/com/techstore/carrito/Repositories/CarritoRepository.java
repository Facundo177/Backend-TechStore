package com.techstore.carrito.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techstore.carrito.Entities.Carrito;

public interface CarritoRepository extends JpaRepository<Carrito, Long> {

}
