package co.com.automatizacionAlmasoft.tasks.Admin;

import co.com.automatizacionAlmasoft.utils.DatosDinamicos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.SubcategoriaUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarSubcategoria implements Task {

    public static SeleccionarSubcategoria seleccionar() {
        return instrumented(SeleccionarSubcategoria.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(INPUT_BUSCAR, isEnabled())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(INPUT_BUSCAR),

                Enter.theValue(DatosDinamicos.nombreSubcategoria)
                        .into(INPUT_BUSCAR),

                Click.on(BTN_ACCIONES),

                WaitUntil.the(BTN_EDITAR, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_EDITAR)

        );
    }
}