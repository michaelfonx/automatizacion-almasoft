# language: es

# autor: Estefania Torres

Característica: Actualizar un producto

  Como usuario Administrador de AlmaSoft autenticado
  Quiero actualizar la información de un producto
  Para mantener los datos actualizados de los productos

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft
    Cuando ingrese las credenciales correctas (Correo electronico y contraseña)


  | correo          | contrasena |
  | admin@gmail.com | 123456     |

    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina.


  @actualizarProducto
  Escenario: Actualizar un producto exitosamente

    Cuando ingrese al módulo de productos

    Y seleccione el producto "Ataud Premiun"

    Y actualice los datos del producto

      | precio | stock |
      | 450000 | 20    |

    Entonces el sistema deberá mostrar el mensaje "Producto actualizado correctamente"

