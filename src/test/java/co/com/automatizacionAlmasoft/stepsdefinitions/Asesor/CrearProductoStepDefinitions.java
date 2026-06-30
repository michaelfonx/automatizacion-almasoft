package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.models.DatosProducto;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloProductos;
import co.com.automatizacionAlmasoft.tasks.Asesor.CrearProducto;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearProductoStepDefinitions {

    @Cuando("^ingrese al módulo de productos$")
    public void ingreseAlModuloDeProductos() {
        theActorInTheSpotlight().attemptsTo(
                AbrirModuloProductos.ingresar()
        );
    }

    @Cuando("diligencie el formulario con los datos válidos del producto")
    public void diligencieElFormularioConLosDatosValidosDelProducto(DataTable dataTable) {

        List<DatosProducto> datosProducto =
                dataTable.asList(DatosProducto.class);

        theActorInTheSpotlight().attemptsTo(
                CrearProducto.conDatos(datosProducto)
        );
    }

    @Entonces("el sistema debe mostrar el mensaje \"([^\"]*)\"$")
    public void elSistemaDebeMostrarElMensaje(String mensaje) {
    }
}
