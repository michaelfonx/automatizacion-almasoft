package co.com.automatizacionAlmasoft.userinterfaces.Cliente;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlanFunebre {

    public static final Target BTN_EXPLORAR_PLANES = Target.the("Boton explorar planes")
            .located(By.cssSelector("button.client-primary-button"));

    public static final Target BTN_VER_DETALLES = Target.the("Boton ver detalles")
            .located(By.xpath("//button[contains(.,'Ver detalles y adquirir')]"));

    public static final Target BTN_ADQUIRIR_PLAN = Target.the("Boton adquirir plan")
            .located(By.xpath("//button[contains(text(),'Adquirir plan')]"));

    public static final Target SELECT_METODO_PAGO = Target.the("Metodo pago")
            .located(By.id("metodoPago"));

    public static final Target SELECT_ENTIDAD_PSE = Target.the("Entidad financiera")
            .located(By.id("entidadPse"));

    public static final Target SELECT_TIPO_CLIENTE_PSE = Target.the("Tipo cliente PSE")
            .located(By.id("pseTipoCliente"));

    public static final Target INPUT_CORREO_PSE = Target.the("Correo pagador")
            .located(By.id("pseCorreo"));

    public static final Target BTN_CONFIRMAR_PAGO = Target.the("Confirmar pago")
            .located(By.xpath("//button[contains(text(),'Confirmar y registrar pago')]"));

    public static final Target BTN_VER_MI_PLAN = Target.the("Ver mi plan")
            .located(By.xpath("//a[contains(text(),'Ver mi plan')]"));

    public static final Target TITULO_REGISTRAR_PAGO = Target.the("Titulo registrar pago")
            .located(By.xpath("//h3[contains(text(),'Registrar pago')]"));

    public static final Target TITULO_TU_PLAN = Target.the("Titulo tu plan")
            .located(By.xpath("//h1[contains(text(),'Tu plan')]"));

}