package co.com.automatizacionAlmasoft.tasks.Asesor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;

import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.UsuarioUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarUsuarioEliminar implements Task {

    public static SeleccionarUsuarioEliminar seleccionar() {
        return instrumented(SeleccionarUsuarioEliminar.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(BTN_PRIMER_ACCIONES, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_PRIMER_ACCIONES),

                WaitUntil.the(BTN_ELIMINAR, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_ELIMINAR)

        );

    }
}