package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.HomeAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionHomeAsesor implements Question<Boolean> {
    public static ValidacionHomeAsesor estaVisible() {
        return new ValidacionHomeAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HomeAsesorUI.TITULO_BIENVENIDA.resolveFor(actor).isVisible();
    }
}
