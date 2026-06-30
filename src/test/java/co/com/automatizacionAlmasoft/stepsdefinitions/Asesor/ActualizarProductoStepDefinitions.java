package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;


import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloProductos;
import co.com.automatizacionAlmasoft.models.DatosActualizarProducto;
import co.com.automatizacionAlmasoft.tasks.Asesor.ActualizarProducto;
import co.com.automatizacionAlmasoft.tasks.Asesor.SeleccionarProducto;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ActualizarProductoStepDefinitions {


    @Cuando("^seleccione el producto \"([^\"]*)\"$")
    public void seleccioneElProducto(String producto) {

        theActorInTheSpotlight().attemptsTo(
                SeleccionarProducto.seleccionar(producto)
        );
    }

        @Cuando("^actualice los datos del producto$")
        public void actualiceLosDatosDelProducto(DataTable dataTable) {

            List<DatosActualizarProducto> datosProducto =
                    dataTable.asList(DatosActualizarProducto.class);

            theActorInTheSpotlight().attemptsTo(
                    ActualizarProducto.conDatos(datosProducto)
            );
        }
    }
