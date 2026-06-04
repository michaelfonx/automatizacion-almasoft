package co.com.automatizacionAlmasoft.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.automatizacionAlmasoft.userinterfaces.PlanFunebre.TITULO_TU_PLAN;

public class ValidacionPago implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionPago.class);

    public static ValidacionPago validarPlan() {
        return new ValidacionPago();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(TITULO_TU_PLAN)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return texto.equalsIgnoreCase("Tu plan");

        } catch (Exception e) {

            logger.error(e.getMessage());

            return false;
        }

    }
}