# language: es
# autor: Franklyn Casasbuenas

Característica: Crear un nuevo cliente como Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero crear un nuevo cliente
  Para mantener actualizada la lista de clientes

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@crearClienteAsesor
Escenario: Crear un nuevo cliente exitosamente
  Cuando ingrese al módulo de Clientes
  Y diligencie el formulario con los datos válidos del cliente
    | documento | primer_nombre | segundo_nombre | primer_apellido | segundo_apellido | correo | direccion | telefono | fecha_nacimiento | edad | credencial |
    | 1234567890 | Carlos | Andres | Perez | Garcia | carlos.perez@test.com | Calle 123 #45-67 | 3101234567 | 1995-05-15 | 29 | 123456 |
  Entonces el sistema debe mostrar el mensaje "Cliente creado correctamente"
