package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductosAsesorUI extends PageObject {
    public static final Target TITULO_PRODUCTOS = Target.the("Título Lista de Productos")
            .located(By.xpath("//h1[text()='Lista de Productos']"));
    public static final Target INPUT_BUSQUEDA = Target.the("Input de búsqueda de productos")
            .located(By.xpath("//input[@placeholder='Buscar producto por nombre...']"));
    public static final Target TABLA_PRODUCTOS = Target.the("Tabla de productos")
            .located(By.xpath("//table[contains(@class,'asesor-table')]"));
}
