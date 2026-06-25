package co.com.automatizacionAlmasoft.questions.Admin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.ProductosUI.MENSAJE_PRODUCTO_CREADO;

public class ValidacionCrearProducto implements Question<Boolean> {
    private static final String MENSAJE_ESPERADO =
            "Producto creado correctamente";

    public static ValidacionCrearProducto validacionProducto() {
        return new ValidacionCrearProducto();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String texto = Text.of(MENSAJE_PRODUCTO_CREADO)
                .viewedBy(actor)
                .asString()
                .trim();

        return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
    }
}
