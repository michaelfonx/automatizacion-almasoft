#language: es

Caracteristica: Eliminacion de productos del carrito

Como cliente
Quiero eliminar productos del carrito
Para modificar mi seleccion antes de comprar

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente se encuentra en la seccion "E-commerce"


@eliminar_producto_especifico
Esquema del escenario: Eliminar un producto especifico del carrito

Dado que el cliente tiene el producto "<producto>" en el carrito

Cuando el cliente selecciona eliminar el producto "<producto>"

Entonces el sistema elimina el producto del carrito
Y el producto "<producto>" ya no aparece en el carrito
Y el sistema recalcula el total

Ejemplos:
| producto        |
| Urna Clasica    |
| Ataud Premium   |


