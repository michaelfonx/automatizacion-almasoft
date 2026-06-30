package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditarPlanAsesorUI extends PageObject {
    public static final Target TITULO_EDITAR_PLAN = Target.the("Título editar plan fúnebre")
            .located(By.xpath("//h1[text()='Editar Plan Fúnebre']"));
    public static final Target INPUT_NOMBRE_PLAN = Target.the("Input nombre del plan")
            .located(By.name("plan_nombre"));
    public static final Target INPUT_PRECIO_PLAN = Target.the("Input precio del plan")
            .located(By.name("plan_precio"));
    public static final Target SELECT_ESTADO_PLAN = Target.the("Select estado del plan")
            .located(By.name("plan_estado"));
    public static final Target TEXTAREA_DESCRIPCION_PLAN = Target.the("Textarea descripción del plan")
            .located(By.name("plan_descripcion"));
    public static final Target BOTON_ACTUALIZAR_PLAN = Target.the("Botón actualizar plan")
            .located(By.xpath("//button[@type='submit' and contains(text(),'Actualizar Plan')]"));
    public static final Target ALERTA_PLAN_ACTUALIZADO = Target.the("Alerta plan actualizado")
            .located(By.xpath("//*[contains(text(),'Plan actualizado correctamente')]"));
    public static final Target BOTON_CANCELAR_PLAN = Target.the("Botón cancelar editar plan")
            .located(By.xpath("//button[contains(text(),'Cancelar')]"));
}
