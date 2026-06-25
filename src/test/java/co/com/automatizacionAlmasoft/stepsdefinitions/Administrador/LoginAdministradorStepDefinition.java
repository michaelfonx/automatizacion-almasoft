package co.com.automatizacionAlmasoft.stepsdefinitions.Administrador;

import co.com.automatizacionAlmasoft.models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.questions.Admin.ValidacionLoginAdmin;
import co.com.automatizacionAlmasoft.tasks.AbrirPagina;
import co.com.automatizacionAlmasoft.tasks.Admin.Autenticarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginAdministradorStepDefinition {

    @Dado("^que el usuario se encuentra en la pagina de inicio de sesion de AlmaSoft$")
    public void queElUsuarioSeEncuentraEnLaPaginaDeInicioDeSesionDeAlmaSoft() {

        theActorInTheSpotlight().wasAbleTo(
                AbrirPagina.laPagina()
        );
    }

    @Cuando("^ingrese las credenciales correctas \\(Correo electronico y contraseña\\)$")
    public void ingreseLasCredencialesCorrectas(
            List<CredencialesInicioSesion> credenciales) {

        theActorInTheSpotlight().attemptsTo(
                Autenticarse.aute(credenciales)
        );
    }

    @Entonces("^se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina\\.$")
    public void seDebeVerificarQueElUsuarioHayaSidoAutenticadoCorrectamenteYRedirigidoASuPagina() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionLoginAdmin.validacionLogin()
                )
        );
    }
}