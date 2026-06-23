package co.com.automatizacionAlmasoft.tasks.Cliente;

import co.com.automatizacionAlmasoft.userinterfaces.Cliente.Inicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.automatizacionAlmasoft.userinterfaces.Cliente.Registro.BTN_IR_REGISTRO;

public class IrARegistro implements Task {

    Inicio inicio;

    public static IrARegistro paginaRegistro() {

        return Tasks.instrumented(IrARegistro.class);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Open.browserOn(inicio),

                Click.on(BTN_IR_REGISTRO)

        );

    }
}