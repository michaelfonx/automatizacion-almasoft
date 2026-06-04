package co.com.automatizacionAlmasoft.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static co.com.automatizacionAlmasoft.userinterfaces.PlanFunebre.TITULO_REGISTRAR_PAGO;

public class ValidacionPlan implements Question<Boolean> {

    private static final Logger logger =
            LoggerFactory.getLogger(ValidacionPlan.class);

    public static ValidacionPlan formularioPagoVisible() {
        return new ValidacionPlan();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        try {

            String texto = TextContent.of(TITULO_REGISTRAR_PAGO)
                    .viewedBy(actor)
                    .asString()
                    .trim();

            logger.info("Texto encontrado: " + texto);

            return texto.equalsIgnoreCase("Registrar pago");

        } catch (Exception e) {

            logger.error(e.getMessage());

            return false;

        }

    }
}