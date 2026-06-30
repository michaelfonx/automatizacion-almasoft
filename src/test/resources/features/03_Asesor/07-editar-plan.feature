# language: es
# autor: Franklyn Casasbuenas

Característica: Editar plan fúnebre como Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero editar la información de un plan
  Para mantener los detalles actualizados

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@editarPlanAsesor
Escenario: Editar un plan fúnebre existente
  Cuando ingrese al módulo de Planes
  Y seleccione editar el primer plan
  Y actualice los datos del plan
    | plan_nombre | plan_descripcion | plan_precio | plan_estado |
    | Plan Premium | Plan con servicios completos | 2500000 | 1 |
  Entonces el sistema debe mostrar el mensaje "Plan actualizado correctamente"
