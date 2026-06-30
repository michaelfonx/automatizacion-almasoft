# language: es
# autor: Franklyn Casasbuenas

Característica: Ver detalles del cliente como Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero ver los detalles de un cliente
  Para revisar su información personal

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@detallesClienteAsesor
Escenario: Ver los detalles de un cliente
  Cuando ingrese al módulo de Clientes
  Y seleccione ver los detalles del primer cliente
  Entonces se debe ver la información completa del cliente
