#language: es

Caracteristica: Visualizacion del resumen de compra

Como cliente
Quiero ver el resumen de mi compra
Para validar los productos antes de pagar

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente tiene productos en el carrito


@ver_resumen
Escenario: Ver resumen de compra

Cuando el cliente inicia el proceso de compra

Entonces el sistema muestra el resumen de la orden
Y muestra los productos seleccionados
Y muestra el total a pagar