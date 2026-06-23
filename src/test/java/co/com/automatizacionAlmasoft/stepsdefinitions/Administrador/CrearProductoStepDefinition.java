/*package co.com.automatizacionAlmasoft.stepsdefinitions;

import co.com.automatizacionAlmasoft.Models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.questions.ValidacionProducto;
import co.com.automatizacionAlmasoft.tasks.Cliente.AbrirPagina;
import co.com.automatizacionAlmasoft.tasks.Cliente.Autenticarse;
import co.com.automatizacionAlmasoft.tasks.CrearProducto;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CrearProductoStepDefinition {

    @Dado("^que el administrador se encuentra en la pagina de inicio de sesion$")
    public void queElAdministradorSeEncuentraEnLaPaginaDeInicioDeSesion() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^el administrador inicia sesion$")
    public void elAdministradorIniciaSesion(
            List<CredencialesInicioSesion> credenciales) {

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.aute(credenciales)
        );
    }

    @Cuando("^crea un nuevo producto funerario$")
    public void creaUnNuevoProductoFunerario() {

        theActorInTheSpotlight().attemptsTo(
                CrearProducto.registrar()
        );
    }

    @Entonces("^se valida la creacion del producto$")
    public void seValidaLaCreacionDelProducto() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionProducto.validacionProducto()
                )
        );
    }
}*/