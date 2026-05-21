  #language: es


  Característica: Compra de plan funerario
    Como cliente autenticado
    Quiero adquirir un plan funerario
    Para obtener los servicios funerarios disponibles

    Antecedentes:
      Dado que el cliente ha iniciado sesion para adquirir un plan

    @plan
    Esquema del escenario: Verificar la compra exitosa de un plan funerario
      Cuando el cliente selecciona un plan funerario
        | nombrePlan       |
        | <nombrePlan>     |
      Entonces el sistema registra el plan en la base de datos
      Y muestra el mensaje de plan "Plan adquirido correctamente"

      Ejemplos:
        | nombrePlan  |
        | Plan Basico |