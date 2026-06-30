package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionEditarPlanAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.ActualizarPlanAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.EditarPlanAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarPlanAsesorStepDefinition {
    @Cuando("abre el formulario para editar el primer plan")
    public void abreElFormularioParaEditarElPrimerPlan() {
        theActorInTheSpotlight().attemptsTo(EditarPlanAsesor.editar());
    }

    @Entonces("se debe ver el formulario de editar plan")
    public void seDebeVerElFormularioDeEditarPlan() {
        theActorInTheSpotlight().should(seeThat(ValidacionEditarPlanAsesor.estaVisible()));
    }

    @Cuando("actualiza los datos del plan")
    public void actualizaLosDatosDelPlan(List<Map<String, String>> datos) {
        Map<String, String> data = datos.get(0);
        theActorInTheSpotlight().attemptsTo(
                ActualizarPlanAsesor.conDatos(
                        data.get("nombre"),
                        data.get("precio"),
                        data.get("estado"),
                        data.get("descripcion")
                )
        );
    }
}
