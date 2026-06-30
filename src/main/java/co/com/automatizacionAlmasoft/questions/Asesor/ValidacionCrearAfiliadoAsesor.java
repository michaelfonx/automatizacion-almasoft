package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.RegistrarAfiliadoAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionCrearAfiliadoAsesor implements Question<Boolean> {
    public static ValidacionCrearAfiliadoAsesor esVisible() {
        return new ValidacionCrearAfiliadoAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return RegistrarAfiliadoAsesorUI.ALERTA_AFILIADO_REGISTRADO.resolveFor(actor).isVisible();
    }
}
