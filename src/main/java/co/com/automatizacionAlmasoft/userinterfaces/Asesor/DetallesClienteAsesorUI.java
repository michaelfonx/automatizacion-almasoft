package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DetallesClienteAsesorUI extends PageObject {
    public static final Target TITULO_DETALLES = Target.the("Título detalles del cliente")
            .located(By.xpath("//h1[text()='Detalles del Cliente']"));
    public static final Target BOTON_VOLVER_LISTA = Target.the("Botón volver a la lista de clientes")
            .located(By.xpath("//button[contains(text(),'Volver a la lista')]"));
    public static final Target BOTON_EDITAR_PERFIL = Target.the("Botón editar perfil del cliente")
            .located(By.xpath("//button[contains(text(),'Editar Perfil')]"));
    public static final Target TEXTO_NOMBRE_CLIENTE = Target.the("Texto con el nombre del cliente")
            .locatedBy("//h3[contains(text(),'{0}')]");
}
