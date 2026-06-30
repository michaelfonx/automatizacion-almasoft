package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.AfiliadosAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionAfiliadosAsesor implements Question<Boolean> {
    public static ValidacionAfiliadosAsesor estaVisible() {
        return new ValidacionAfiliadosAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return AfiliadosAsesorUI.TITULO_AFILIADOS.resolveFor(actor).isVisible();
    }
}
