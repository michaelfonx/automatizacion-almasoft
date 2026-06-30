package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ClientesAsesorUI extends PageObject {
    public static final Target TITULO_CLIENTES = Target.the("Título Lista de clientes")
            .located(By.xpath("//h1[text()='Lista de clientes']"));
    public static final Target INPUT_BUSQUEDA = Target.the("Input de búsqueda de clientes")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar por documento')]"));
    public static final Target BTN_AGREGAR_CLIENTE = Target.the("Botón Agregar Cliente")
            .located(By.xpath("//button[contains(text(), 'Agregar Cliente')]"));
    public static final Target TABLA_CLIENTES = Target.the("Tabla de clientes")
            .located(By.xpath("//table[contains(@class, 'asesor-table')]"));
    public static final Target BTN_DETALLES_CLIENTE = Target.the("Botón Detalles de un cliente")
            .locatedBy("//tbody//button[contains(text(), 'Detalles')]");
    public static final Target BTN_EDITAR_CLIENTE = Target.the("Botón Editar de un cliente")
            .locatedBy("//tbody//button[contains(text(), 'Editar')]");
    public static final Target PRIMER_CLIENTE = Target.the("Primer cliente en la tabla")
            .located(By.xpath("//tbody//tr[1]"));
}
