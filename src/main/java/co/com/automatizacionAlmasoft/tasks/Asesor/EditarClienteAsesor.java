package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.ClientesAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EditarClienteAsesor implements Task {
    public static EditarClienteAsesor editar() {
        return new EditarClienteAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ClientesAsesorUI.BOTON_EDITAR_CLIENTE));
    }
}
