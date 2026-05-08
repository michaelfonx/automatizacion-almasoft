package co.com.automatizacionAlmasoft.stepsdefinitions;

import co.com.automatizacionAlmasoft.tasks.AbrirPagina;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition {

    @Dado("^que el cliente se encuentra en el modulo de registro$")
    public void queElClienteSeEncuentraEnElModuloDeRegistro() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^el cliente completa el formulario de registro$")
    public void elClienteCompletaElFormularioDeRegistro() {

    }

    @Entonces("^el sistema guarda el cliente en la base de datos$")
    public void elSistemaGuardaElClienteEnLaBaseDeDatos() {

    }

    @Entonces("^muestra el mensaje de registro \"([^\"]*)\"$")
    public void muestraElMensaje(String mensaje) {

    }
}