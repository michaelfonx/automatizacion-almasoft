# language: es
# autor: Estefania Torres

Característica: Crear una subcategoría

  Como usuario Administrador de AlmaSoft autenticado
  Quiero crear una nueva subcategoría
  Para registrar nuevas subcategorías en el sistema

  Antecedentes:

    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft

    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | correo          | contrasena |
      | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @crearSubcategoria
  Escenario: Crear una subcategoría exitosamente

    Cuando ingrese al módulo de subcategorías

    Y diligencie los datos de la subcategoría

      | categoria | nombre |
      | Ataud     | Demo   |

    Entonces el sistema deberá mostrar el mensaje de subcategoría "Subcategoría creada correctamente"