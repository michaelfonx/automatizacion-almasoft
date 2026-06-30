package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UsuarioUI {

    public static final Target BTN_USUARIOS = Target.the("Botón usuarios")
            .located(By.xpath("//a[contains(text(),'Usuarios')]"));

    public static final Target BTN_AGREGAR_USUARIO =
            Target.the("Botón agregar usuario")
                    .located(By.xpath("//a[contains(text(),'Agregar Usuario')]"));

    public static final Target SELECT_ROL = Target.the("Lista rol")
            .located(By.name("Rol"));

    public static final Target INPUT_DOCUMENTO = Target.the("Campo documento")
            .located(By.name("Documento"));

    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Campo primer nombre")
            .located(By.name("PrimerNombre"));

    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Campo segundo nombre")
            .located(By.name("SegundoNombre"));

    public static final Target INPUT_PRIMER_APELLIDO = Target.the("Campo primer apellido")
            .located(By.name("PrimerApellido"));

    public static final Target INPUT_SEGUNDO_APELLIDO = Target.the("Campo segundo apellido")
            .located(By.name("SegundoApellido"));

    public static final Target INPUT_DIRECCION = Target.the("Campo dirección")
            .located(By.name("Direccion"));

    public static final Target INPUT_TELEFONO = Target.the("Campo teléfono")
            .located(By.name("Telefono"));

    public static final Target INPUT_CORREO = Target.the("Campo correo")
            .located(By.name("Correo"));

    public static final Target INPUT_CONTRASENA = Target.the("Campo contraseña")
            .located(By.name("Credencial"));

    public static final Target BTN_GUARDAR = Target.the("Botón guardar")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_USUARIO_CREADO =
            Target.the("Mensaje usuario creado")
                    .located(By.xpath("//*[contains(text(),'Datos enviados')]"));

    // LISTADO
    public static final Target INPUT_BUSCAR =
            Target.the("Buscar usuario")
                    .located(By.xpath("//input[@placeholder='Buscar por documento']"));

    public static final Target BTN_ACCIONES =
            Target.the("Botón acciones")
                    .located(By.xpath("//button[contains(.,'Acciones')]"));

    public static final Target BTN_EDITAR =
            Target.the("Botón editar")
                    .located(By.xpath("//a[contains(@href,'/usuarios/EditarUsuario/')]"));

    public static final Target BTN_PRIMER_ACCIONES =
            Target.the("Botón acciones del primer usuario")
                    .located(By.xpath("(//button[contains(.,'Acciones')])[1]"));

    public static final Target BTN_ELIMINAR =
            Target.the("Opción eliminar")
                    .located(By.xpath("//a[contains(.,'Eliminar')]"));

    // FORMULARIO EDITAR

    public static final Target EDIT_TELEFONO =
            Target.the("Telefono")
                    .located(By.name("telefono"));

    public static final Target EDIT_DIRECCION =
            Target.the("Direccion")
                    .located(By.name("direccion"));

    public static final Target BTN_GUARDAR_EDICION =
            Target.the("Guardar edición")
                    .located(By.xpath("//button[@type='submit']"));
}

