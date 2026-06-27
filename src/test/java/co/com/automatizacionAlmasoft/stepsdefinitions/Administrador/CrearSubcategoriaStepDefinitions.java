package co.com.automatizacionAlmasoft.stepsdefinitions.Administrador;

import co.com.automatizacionAlmasoft.models.DatosSubcategoria;
import co.com.automatizacionAlmasoft.questions.Admin.ValidacionCrearSubcategoria;
import co.com.automatizacionAlmasoft.tasks.Admin.AbrirModuloSubcategorias;
import co.com.automatizacionAlmasoft.tasks.Admin.CrearSubcategoria;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearSubcategoriaStepDefinitions {

    @Cuando("^ingrese al módulo de subcategorías$")
    public void ingreseAlModuloDeSubcategorias() {

        theActorInTheSpotlight().attemptsTo(
                AbrirModuloSubcategorias.abrir()
        );
    }

    @Cuando("^diligencie los datos de la subcategoría$")
    public void diligencieLosDatosDeLaSubcategoria(DataTable dataTable) {

        List<DatosSubcategoria> datos =
                dataTable.asList(DatosSubcategoria.class);

        theActorInTheSpotlight().attemptsTo(
                CrearSubcategoria.conDatos(datos)
        );
    }

    @Entonces("^el sistema deberá mostrar el mensaje de subcategoría \"([^\"]*)\"$")
    public void elSistemaDeberaMostrarElMensajeDeSubcategoria(String mensaje) {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionCrearSubcategoria.validar()
                )
        );
    }
}