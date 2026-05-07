

#language: es

Caracteristica: Confirmacion de compra de productos

Como cliente
Quiero confirmar la compra de productos
Para completar la adquisicion

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente tiene productos en el carrito


@confirmar_compra
Escenario: Confirmar compra de productos

Cuando el cliente confirma la compra

Entonces el sistema registra la compra
Y genera una orden
Y asigna un numero de orden
Y redirige al modulo de pago