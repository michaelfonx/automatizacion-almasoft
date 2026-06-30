package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.PerfilAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPerfilAsesor implements Question<Boolean> {
    public static ValidacionPerfilAsesor estaVisible() {
        return new ValidacionPerfilAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return PerfilAsesorUI.TITULO_PERFIL.resolveFor(actor).isVisible();
    }
}
