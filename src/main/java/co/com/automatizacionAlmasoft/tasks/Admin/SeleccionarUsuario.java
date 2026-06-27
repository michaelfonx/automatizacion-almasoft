package co.com.automatizacionAlmasoft.tasks.Admin;

import co.com.automatizacionAlmasoft.utils.DatosDinamicos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.UsuarioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarUsuario implements Task {

    public static SeleccionarUsuario seleccionar() {
        return instrumented(SeleccionarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(INPUT_BUSCAR, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Enter.theValue(DatosDinamicos.documento)
                        .into(INPUT_BUSCAR),

                WaitUntil.the(BTN_ACCIONES, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_ACCIONES),

                WaitUntil.the(BTN_EDITAR, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_EDITAR)

        );
    }
}