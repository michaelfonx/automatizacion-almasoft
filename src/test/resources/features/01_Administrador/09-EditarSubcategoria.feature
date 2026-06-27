# language: es
# autor: Estefania Torres

Característica: Actualizar una subcategoría

  Como usuario Administrador de AlmaSoft autenticado
  Quiero actualizar una subcategoría
  Para mantener la información actualizada

  Antecedentes:

    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft

    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)

      | correo          | contrasena |
      | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.

  @editarSubcategoria
  Escenario: Actualizar una subcategoría exitosamente

    Cuando ingrese al módulo de subcategorías

    Y seleccione la subcategoría a actualizar

    Y actualice los datos de la subcategoría

      | nombre               | categoria |
      | Subcategoria Editada | Ataud     |

    Entonces el sistema deberá mostrar el mensaje de subcategoría actualizada "Subcategoría actualizada"