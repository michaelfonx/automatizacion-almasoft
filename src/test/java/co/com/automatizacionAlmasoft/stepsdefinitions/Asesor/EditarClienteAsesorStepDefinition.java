package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionEditarClienteAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.ActualizarClienteAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.EditarClienteAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarClienteAsesorStepDefinition {
    @Cuando("abre el formulario para editar el primer cliente")
    public void abreElFormularioParaEditarElPrimerCliente() {
        theActorInTheSpotlight().attemptsTo(EditarClienteAsesor.editar());
    }

    @Entonces("se debe ver el formulario de editar cliente")
    public void seDebeVerElFormularioDeEditarCliente() {
        theActorInTheSpotlight().should(seeThat(ValidacionEditarClienteAsesor.estaVisible()));
    }

    @Cuando("actualiza los datos del cliente")
    public void actualizaLosDatosDelCliente(List<Map<String, String>> datos) {
        Map<String, String> data = datos.get(0);
        theActorInTheSpotlight().attemptsTo(
                ActualizarClienteAsesor.conDatos(
                        data.get("documento"),
                        data.get("primerNombre"),
                        data.get("primerApellido"),
                        data.get("correo"),
                        data.get("telefono"),
                        data.get("edad"),
                        data.get("fechaNacimiento")
                )
        );
    }
}
