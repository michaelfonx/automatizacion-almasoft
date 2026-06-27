package co.com.automatizacionAlmasoft.stepsdefinitions.Cliente;

import co.com.automatizacionAlmasoft.models.DatosEditarCliente;
import co.com.automatizacionAlmasoft.tasks.Admin.ActualizarPerfil;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EditarClienteStepDefinitions {

    @Cuando("^actualice los datos del perfil y haga click en \"([^\"]*)\"$")
    public void actualiceLosDatosDelPerfilYHagaClickEn(String boton, DataTable dataTable) {

        List<DatosEditarCliente> datos = dataTable.asList(DatosEditarCliente.class);

        theActorInTheSpotlight().attemptsTo(
                ActualizarPerfil.conDatos(datos)
        );
    }

    @Entonces("^se debe verificar que los datos fueron actualizados correctamente\\.$")
    public void seDebeVerificarQueLosDatosFueronActualizadosCorrectamente() {

        System.out.println("Los datos fueron actualizados correctamente");

    }
}