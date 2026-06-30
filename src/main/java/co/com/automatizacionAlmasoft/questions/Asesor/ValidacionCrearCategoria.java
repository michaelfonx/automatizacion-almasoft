package co.com.automatizacionAlmasoft.questions.Asesor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.CategoriasUI.MENSAJE_CATEGORIA_CREADA;

public class ValidacionCrearCategoria implements Question<Boolean> {
    private static final String MENSAJE_ESPERADO =
            "Categoria creada correctamente";

    public static ValidacionCrearCategoria validacionCategoria() {
        return new ValidacionCrearCategoria();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String texto = Text.of(MENSAJE_CATEGORIA_CREADA)
                .viewedBy(actor)
                .asString()
                .trim();

        return MENSAJE_ESPERADO.equalsIgnoreCase(texto);
    }
}
