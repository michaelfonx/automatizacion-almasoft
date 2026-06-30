package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.SidebarAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloClientesAsesor implements Task {
    public static AbrirModuloClientesAsesor abrir() {
        return new AbrirModuloClientesAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SidebarAsesorUI.BTN_CLIENTES));
    }
}
