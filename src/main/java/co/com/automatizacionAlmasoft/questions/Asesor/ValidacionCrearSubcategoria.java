package co.com.automatizacionAlmasoft.questions.Asesor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.SubcategoriaUI.MENSAJE_SUBCATEGORIA;

public class ValidacionCrearSubcategoria implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionCrearSubcategoria.class);

    public static ValidacionCrearSubcategoria validar() {
        return new ValidacionCrearSubcategoria();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(MENSAJE_SUBCATEGORIA)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: {}", texto);

            String mensajeEsperado = "Subcategoría creada correctamente";

            return mensajeEsperado.equalsIgnoreCase(texto);

        } catch (Exception e) {

            logger.error("No se encontró el mensaje: {}", e.getMessage());

            return false;
        }
    }
}