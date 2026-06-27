package co.com.automatizacionAlmasoft.questions.Admin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.SubcategoriaUI.MENSAJE_SUBCATEGORIA_ACTUALIZADA;

public class ValidacionEditarSubcategoria implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionEditarSubcategoria.class);

    public static ValidacionEditarSubcategoria validacionEditarSubcategoria() {
        return new ValidacionEditarSubcategoria();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(MENSAJE_SUBCATEGORIA_ACTUALIZADA)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: {}", texto);

            String mensajeEsperado = "Subcategoría actualizada";

            return mensajeEsperado.equalsIgnoreCase(texto);

        } catch (Exception e) {

            logger.error("No se encontró el mensaje: {}", e.getMessage());

            return false;
        }
    }
}