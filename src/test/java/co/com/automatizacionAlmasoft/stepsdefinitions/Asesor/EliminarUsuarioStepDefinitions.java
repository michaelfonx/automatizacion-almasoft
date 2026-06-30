package co.com.automatizacionAlmasoft.stepsdefinitions.Asesor;

import co.com.automatizacionAlmasoft.questions.Asesor.ValidacionEliminarUsuario;
import co.com.automatizacionAlmasoft.tasks.Asesor.EliminarUsuario;
import co.com.automatizacionAlmasoft.tasks.Asesor.SeleccionarUsuarioEliminar;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EliminarUsuarioStepDefinitions {

    @Cuando("^seleccione el usuario a eliminar$")
    public void seleccioneElUsuarioAEliminar() {

        theActorInTheSpotlight().attemptsTo(
                SeleccionarUsuarioEliminar.seleccionar()
        );
    }

    @Entonces("^el usuario deberá eliminarse correctamente$")
    public void elUsuarioDeberaEliminarseCorrectamente() {

        theActorInTheSpotlight().attemptsTo(
                EliminarUsuario.eliminar()
        );

        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionEliminarUsuario.validacionEliminarUsuario()
                )
        );

        Alert mensaje = BrowseTheWeb.as(theActorInTheSpotlight())
                .getDriver()
                .switchTo()
                .alert();

        mensaje.accept();
    }
}