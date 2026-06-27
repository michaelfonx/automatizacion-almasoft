# language: es
# autor: Estefania Torres

Característica: Eliminar un usuario

  Como administrador autenticado
  Quiero eliminar un usuario
  Para eliminar registros del sistema

  Antecedentes:

    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft

    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | correo          | contrasena |
      | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @eliminarUsuario
  Escenario: Eliminar un usuario exitosamente

    Cuando ingrese al módulo de usuarios

    Y seleccione el usuario a eliminar

    Entonces el usuario deberá eliminarse correctamente