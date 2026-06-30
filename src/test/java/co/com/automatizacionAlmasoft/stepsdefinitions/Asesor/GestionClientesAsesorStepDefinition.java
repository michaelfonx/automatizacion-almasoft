package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionCrearClienteAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloAgregarClienteAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.CrearClienteAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GestionClientesAsesorStepDefinition {

    @Cuando("^abre el formulario para agregar un nuevo Cliente$")
    public void abreElFormularioParaAgregarUnNuevoCliente() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloAgregarClienteAsesor.abrir());
    }

    @Cuando("^ingresa los datos del nuevo Cliente$")
    public void ingresaLosDatosDelNuevoCliente(List<Map<String, String>> datos) {
        Map<String, String> data = datos.get(0);
        theActorInTheSpotlight().attemptsTo(
                CrearClienteAsesor.conDatos(
                        data.get("documento"),
                        data.get("primerNombre"),
                        data.get("primerApellido"),
                        data.get("correo"),
                        data.get("telefono"),
                        data.get("edad"),
                        data.get("fechaNacimiento"),
                        data.get("credencial")
                )
        );
    }

    @Entonces("^se debe verificar que el Cliente se creó exitosamente$")
    public void seDebeVerificarQueElClienteSeCreoExitosamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearClienteAsesor.esVisible()));
    }
}
