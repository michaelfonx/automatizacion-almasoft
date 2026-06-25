# language: es

# autor: Estefania Torres

Característica: Crear un nuevo usuario

  Como usuario Administrador de AlmaSoft autenticado
  Quiero crear un nuevo usuario
  Para registrar usuarios en el sistema

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | correo          | contrasena |
      | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.


  @crearUsuario
  Escenario: Crear un nuevo usuario exitosamente

    Cuando ingrese al módulo de usuarios

    Y diligencie el formulario con los datos válidos del usuario

      | rol    | primerNombre | segundoNombre | primerApellido | segundoApellido | direccion | contrasena |
      | Asesor | usuario      | test          | test           | test            | Calle 1   | 123456     |

    Entonces el sistema deberá mostrar el mensaje "Usuario creado correctamente"

