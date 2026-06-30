package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.DetallesClienteAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionDetallesClienteAsesor implements Question<Boolean> {
    public static ValidacionDetallesClienteAsesor estaVisible() {
        return new ValidacionDetallesClienteAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return DetallesClienteAsesorUI.TITULO_DETALLES.resolveFor(actor).isVisible();
    }
}
