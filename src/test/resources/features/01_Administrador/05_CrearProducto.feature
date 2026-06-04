#language: es

Característica: Creación de producto funerario

  Escenario: Crear producto funerario

    Dado que el administrador se encuentra en el modulo de inicio de sesion

    Cuando el administrador inicia sesion
      | correo           | contrasena |
      | nelson@gmail.com | 123456789  |

    Y crea un nuevo producto funerario

    Entonces se valida la creacion del producto