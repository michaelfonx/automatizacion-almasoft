#language: es

Característica: Pago de plan funerario
  Como cliente
  Quiero pagar mi plan funerario
  Para activarlo y acceder a los servicios

  Antecedentes:
    Dado que el cliente ha iniciado sesion correctamente
    Y se encuentra en en modulo de plan

  @pago
  Esquema del escenario: Verificar el pago exitoso del plan funerario
    Cuando el cliente realiza el pago del plan
      | metodoPago       |
      | <metodoPago>     |
    Entonces el sistema registra la transaccion
    Y muestra el mensaje de pago "Pago exitoso"

    Ejemplos:
      | metodoPago |
      | Tarjeta    |