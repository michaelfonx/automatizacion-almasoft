package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.SidebarAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloPerfilAsesor implements Task {
    public static AbrirModuloPerfilAsesor abrir() {
        return new AbrirModuloPerfilAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SidebarAsesorUI.BTN_PERFIL));
    }
}
