package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.models.DatosActualizarSubcategoria;
import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionEditarSubcategoria;
import co.com.automatizacionAlmasoft.tasks.Asesor.EditarSubcategoria;
import co.com.automatizacionAlmasoft.tasks.Asesor.SeleccionarSubcategoria;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarSubcategoriaStepDefinitions {

    @Cuando("^seleccione la subcategoría a actualizar$")
    public void seleccioneLaSubcategoriaAActualizar() {

        theActorInTheSpotlight().attemptsTo(
                SeleccionarSubcategoria.seleccionar()
        );
    }

    @Cuando("^actualice los datos de la subcategoría$")
    public void actualiceLosDatosDeLaSubcategoria(DataTable dataTable) {

        List<DatosActualizarSubcategoria> datos =
                dataTable.asList(DatosActualizarSubcategoria.class);

        theActorInTheSpotlight().attemptsTo(
                EditarSubcategoria.conDatos(datos)
        );
    }

    @Entonces("^el sistema deberá mostrar el mensaje de subcategoría actualizada \"([^\"]*)\"$")
    public void validarActualizacion(String mensaje) {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionEditarSubcategoria.validacionEditarSubcategoria()
                )
        );
    }
}