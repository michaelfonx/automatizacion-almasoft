# language: es
# autor: Franklyn Casasbuenas

Característica: Iniciar sesión como Asesor
  Como usuario Asesor de AlmaSoft
  Quiero iniciar sesión en el portal
  Para acceder al panel de asesor

@autenticacionAsesor
Escenario: Verificar autenticación exitosa de Asesor
  Dado que el asesor se encuentra en la página de inicio de sesión de AlmaSoft
  Cuando ingrese las credenciales correctas de asesor
    | correo             | contrasena |
    | asesor@almasoft.com | 123456     |
  Entonces se debe verificar que el asesor haya sido autenticado correctamente
