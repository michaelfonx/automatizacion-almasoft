package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.AfiliadosAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloRegistrarAfiliadoAsesor implements Task {
    public static AbrirModuloRegistrarAfiliadoAsesor abrir() {
        return new AbrirModuloRegistrarAfiliadoAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(AfiliadosAsesorUI.BTN_REGISTRAR_AFILIADO));
    }
}
