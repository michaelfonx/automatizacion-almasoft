package co.com.automatizacionAlmasoft.tasks.Asesor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.SubcategoriaUI.BTN_SUBCATEGORIAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AbrirModuloSubcategorias implements Task {

    public static AbrirModuloSubcategorias abrir() {
        return instrumented(AbrirModuloSubcategorias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(BTN_SUBCATEGORIAS, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Click.on(BTN_SUBCATEGORIAS)

        );
    }
}