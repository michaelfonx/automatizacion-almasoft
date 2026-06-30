package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeAsesorUI extends PageObject {
    public static final Target TITULO_BIENVENIDA = Target.the("Título de bienvenida en el home de Asesor")
            .located(By.xpath("//h1[contains(text(), 'Bienvenido')]"));
    public static final Target CARD_CLIENTES = Target.the("Tarjeta de estadísticas de Clientes")
            .located(By.xpath("//div[contains(@class, 'asesor-info-card')]//h3[text()]/following-sibling::p[text()='Clientes']"));
    public static final Target CARD_PLANES = Target.the("Tarjeta de estadísticas de Planes")
            .located(By.xpath("//div[contains(@class, 'asesor-info-card')]//h3[text()]/following-sibling::p[text()='Planes']"));
    public static final Target CARD_PRODUCTOS = Target.the("Tarjeta de estadísticas de Productos")
            .located(By.xpath("//div[contains(@class, 'asesor-info-card')]//h3[text()]/following-sibling::p[text()='Productos']"));
    public static final Target CARD_AFILIADOS = Target.the("Tarjeta de estadísticas de Afiliados")
            .located(By.xpath("//div[contains(@class, 'asesor-info-card')]//h3[text()]/following-sibling::p[text()='Afiliados']"));
    public static final Target BTN_IR_A_CLIENTES = Target.the("Botón para ir a la sección de Clientes")
            .located(By.xpath("//button[contains(text(), 'Ir a Clientes')]"));
    public static final Target BTN_IR_A_PLANES = Target.the("Botón para ir a la sección de Planes")
            .located(By.xpath("//button[contains(text(), 'Ir a Planes')]"));
    public static final Target BTN_VER_TODOS_PRODUCTOS = Target.the("Botón para ver todos los productos")
            .located(By.xpath("//button[contains(text(), 'Ver todos los productos')]"));
}
