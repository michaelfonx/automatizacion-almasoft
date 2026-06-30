package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.PlanesAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EditarPlanAsesor implements Task {
    public static EditarPlanAsesor editar() {
        return new EditarPlanAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PlanesAsesorUI.BOTON_EDITAR_PLAN));
    }
}
