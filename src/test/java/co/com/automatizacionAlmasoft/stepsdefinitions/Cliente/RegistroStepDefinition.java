package co.com.automatizacionAlmasoft.stepsdefinitions.Cliente;

import co.com.automatizacionAlmasoft.models.DatosRegistro;
import co.com.automatizacionAlmasoft.questions.Cliente.ValidacionRegistro;
import co.com.automatizacionAlmasoft.tasks.Cliente.IrARegistro;
import co.com.automatizacionAlmasoft.tasks.Cliente.RegistrarCliente;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinition {

    @Dado("^que el cliente se encuentra en el modulo de registro$")
    public void queElClienteSeEncuentraEnElModuloDeRegistro() {

        theActorInTheSpotlight().wasAbleTo(
                IrARegistro.paginaRegistro()
        );
    }

    @Cuando("^el cliente completa el formulario de registro$")
    public void elClienteCompletaElFormularioDeRegistro(
            List<DatosRegistro> datosRegistro) {

        theActorInTheSpotlight()
                .attemptsTo(
                        RegistrarCliente.registrar(datosRegistro)
                );
    }

    @Entonces("^el sistema guarda el cliente en la base de datos$")
    public void elSistemaGuardaElClienteEnLaBaseDeDatos() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionRegistro.validacionRegistro()
                )
        );
    }

    @Entonces("^muestra el mensaje de registro \"([^\"]*)\"$")
    public void muestraElMensaje(String mensaje) {

    }
}