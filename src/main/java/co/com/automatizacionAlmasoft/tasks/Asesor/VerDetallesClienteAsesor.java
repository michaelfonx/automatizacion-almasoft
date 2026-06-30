package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.ClientesAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class VerDetallesClienteAsesor implements Task {
    public static VerDetallesClienteAsesor ver() {
        return new VerDetallesClienteAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ClientesAsesorUI.BOTON_DETALLES_CLIENTE));
    }
}
