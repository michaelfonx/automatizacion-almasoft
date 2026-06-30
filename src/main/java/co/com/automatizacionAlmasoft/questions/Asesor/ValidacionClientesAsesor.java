package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.ClientesAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionClientesAsesor implements Question<Boolean> {
    public static ValidacionClientesAsesor estaVisible() {
        return new ValidacionClientesAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ClientesAsesorUI.TITULO_CLIENTES.resolveFor(actor).isVisible();
    }
}
