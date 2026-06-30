package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionDetallesClienteAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.VerDetallesClienteAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DetallesClienteAsesorStepDefinition {
    @Cuando("abre los detalles del primer cliente")
    public void abreLosDetallesDelPrimerCliente() {
        theActorInTheSpotlight().attemptsTo(VerDetallesClienteAsesor.ver());
    }

    @Entonces("se debe ver los detalles del cliente")
    public void seDebeVerLosDetallesDelCliente() {
        theActorInTheSpotlight().should(seeThat(ValidacionDetallesClienteAsesor.estaVisible()));
    }
}
