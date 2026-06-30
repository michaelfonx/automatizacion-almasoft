package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.EditarClienteAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionEditarClienteAsesor implements Question<Boolean> {
    public static ValidacionEditarClienteAsesor estaVisible() {
        return new ValidacionEditarClienteAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return EditarClienteAsesorUI.TITULO_EDITAR.resolveFor(actor).isVisible();
    }
}
