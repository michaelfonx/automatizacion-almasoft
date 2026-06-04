package co.com.automatizacionAlmasoft.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.automatizacionAlmasoft.userinterfaces.Registro.MENSAJE_REGISTRO;

public class ValidacionRegistro implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionRegistro.class);

    public static ValidacionRegistro validacionRegistro() {
        return new ValidacionRegistro();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(MENSAJE_REGISTRO)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return texto.equalsIgnoreCase(
                    "Usuario registrado correctamente"
            );

        } catch (Exception e) {

            logger.error(e.getMessage());

            return false;
        }
    }
}