# language: es
# autor: Franklyn Casasbuenas

Característica: Editar cliente como Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero editar la información de un cliente
  Para mantener los datos actualizados

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@editarClienteAsesor
Escenario: Editar un cliente existente
  Cuando ingrese al módulo de Clientes
  Y seleccione editar el primer cliente
  Y actualice los datos del cliente
    | documento | primer_nombre | segundo_nombre | primer_apellido | segundo_apellido | correo | direccion | telefono | fecha_nacimiento | edad | credencial |
    | 987654321 | Maria | Fernanda | Lopez | Ramirez | maria.lopez@test.com | Calle 456 #78-90 | 3109876543 | 1996-08-20 | 28 | 654321 |
  Entonces el sistema debe mostrar el mensaje "Cliente actualizado correctamente"
