package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.PlanesAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPlanesAsesor implements Question<Boolean> {
    public static ValidacionPlanesAsesor estaVisible() {
        return new ValidacionPlanesAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PlanesAsesorUI.TITULO_PLANES.resolveFor(actor).isVisible();
    }
}
