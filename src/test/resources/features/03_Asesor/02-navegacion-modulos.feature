# language: es
# autor: Franklyn Casasbuenas

Característica: Navegar por los módulos del panel de Asesor
  Como usuario Asesor de AlmaSoft autenticado
  Quiero navegar por los diferentes módulos del panel
  Para acceder a las funcionalidades de cada sección

Antecedentes:
  Dado que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |

@navegacionCliente
Escenario: Navegar al módulo de Clientes
  Cuando ingrese al módulo de Clientes
  Entonces se debe verificar que se encuentra en la sección de Clientes

Escenario: Navegar al módulo de Planes
  Cuando ingrese al módulo de Planes
  Entonces se debe verificar que se encuentra en la sección de Planes

Escenario: Navegar al módulo de Productos
  Cuando ingrese al módulo de Productos
  Entonces se debe verificar que se encuentra en la sección de Productos

Escenario: Navegar al módulo de Afiliados
  Cuando ingrese al módulo de Afiliados
  Entonces se debe verificar que se encuentra en la sección de Afiliados
