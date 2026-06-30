package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.ClientesAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AbrirModuloAgregarClienteAsesor implements Task {
    public static AbrirModuloAgregarClienteAsesor abrir() {
        return new AbrirModuloAgregarClienteAsesor();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ClientesAsesorUI.BTN_AGREGAR_CLIENTE));
    }
}
