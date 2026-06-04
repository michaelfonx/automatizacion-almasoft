#language: es

Característica: Selección de plan funerario

  Escenario: Seleccionar plan funerario

    Dado que el cliente se encuentra en el modulo de inicio de sesion

    Cuando el cliente inicia sesion para adquirir un plan
      | correo              | contrasena |
      | maicol777@gmail.com | 123456789  |

    Y selecciona un plan funerario

    Entonces se muestra el formulario de pago