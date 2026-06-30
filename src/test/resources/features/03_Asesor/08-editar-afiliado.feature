# language: es
# autor: Franklyn Casasbuenas

Característica: Editar afiliado como Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero editar la información de un afiliado
  Para mantener los datos actualizados

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@editarAfiliadoAsesor
Escenario: Editar un afiliado existente
  Cuando ingrese al módulo de Afiliados
  Y seleccione editar el primer afiliado
  Y actualice los datos del afiliado
    | documento | primer_nombre | segundo_nombre | primer_apellido | segundo_apellido | correo | direccion | telefono |
    | 1122334455 | Ana | Carolina | Garcia | Rodriguez | ana.garcia@test.com | Calle 789 #01-23 | 3112345678 |
  Entonces el sistema debe mostrar el mensaje "Información del afiliado actualizada correctamente"
