package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AfiliadosAsesorUI extends PageObject {
    public static final Target TITULO_AFILIADOS = Target.the("Título Gestión de Afiliados")
            .located(By.xpath("//h1[text()='Gestión de Afiliados']"));
    public static final Target INPUT_BUSQUEDA = Target.the("Input de búsqueda de afiliados")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar por documento')]"));
    public static final Target BTN_REGISTRAR_AFILIADO = Target.the("Botón Registrar Nuevo Afiliado")
            .located(By.xpath("//button[contains(text(), 'Registrar Nuevo Afiliado')]"));
    public static final Target TABLA_AFILIADOS = Target.the("Tabla de afiliados")
            .located(By.xpath("//table[contains(@class, 'asesor-table')]"));
    public static final Target BTN_ACTUALIZAR_AFILIADO = Target.the("Botón Actualizar de un afiliado")
            .locatedBy("//tbody//button[contains(text(), 'Actualizar')]");
    public static final Target PRIMER_AFILIADO = Target.the("Primer afiliado en la tabla")
            .located(By.xpath("//tbody//tr[1]"));
}
