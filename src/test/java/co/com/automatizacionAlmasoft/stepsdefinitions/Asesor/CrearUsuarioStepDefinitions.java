package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.models.DatosUsuario;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloUsuarios;
import co.com.automatizacionAlmasoft.tasks.Asesor.CrearUsuario;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearUsuarioStepDefinitions {

    @Cuando("^ingrese al módulo de usuarios$")
    public void ingreseAlModuloDeUsuarios() {

        theActorInTheSpotlight().attemptsTo(
                AbrirModuloUsuarios.ingresar()
        );
    }

    @Cuando("^diligencie el formulario con los datos válidos del usuario$")
    public void diligencieElFormularioConLosDatosValidosDelUsuario(DataTable dataTable) {

        List<DatosUsuario> datosUsuario =
                dataTable.asList(DatosUsuario.class);

        theActorInTheSpotlight().attemptsTo(
                CrearUsuario.conDatos(datosUsuario)
        );
    }

    @Entonces("^el sistema deberá mostrar el mensaje \"([^\"]*)\"$")
    public void elSistemaDeberaMostrarElMensaje(String mensaje) {

    }
}