package co.com.automatizacionAlmasoft.stepsdefinitions.Administrador;

import co.com.automatizacionAlmasoft.models.DatosActualizarUsuario;
import co.com.automatizacionAlmasoft.tasks.Admin.EditarUsuario;
import co.com.automatizacionAlmasoft.tasks.Admin.SeleccionarUsuario;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarUsuarioStepDefinitions {

    @Cuando("^seleccione el usuario$")
    public void seleccioneElUsuario() {

        theActorInTheSpotlight().attemptsTo(
                SeleccionarUsuario.seleccionar()
        );
    }

    @Cuando("^actualice los datos del usuario$")
    public void actualiceLosDatosDelUsuario(DataTable dataTable) {

        List<DatosActualizarUsuario> datos =
                dataTable.asList(DatosActualizarUsuario.class);

        theActorInTheSpotlight().attemptsTo(
                EditarUsuario.conDatos(datos)
        );
    }
}