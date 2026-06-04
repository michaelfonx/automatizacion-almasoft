#language: es

Característica: Pago de plan funerario

  Escenario: Registrar pago exitoso

    Dado que el cliente se encuentra en el modulo de inicio de sesion

    Cuando el cliente inicia sesion para adquirir un plan
      | correo              | contrasena |
      | maicol777@gmail.com | 123456789  |

    Y selecciona un plan funerario

    Y registra el pago
      | metodoPago |
      | PSE        |

    Entonces muestra el plan adquirido