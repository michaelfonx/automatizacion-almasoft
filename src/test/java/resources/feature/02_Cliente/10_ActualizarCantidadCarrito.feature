#language: es

Caracteristica: Actualizacion de cantidad de productos en el carrito

Como cliente
Quiero modificar la cantidad de productos en el carrito
Para ajustar mi compra antes de pagar

Antecedentes:
Dado que el cliente ha iniciado sesion correctamente
Y el cliente se encuentra en la seccion "E-commerce"


@actualizar_cantidad
Escenario: Actualizar cantidad de productos

Dado que el cliente tiene productos en el carrito

Cuando el cliente modifica la cantidad de un producto

Entonces el sistema actualiza la cantidad
Y recalcula el total


@incrementar_cantidad
Escenario: Incrementar cantidad de un producto

Dado que el cliente tiene un producto en el carrito

Cuando el cliente aumenta la cantidad del producto

Entonces el sistema incrementa la cantidad
Y recalcula el total


@disminuir_cantidad
Escenario: Disminuir cantidad de un producto

Dado que el cliente tiene un producto en el carrito

Cuando el cliente reduce la cantidad del producto

Entonces el sistema disminuye la cantidad
Y recalcula el total


@cantidad_invalida
Escenario: Ingresar cantidad invalida

Dado que el cliente tiene un producto en el carrito

Cuando el cliente ingresa una cantidad invalida

Entonces el sistema muestra el mensaje "Cantidad no valida"
Y no actualiza el carrito