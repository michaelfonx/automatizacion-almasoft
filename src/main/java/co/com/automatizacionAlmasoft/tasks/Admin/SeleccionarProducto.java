package co.com.automatizacionAlmasoft.tasks.Admin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.ProductosUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SeleccionarProducto implements Task {

    private final String producto;

    public SeleccionarProducto(String producto) {
        this.producto = producto;
    }

    public static SeleccionarProducto seleccionar(String producto) {
        return instrumented(SeleccionarProducto.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                WaitUntil.the(INPUT_BUSCAR, isVisible())
                        .forNoMoreThan(10)
                        .seconds(),

                Enter.theValue(producto)
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