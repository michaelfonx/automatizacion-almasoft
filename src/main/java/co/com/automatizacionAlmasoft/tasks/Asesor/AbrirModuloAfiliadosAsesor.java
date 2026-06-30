package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.SidebarAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloAfiliadosAsesor implements Task {
    public static AbrirModuloAfiliadosAsesor abrir() {
        return new AbrirModuloAfiliadosAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SidebarAsesorUI.BTN_AFILIADOS));
    }
}
