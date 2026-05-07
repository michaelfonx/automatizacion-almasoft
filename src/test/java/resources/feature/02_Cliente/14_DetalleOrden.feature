#language: es

Caracteristica: Detalle de una orden de compra

Como cliente
Quiero ver el detalle de una orden
Para conocer la informacion completa de la compra

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente tiene compras realizadas


@detalle_orden
Escenario: Ver detalle de una orden

Cuando el cliente selecciona una orden

Entonces el sistema muestra el detalle de la orden
Y muestra los productos incluidos
Y muestra el total pagado
Y muestra el estado