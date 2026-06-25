package co.com.automatizacionAlmasoft.stepsdefinitions.Cliente;

import co.com.automatizacionAlmasoft.models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.questions.Cliente.ValidacionPlan;
import co.com.automatizacionAlmasoft.tasks.AbrirPagina;
import co.com.automatizacionAlmasoft.tasks.Cliente.Autenticarse;
import co.com.automatizacionAlmasoft.tasks.Cliente.SeleccionarPlan;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PlanFunebreStepDefinition {

    @Dado("^que el cliente se encuentra en el modulo de inicio de sesion$")
    public void queElClienteSeEncuentraEnElModuloDeInicioDeSesion() {

        theActorCalled("Usuario").wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^el cliente inicia sesion para adquirir un plan$")
    public void elClienteIniciaSesionParaAdquirirUnPlan(
            List<CredencialesInicioSesion> credenciales) {

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.aute(credenciales)
        );
    }

    @Cuando("^selecciona un plan funerario$")
    public void seleccionaUnPlanFunerario() {

        theActorInTheSpotlight().attemptsTo(
                SeleccionarPlan.basico()
        );
    }

    @Entonces("^se muestra el formulario de pago$")
    public void seMuestraElFormularioDePago() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionPlan.formularioPagoVisible()
                )
        );
    }
}