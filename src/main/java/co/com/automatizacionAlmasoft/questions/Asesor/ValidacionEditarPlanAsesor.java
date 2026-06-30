package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.EditarPlanAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionEditarPlanAsesor implements Question<Boolean> {
    public static ValidacionEditarPlanAsesor estaVisible() {
        return new ValidacionEditarPlanAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return EditarPlanAsesorUI.TITULO_EDITAR_PLAN.resolveFor(actor).isVisible();
    }
}
