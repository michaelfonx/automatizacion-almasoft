package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.SidebarAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloProductosAsesor implements Task {
    public static AbrirModuloProductosAsesor abrir() {
        return new AbrirModuloProductosAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SidebarAsesorUI.BTN_PRODUCTOS));
    }
}
