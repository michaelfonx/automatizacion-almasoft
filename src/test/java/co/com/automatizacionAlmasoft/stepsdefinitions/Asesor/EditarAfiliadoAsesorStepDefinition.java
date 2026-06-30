package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionEditarAfiliadoAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.ActualizarAfiliadoAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.EditarAfiliadoAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarAfiliadoAsesorStepDefinition {
    @Cuando("abre el formulario para editar el primer afiliado")
    public void abreElFormularioParaEditarElPrimerAfiliado() {
        theActorInTheSpotlight().attemptsTo(EditarAfiliadoAsesor.editar());
    }

    @Entonces("se debe ver el formulario de editar afiliado")
    public void seDebeVerElFormularioDeEditarAfiliado() {
        theActorInTheSpotlight().should(seeThat(ValidacionEditarAfiliadoAsesor.estaVisible()));
    }

    @Cuando("actualiza los datos del afiliado")
    public void actualizaLosDatosDelAfiliado(List<Map<String, String>> datos) {
        Map<String, String> data = datos.get(0);
        theActorInTheSpotlight().attemptsTo(
                ActualizarAfiliadoAsesor.conDatos(
                        data.get("documento"),
                        data.get("primerNombre"),
                        data.get("primerApellido"),
                        data.get("correo"),
                        data.get("telefono")
                )
        );
    }
}
