#language: es


Característica: Autenticacion en el sistema funerario
  Como cliente registrado
  Quiero iniciar sesion en el sistema
  Para acceder al contenido y funcionalidades disponibles en mi cuenta

  @login
  Esquema del escenario: Verificar el inicio de sesion exitoso en el sistema
    Dado que el cliente se encuentra en la pagina de inicio de sesion
    Cuando el cliente ingresa sus credenciales

      | correo   | contrasena   |
      | <correo> | <contrasena> |

    Entonces el sistema valida las credenciales
    Y redirige al panel del cliente

    Ejemplos:
      | correo              | contrasena |
      | maicol777@gmail.com | 123456789  |