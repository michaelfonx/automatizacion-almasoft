package co.com.automatizacionAlmasoft.stepsdefinitions.Cliente;

import co.com.automatizacionAlmasoft.models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.questions.Cliente.ValidacionLogin;
import co.com.automatizacionAlmasoft.tasks.AbrirPagina;
import co.com.automatizacionAlmasoft.tasks.Cliente.Autenticarse;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Dado("^que el cliente se encuentra en la pagina de inicio de sesion$")
    public void queElClienteSeEncuentraEnLaPaginaDeInicioDeSesion() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^el cliente ingresa sus credenciales$")
    public void elClienteIngresaSusCredenciales(
            List<CredencialesInicioSesion> credenciales) {

        theActorInTheSpotlight()
                .attemptsTo(
                        Autenticarse.aute(credenciales)
                );

    }

    @Entonces("^el sistema valida las credenciales$")
    public void elSistemaValidaLasCredenciales() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionLogin.validacionLogin()
                )
        );

    }

    @Entonces("^redirige al panel del cliente$")
    public void redirigeAlPanelDelCliente() {

    }
}