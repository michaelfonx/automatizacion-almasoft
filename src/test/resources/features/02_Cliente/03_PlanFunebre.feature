#language: es

Característica: Compra de plan funerario

  Como cliente autenticado
  Quiero adquirir un plan
  Para obtener los servicios

  @plan
  Esquema del escenario: Compra exitosa

    Dado que el cliente ha iniciado sesion para adquirir un plan
    Cuando el cliente selecciona un plan funerario
    Entonces el sistema registra el plan en la base de datos
    Y muestra el mensaje de plan "Plan adquirido correctamente"

    Ejemplos:
      | nombrePlan  |
      | Plan Basico |