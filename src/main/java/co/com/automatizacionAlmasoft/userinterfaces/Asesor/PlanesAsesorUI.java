package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlanesAsesorUI extends PageObject {
    public static final Target TITULO_PLANES = Target.the("Título Planes Fúnebres")
            .located(By.xpath("//h1[text()='Planes Fúnebres']"));
    public static final Target INPUT_BUSQUEDA = Target.the("Input de búsqueda de planes")
            .located(By.xpath("//input[contains(@placeholder, 'Buscar plan por nombre')]"));
    public static final Target TABLA_PLANES = Target.the("Tabla de planes")
            .located(By.xpath("//table[contains(@class, 'asesor-table')]"));
    public static final Target BTN_EDITAR_PLAN = Target.the("Botón Editar de un plan")
            .locatedBy("//tbody//button[contains(text(), 'Editar')]");
    public static final Target PRIMER_PLAN = Target.the("Primer plan en la tabla")
            .located(By.xpath("//tbody//tr[1]"));
}
