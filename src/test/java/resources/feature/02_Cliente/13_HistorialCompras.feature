#language: es

Caracteristica: Historial de compras

Como cliente
Quiero ver mis compras realizadas
Para consultar mis pedidos anteriores

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente


@historial_compras
Escenario: Ver historial de compras

Cuando el cliente accede a "Mis compras"

Entonces el sistema muestra las ordenes realizadas
Y muestra los productos comprados
Y muestra el estado de la compra