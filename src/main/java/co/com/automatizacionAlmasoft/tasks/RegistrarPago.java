package co.com.automatizacionAlmasoft.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.automatizacionAlmasoft.userinterfaces.PlanFunebre.*;

public class RegistrarPago implements Task {

    public static RegistrarPago pse() {
        return Tasks.instrumented(RegistrarPago.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Scroll.to(SELECT_METODO_PAGO),

                SelectFromOptions.byValue("pse")
                        .from(SELECT_METODO_PAGO),

                SelectFromOptions.byVisibleText("Bancolombia")
                        .from(SELECT_ENTIDAD_PSE),

                SelectFromOptions.byVisibleText("Persona natural")
                        .from(SELECT_TIPO_CLIENTE_PSE),

                Enter.theValue("maicol777@gmail.com")
                        .into(INPUT_CORREO_PSE),

                Click.on(BTN_CONFIRMAR_PAGO),

                Click.on(BTN_VER_MI_PLAN)

        );

    }
}