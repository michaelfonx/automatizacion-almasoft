package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionHomeAsesor;
import co.com.automatizacionAlmasoft.tasks.AbrirPagina;
import co.com.automatizacionAlmasoft.tasks.Asesor.Autenticarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginAsesorStepDefinition {

    @Dado("^que el asesor se encuentra en la pagina de inicio de sesion de AlmaSoft$")
    public void queElAsesorSeEncuentraEnLaPaginaDeInicioDeSesionDeAlmaSoft() {
        theActorInTheSpotlight().wasAbleTo(AbrirPagina.laPagina());
    }

    @Cuando("^ingrese las credenciales correctas de asesor$")
    public void ingreseLasCredencialesCorrectasDeAsesor(List<CredencialesInicioSesion> credenciales) {
        theActorInTheSpotlight().attemptsTo(Autenticarse.aute(credenciales));
    }

    @Entonces("^se debe verificar que el asesor haya sido autenticado correctamente$")
    public void seDebeVerificarQueElAsesorHayaSidoAutenticadoCorrectamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionHomeAsesor.estaVisible()));
    }
}
