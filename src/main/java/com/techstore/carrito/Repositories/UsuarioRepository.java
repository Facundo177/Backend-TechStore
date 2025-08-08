package com.techstore.carrito.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techstore.carrito.Entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
