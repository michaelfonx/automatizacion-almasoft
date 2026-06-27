# language: es
# autor: Estefania Torres

Característica: Editar usuario

  Como administrador autenticado
  Quiero editar un usuario
  Para actualizar su información

  Antecedentes:

    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft

    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | correo          | contrasena |
      | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @editarUsuario
  Escenario: Editar un usuario exitosamente

    Cuando ingrese al módulo de usuarios

    Y seleccione el usuario

    Y actualice los datos del usuario

      | telefono   | direccion |
      | 3201112233 | Calle 100 |

    Entonces el sistema deberá mostrar el mensaje "Usuario actualizado correctamente"