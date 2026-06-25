package co.com.automatizacionAlmasoft.userinterfaces.Admin;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.findby.By;

public class AutenticacionUI extends PageObject {

    public static final Target BTN_ABRIR_LOGIN =
            Target.the("Boton abrir formulario login")
                    .located(By.xpath("//a[contains(text(),'Iniciar Sesión')]"));

    public static final Target INPUT_USUARIO =
            Target.the("Correo")
                    .located(By.xpath("//input[@type='email']"));

    public static final Target INPUT_CREDENCIAL =
            Target.the("Contraseña")
                    .located(By.xpath("//input[@type='password']"));

    public static final Target BTN_INICIOSESION = Target.the("Boton enviar login")
            .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_LOGIN =
            Target.the("Mensaje de login exitoso")
                    .located(By.xpath("//h1[contains(text(),'Logged In Successfully')]"));
}