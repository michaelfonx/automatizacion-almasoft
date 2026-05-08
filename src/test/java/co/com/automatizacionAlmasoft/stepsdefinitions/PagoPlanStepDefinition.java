package co.com.automatizacionAlmasoft.stepsdefinitions;

import co.com.automatizacionAlmasoft.tasks.AbrirPagina;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PagoPlanStepDefinition {

    @Dado("^que el cliente ha iniciado sesion correctamente$")
    public void queElClienteHaIniciadoSesionCorrectamente() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^el cliente realiza el pago del plan$")
    public void elClienteRealizaElPagoDelPlan() {

    }

    @Entonces("^el sistema registra la transaccion$")
    public void elSistemaRegistraLaTransaccion() {

    }

    @Entonces("^muestra el mensaje de pago \"([^\"]*)\"$")
    public void muestraElMensaje(String mensaje) {

    }
}