package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionPerfilAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloPerfilAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.ActualizarPerfilAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class PerfilAsesorStepDefinition {
    @Cuando("abre el módulo de perfil del asesor")
    public void abreElModuloDePerfilDelAsesor() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloPerfilAsesor.abrir());
    }

    @Entonces("se debe ver la pantalla de perfil")
    public void seDebeVerLaPantallaDePerfil() {
        theActorInTheSpotlight().should(seeThat(ValidacionPerfilAsesor.estaVisible()));
    }

    @Cuando("actualiza su información de perfil")
    public void actualizaSuInformacionDePerfil(List<Map<String, String>> datos) {
        Map<String, String> data = datos.get(0);
        theActorInTheSpotlight().attemptsTo(
                ActualizarPerfilAsesor.conDatos(
                        data.get("primerNombre"),
                        data.get("primerApellido"),
                        data.get("correo"),
                        data.get("documento")
                )
        );
    }
}
