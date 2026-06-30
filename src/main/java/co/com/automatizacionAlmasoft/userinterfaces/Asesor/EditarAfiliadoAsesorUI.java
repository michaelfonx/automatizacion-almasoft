package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditarAfiliadoAsesorUI extends PageObject {
    public static final Target TITULO_EDITAR_AFILIADO = Target.the("Título editar afiliado")
            .located(By.xpath("//h1[text()='Editar Afiliado']"));
    public static final Target INPUT_DOCUMENTO_AFILIADO = Target.the("Input documento del afiliado")
            .located(By.name("documento"));
    public static final Target INPUT_PRIMER_NOMBRE_AFILIADO = Target.the("Input primer nombre del afiliado")
            .located(By.name("primer_nombre"));
    public static final Target INPUT_SEGUNDO_NOMBRE_AFILIADO = Target.the("Input segundo nombre del afiliado")
            .located(By.name("segundo_nombre"));
    public static final Target INPUT_PRIMER_APELLIDO_AFILIADO = Target.the("Input primer apellido del afiliado")
            .located(By.name("primer_apellido"));
    public static final Target INPUT_SEGUNDO_APELLIDO_AFILIADO = Target.the("Input segundo apellido del afiliado")
            .located(By.name("segundo_apellido"));
    public static final Target INPUT_CORREO_AFILIADO = Target.the("Input correo del afiliado")
            .located(By.name("correo"));
    public static final Target INPUT_DIRECCION_AFILIADO = Target.the("Input direccion del afiliado")
            .located(By.name("direccion"));
    public static final Target INPUT_TELEFONO_AFILIADO = Target.the("Input telefono del afiliado")
            .located(By.name("telefono"));
    public static final Target BOTON_GUARDAR_CAMBIOS = Target.the("Botón guardar cambios del afiliado")
            .located(By.xpath("//button[@type='submit' and contains(text(),'Guardar Cambios')]"));
    public static final Target ALERTA_AFILIADO_ACTUALIZADO = Target.the("Alerta afiliado actualizado")
            .located(By.xpath("//*[contains(text(),'Información del afiliado actualizada')]"));
    public static final Target BOTON_CANCELAR_AFILIADO = Target.the("Botón cancelar editar afiliado")
            .located(By.xpath("//button[contains(text(),'Cancelar')]"));
}
