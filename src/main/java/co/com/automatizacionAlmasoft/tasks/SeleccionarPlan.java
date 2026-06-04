package co.com.automatizacionAlmasoft.tasks;

import co.com.automatizacionAlmasoft.userinterfaces.PlanFunebre;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarPlan implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(PlanFunebre.BTN_EXPLORAR_PLANES),

                Click.on(PlanFunebre.BTN_VER_DETALLES),

                Click.on(PlanFunebre.BTN_ADQUIRIR_PLAN)

        );
    }

    public static SeleccionarPlan basico() {
        return Tasks.instrumented(SeleccionarPlan.class);
    }
}