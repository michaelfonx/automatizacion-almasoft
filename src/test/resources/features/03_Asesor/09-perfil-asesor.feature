# language: es
# autor: Franklyn Casasbuenas

Característica: Gestionar perfil del Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero ver y editar mi perfil
  Para mantener mi información personal actualizada

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@verPerfilAsesor
Escenario: Ver el perfil del asesor
  Cuando ingrese al módulo de Perfil
  Entonces se debe ver la información del perfil del asesor

@actualizarPerfilAsesor
Escenario: Actualizar la información del perfil
  Cuando ingrese al módulo de Perfil
  Y actualice su información personal
    | usuario_primer_nombre | usuario_segundo_nombre | usuario_primer_apellido | usuario_segundo_apellido | usuario_documento | usuario_correo | usuario_direccion | usuario_credencial |
    | Carlos | Andres | Rios | Gomez | 11223344 | carlos.rios@almasoft.com | Calle 101 #11-22 | 654321 |
  Entonces el sistema debe mostrar el mensaje "Perfil actualizado correctamente"
