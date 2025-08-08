# Backend-TechStore

Backend para el Proyecto Talento Tech, hecho en Java con Spring Boot.

El FrontEnd previamente creado es https://github.com/Facundo177/Proyecto-Talento-Tech. \
Se puede visitar en GitHub Pages a través del siguiente enlace: https://facundo177.github.io/Proyecto-Talento-Tech/index.html

La idea es crear una API REST que procese los carritos de compra creados mediante el Front. Los datos se recibirán en formato JSON.

La estructura de un carrito de compras es la de una lista de productos, como en el siguiente ejemplo:

    [
        {
            "id": 122,
            "nombre": "iPhone 6",
            "precio": 299.99,
            "cantidad": 2
        },
        {
            "id": 126,
            "nombre": "Oppo F19 Pro Plus",
            "precio": 399.99,
            "cantidad": 1
        },
        {
            "id": 128,
            "nombre": "Realme C35",
            "precio": 149.99,
            "cantidad": 1
        },
        {
            "id": 131,
            "nombre": "Samsung Galaxy S7",
            "precio": 299.99,
            "cantidad": 1
        },
        {
            "id": 135,
            "nombre": "Vivo V9",
            "precio": 299.99,
            "cantidad": 1
        }
    ]


Cada producto tiene cuatro campos: un id, un nombre, un precio y una cantidad. 

Consideraciones:
- Por construcción del Front, sabemos que no hay repetición de productos, ya que estos solo aumentarían la cantidad de dicho producto.
- Los productos vienen de alguna otra API externa, no son creados aquí.
- Posiblemente haya que adaptar el código actual del FrontEnd para que funcione con esta API, son proyectos separados.
- Esta API no incluye ningún tipo de pasarela de pago.

Base de datos:
- Cada usuario tiene muchos carritos
- Cada carrito tiene muchos productos