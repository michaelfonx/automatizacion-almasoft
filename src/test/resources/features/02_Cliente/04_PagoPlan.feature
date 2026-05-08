#language: es

Característica: Pago de plan funerario

  Como cliente
  Quiero pagar mi plan
  Para activarlo

  @pago
  Esquema del escenario: Pago exitoso

    Dado que el cliente ha iniciado sesion correctamente
    Cuando el cliente realiza el pago del plan
    Entonces el sistema registra la transaccion
    Y muestra el mensaje de pago "Pago exitoso"

    Ejemplos:
      | metodoPago |
      | Tarjeta    |