package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.AfiliadosAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EditarAfiliadoAsesor implements Task {
    public static EditarAfiliadoAsesor editar() {
        return new EditarAfiliadoAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AfiliadosAsesorUI.BOTON_ACTUALIZAR_AFILIADO));
    }
}
