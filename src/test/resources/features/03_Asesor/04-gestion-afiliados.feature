# language: es
# autor: Franklyn Casasbuenas

Característica: Registrar un nuevo afiliado como Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero registrar un nuevo afiliado
  Para mantener actualizada la lista de afiliados

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@registrarAfiliadoAsesor
Escenario: Registrar un nuevo afiliado exitosamente
  Cuando ingrese al módulo de Afiliados
  Y diligencie el formulario con los datos válidos del afiliado
    | cliente_id | documento | primer_nombre | segundo_nombre | primer_apellido | segundo_apellido | correo | telefono |
    | 1 | 987654321 | Ana | Maria | Lopez | Gomez | ana.lopez@test.com | 3119876543 |
  Entonces el sistema debe mostrar el mensaje "Afiliado registrado y vinculado correctamente"
