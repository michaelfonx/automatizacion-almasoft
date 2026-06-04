package co.com.automatizacionAlmasoft.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl(value = "http://localhost:3000/")
public class Autenticacion extends PageObject {


    public static Target BTN_IR_LOGIN =
            Target.the("Boton ir a login")
                    .located(By.xpath("//a[@href='/pages/IniciarSesion']"));


    public static Target INPUT_USUARIO =
            Target.the("Ingreso del Usuario")
                    .located(By.name("usuario_correo"));

    public static Target INPUT_CLAVE =
            Target.the("Ingreso del password")
                    .located(By.name("usuario_credencial"));


    public static Target BTN_INICIOSESION =
            Target.the("Click Boton inicio sesion")
                    .located(By.xpath("//button[contains(text(),'Iniciar Sesión')]"));

    public static Target TEXTO_BIENVENIDA =
            Target.the("Texto de bienvenida del cliente")
                    .located(By.xpath("//h1[contains(text(),'Bienvenido')]"));

}