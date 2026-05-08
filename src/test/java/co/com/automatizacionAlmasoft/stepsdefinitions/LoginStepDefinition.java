package co.com.automatizacionAlmasoft.stepsdefinitions;

import co.com.automatizacionAlmasoft.tasks.AbrirPagina;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginStepDefinition {

    @Dado("^que el cliente se encuentra en la pagina de inicio de sesion$")
    public void queElClienteSeEncuentraEnLaPaginaDeInicioDeSesion() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^el cliente ingresa sus credenciales$")
    public void elClienteIngresaSusCredenciales() {

    }

    @Entonces("^el sistema valida las credenciales$")
    public void elSistemaValidaLasCredenciales() {

    }

    @Entonces("^redirige al panel del cliente$")
    public void redirigeAlPanelDelCliente() {

    }
}