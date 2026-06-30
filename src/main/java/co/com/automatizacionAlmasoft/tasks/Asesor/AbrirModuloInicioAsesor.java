package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.SidebarAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class AbrirModuloInicioAsesor implements Task {
    public static AbrirModuloInicioAsesor abrir() {
        return new AbrirModuloInicioAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SidebarAsesorUI.BTN_INICIO));
    }
}
