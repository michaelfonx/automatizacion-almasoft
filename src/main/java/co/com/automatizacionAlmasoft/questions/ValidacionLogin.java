package co.com.automatizacionAlmasoft.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.TextContent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.automatizacionAlmasoft.userinterfaces.Autenticacion.TEXTO_BIENVENIDA;

public class ValidacionLogin implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionLogin.class);

    private static final String MENSAJE_ESPERADO =
            "Bienvenido";

    public static ValidacionLogin validacionLogin() {

        return new ValidacionLogin();

    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(TEXTO_BIENVENIDA)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return texto.contains(MENSAJE_ESPERADO);

        } catch (Exception e) {

            logger.error("No se encontró el mensaje: "
                    + e.getMessage());

            return false;

        }

    }
}