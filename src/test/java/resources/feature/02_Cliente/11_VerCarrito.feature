#language: es

Caracteristica: Visualizacion del carrito de compras

Como cliente autenticado
Quiero ver los productos en mi carrito
Para revisar mi seleccion antes de comprar

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente se encuentra en la seccion "E-commerce"


@ver_carrito
Escenario: Visualizar carrito de compras

Dado que el cliente tiene productos en el carrito

Cuando el cliente accede al carrito

Entonces el sistema muestra los productos en el carrito
Y muestra la cantidad de cada producto
Y muestra el total a pagar correctamente