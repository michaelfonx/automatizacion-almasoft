package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.EditarPlanAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class ActualizarPlanAsesor implements Task {
    private final String nombre;
    private final String precio;
    private final String estado;
    private final String descripcion;

    public ActualizarPlanAsesor(String nombre, String precio, String estado, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
        this.descripcion = descripcion;
    }

    public static ActualizarPlanAsesor conDatos(String nombre, String precio, String estado, String descripcion) {
        return new ActualizarPlanAsesor(nombre, precio, estado, descripcion);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(EditarPlanAsesorUI.INPUT_NOMBRE_PLAN),
                Enter.theValue(precio).into(EditarPlanAsesorUI.INPUT_PRECIO_PLAN),
                SelectFromOptions.byValue(estado).from(EditarPlanAsesorUI.SELECT_ESTADO_PLAN),
                Enter.theValue(descripcion).into(EditarPlanAsesorUI.TEXTAREA_DESCRIPCION_PLAN),
                Click.on(EditarPlanAsesorUI.BOTON_ACTUALIZAR_PLAN)
        );
    }
}
