package com.techstore.carrito.Entities;

import com.techstore.carrito.Resources.Rol;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Usuario {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nombre;

    private String contrasena;

    private Rol rol;

}
