package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.AgregarClienteAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCrearClienteAsesor implements Question<Boolean> {
    public static ValidacionCrearClienteAsesor esVisible() {
        return new ValidacionCrearClienteAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return AgregarClienteAsesorUI.ALERTA_CLIENTE_CREADO.resolveFor(actor).isVisible();
    }
}
