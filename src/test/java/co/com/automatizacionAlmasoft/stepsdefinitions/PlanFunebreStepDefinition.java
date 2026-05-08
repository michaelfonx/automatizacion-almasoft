package co.com.automatizacionAlmasoft.stepsdefinitions;

import co.com.automatizacionAlmasoft.tasks.AbrirPagina;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PlanFunebreStepDefinition {

    @Dado("^que el cliente ha iniciado sesion para adquirir un plan$")
    public void queElClienteHaIniciadoSesionParaAdquirirUnPlan() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );

    }
    @Cuando("^el cliente selecciona un plan funerario$")
    public void elClienteSeleccionaUnPlanFunerario() {

    }

    @Entonces("^el sistema registra el plan en la base de datos$")
    public void elSistemaRegistraElPlanEnLaBaseDeDatos() {

    }

    @Entonces("^muestra el mensaje de plan \"([^\"]*)\"$")
    public void muestraElMensaje(String mensaje) {

    }
}