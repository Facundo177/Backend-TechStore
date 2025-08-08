package com.techstore.carrito.Entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Carrito {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
