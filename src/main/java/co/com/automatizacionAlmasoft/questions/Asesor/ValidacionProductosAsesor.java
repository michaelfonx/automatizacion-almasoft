package co.com.automatizacionAlmasoft.questions.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.ProductosAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionProductosAsesor implements Question<Boolean> {
    public static ValidacionProductosAsesor estaVisible() {
        return new ValidacionProductosAsesor();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return ProductosAsesorUI.TITULO_PRODUCTOS.resolveFor(actor).isVisible();
    }
}
