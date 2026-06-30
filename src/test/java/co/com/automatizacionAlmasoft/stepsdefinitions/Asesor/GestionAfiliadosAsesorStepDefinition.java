package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionCrearAfiliadoAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloRegistrarAfiliadoAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.CrearAfiliadoAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class GestionAfiliadosAsesorStepDefinition {

    @Cuando("^abre el formulario para registrar un nuevo Afiliado$")
    public void abreElFormularioParaRegistrarUnNuevoAfiliado() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloRegistrarAfiliadoAsesor.abrir());
    }

    @Cuando("^ingresa los datos del nuevo Afiliado$")
    public void ingresaLosDatosDelNuevoAfiliado(List<Map<String, String>> datos) {
        Map<String, String> data = datos.get(0);
        theActorInTheSpotlight().attemptsTo(
                CrearAfiliadoAsesor.conDatos(
                        data.get("clienteId"),
                        data.get("documento"),
                        data.get("primerNombre"),
                        data.get("primerApellido"),
                        data.get("telefono"),
                        data.get("correo")
                )
        );
    }

    @Entonces("^se debe verificar que el Afiliado se registró exitosamente$")
    public void seDebeVerificarQueElAfiliadoSeRegistroExitosamente() {
        theActorInTheSpotlight().should(seeThat(ValidacionCrearAfiliadoAsesor.esVisible()));
    }
}
