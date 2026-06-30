package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SidebarAsesorUI extends PageObject {
    public static final Target BTN_INICIO = Target.the("Botón del menú Inicio en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-item')]//span[text()='Inicio']"));
    public static final Target BTN_CLIENTES = Target.the("Botón del menú Clientes en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-item')]//span[text()='Clientes']"));
    public static final Target BTN_PLANES = Target.the("Botón del menú Planes en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-item')]//span[text()='Planes']"));
    public static final Target BTN_PRODUCTOS = Target.the("Botón del menú Productos en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-item')]//span[text()='Productos']"));
    public static final Target BTN_AFILIADOS = Target.the("Botón del menú Afiliados en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-item')]//span[text()='Afiliados']"));
    public static final Target BTN_PERFIL = Target.the("Botón del menú Perfil en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-item')]//span[text()='Perfil']"));
    public static final Target BTN_CERRAR_SESION = Target.the("Botón para cerrar sesión en el sidebar")
            .located(By.xpath("//button[contains(@class, 'sidebar-logout')]"));
    public static final Target NOMBRE_USUARIO = Target.the("Nombre del usuario en la tarjeta de perfil")
            .located(By.xpath("//div[contains(@class, 'sidebar-profile-card')]//strong"));
    public static final Target CORREO_USUARIO = Target.the("Correo del usuario en la tarjeta de perfil")
            .located(By.xpath("//div[contains(@class, 'sidebar-profile-card')]//p[contains(text(), '@')]"));
}
