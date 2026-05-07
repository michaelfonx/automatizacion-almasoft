#language: es

Caracteristica: Gestion del carrito de compras

Como cliente autenticado
Quiero agregar productos al carrito
Para seleccionarlos antes de comprarlos

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente se encuentra en la seccion "E-commerce"


@agregar_carrito
Esquema del escenario: Agregar producto al carrito

Cuando el cliente selecciona el producto "<producto>"
Y agrega el producto al carrito

Entonces el sistema agrega el producto al carrito
Y el carrito contiene el producto "<producto>"
Y el sistema actualiza la cantidad de productos en el carrito

Ejemplos:
| producto       |
| Urna Clasica   |
| Ataud Premium  |