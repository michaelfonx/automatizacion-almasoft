package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.EditarAfiliadoAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionEditarAfiliadoAsesor implements Question<Boolean> {
    public static ValidacionEditarAfiliadoAsesor estaVisible() {
        return new ValidacionEditarAfiliadoAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return EditarAfiliadoAsesorUI.TITULO_EDITAR_AFILIADO.resolveFor(actor).isVisible();
    }
}
