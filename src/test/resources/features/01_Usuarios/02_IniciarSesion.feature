#language: es

Característica: Inicio de sesion

  Como cliente registrado
  Quiero iniciar sesion
  Para acceder al sistema

  @login
  Esquema del escenario: Inicio exitoso

    Dado que el cliente se encuentra en la pagina de inicio de sesion
    Cuando el cliente ingresa sus credenciales
    Entonces el sistema valida las credenciales
    Y redirige al panel del cliente

    Ejemplos:
      | correo              | contraseña |
      | juanperez@mail.com | 12345678   |