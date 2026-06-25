package co.com.automatizacionAlmasoft.tasks.Admin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static co.com.automatizacionAlmasoft.userinterfaces.Admin.UsuarioUI.BTN_USUARIOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirModuloUsuarios implements Task {

    public static AbrirModuloUsuarios ingresar() {
        return instrumented(AbrirModuloUsuarios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_USUARIOS)
        );
    }
}
