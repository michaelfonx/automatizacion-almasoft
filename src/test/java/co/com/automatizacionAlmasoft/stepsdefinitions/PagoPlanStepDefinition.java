package co.com.automatizacionAlmasoft.stepsdefinitions;

import co.com.automatizacionAlmasoft.Models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.Models.PagoPlanData;

import co.com.automatizacionAlmasoft.questions.ValidacionPago;

import co.com.automatizacionAlmasoft.tasks.Autenticarse;
import co.com.automatizacionAlmasoft.tasks.RegistrarPago;
import co.com.automatizacionAlmasoft.tasks.SeleccionarPlan;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagoPlanStepDefinition {


    @Cuando("^registra el pago$")
    public void registraElPago(
            List<PagoPlanData> pagoPlanData) {

        theActorInTheSpotlight().attemptsTo(
                RegistrarPago.pse()
        );

    }

    @Entonces("^muestra el plan adquirido$")
    public void muestraElPlanAdquirido() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionPago.validarPlan()
                )
        );

    }

}