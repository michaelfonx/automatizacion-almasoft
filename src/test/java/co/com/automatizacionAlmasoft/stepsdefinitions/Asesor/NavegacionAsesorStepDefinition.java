package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionAfiliadosAsesor;
import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionClientesAsesor;
import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionPlanesAsesor;
import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionProductosAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloAfiliadosAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloClientesAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloPlanesAsesor;
import co.com.automatizacionAlmasoft.tasks.Asesor.AbrirModuloProductosAsesor;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NavegacionAsesorStepDefinition {

    @Cuando("^ingrese al módulo de Clientes$")
    public void ingreseAlModuloDeClientes() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloClientesAsesor.abrir());
    }

    @Entonces("^se debe verificar que se encuentra en la sección de Clientes$")
    public void seDebeVerificarQueSeEncuentraEnLaSeccionDeClientes() {
        theActorInTheSpotlight().should(seeThat(ValidacionClientesAsesor.estaVisible()));
    }

    @Cuando("^ingrese al módulo de Planes$")
    public void ingreseAlModuloDePlanes() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloPlanesAsesor.abrir());
    }

    @Entonces("^se debe verificar que se encuentra en la sección de Planes$")
    public void seDebeVerificarQueSeEncuentraEnLaSeccionDePlanes() {
        theActorInTheSpotlight().should(seeThat(ValidacionPlanesAsesor.estaVisible()));
    }

    @Cuando("^ingrese al módulo de Afiliados$")
    public void ingreseAlModuloDeAfiliados() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloAfiliadosAsesor.abrir());
    }

    @Entonces("^se debe verificar que se encuentra en la sección de Afiliados$")
    public void seDebeVerificarQueSeEncuentraEnLaSeccionDeAfiliados() {
        theActorInTheSpotlight().should(seeThat(ValidacionAfiliadosAsesor.estaVisible()));
    }
    
    @Cuando("^ingrese al módulo de Productos$")
    public void ingreseAlModuloDeProductos() {
        theActorInTheSpotlight().attemptsTo(AbrirModuloProductosAsesor.abrir());
    }
    
    @Entonces("^se debe verificar que se encuentra en la sección de Productos$")
    public void seDebeVerificarQueSeEncuentraEnLaSeccionDeProductos() {
        theActorInTheSpotlight().should(seeThat(ValidacionProductosAsesor.estaVisible()));
    }
}
