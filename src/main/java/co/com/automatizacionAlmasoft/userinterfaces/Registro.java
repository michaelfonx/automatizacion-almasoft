package co.com.automatizacionAlmasoft.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Registro extends PageObject {

    public static final Target BTN_IR_REGISTRO =
            Target.the("Boton ir a registro")
                    .located(By.className("hdr-btn-register"));

    public static final Target INPUT_DOCUMENTO =
            Target.the("Documento")
                    .located(By.name("DocumentoCliente"));

    public static final Target INPUT_PRIMER_NOMBRE =
            Target.the("Primer nombre")
                    .located(By.name("PrimerNombreCliente"));

    public static final Target INPUT_SEGUNDO_NOMBRE =
            Target.the("Segundo nombre")
                    .located(By.name("SegundoNombreCliente"));

    public static final Target INPUT_PRIMER_APELLIDO =
            Target.the("Primer apellido")
                    .located(By.name("PrimerApellidoCliente"));

    public static final Target INPUT_SEGUNDO_APELLIDO =
            Target.the("Segundo apellido")
                    .located(By.name("SegundoApellidoCliente"));

    public static final Target INPUT_DIRECCION =
            Target.the("Direccion")
                    .located(By.name("DireccionCliente"));

    public static final Target INPUT_TELEFONO =
            Target.the("Telefono")
                    .located(By.name("TelefonoCliente"));

    public static final Target INPUT_CORREO =
            Target.the("Correo")
                    .located(By.name("CorreoCliente"));

    public static final Target INPUT_CONTRASENA =
            Target.the("Contraseña")
                    .located(By.name("Credencial"));

    public static final Target INPUT_FECHA_NACIMIENTO =
            Target.the("Fecha nacimiento")
                    .located(By.name("FechaNacimiento"));

    public static final Target BTN_GUARDAR =
            Target.the("Boton guardar")
                    .located(By.cssSelector("button[type='submit']"));

    public static final Target MENSAJE_REGISTRO =
            Target.the("Mensaje de registro exitoso")
                    .located(By.xpath("//*[contains(text(),'Usuario registrado correctamente')]"));

}