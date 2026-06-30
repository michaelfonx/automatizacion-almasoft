package co.com.automatizacionAlmasoft.tasks.Asesor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.CategoriasUI.BTN_CATEGORIAS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirModuloCategorias implements Task {

    public static AbrirModuloCategorias ingresar() {
        return instrumented(AbrirModuloCategorias.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CATEGORIAS)
        );
    }
}