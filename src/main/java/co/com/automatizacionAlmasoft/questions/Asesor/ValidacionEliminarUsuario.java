package co.com.automatizacionAlmasoft.questions.Asesor;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

public class ValidacionEliminarUsuario implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        Alert alerta = BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .alert();

        return alerta.getText().equals("Usuario eliminado correctamente");
    }

    public static ValidacionEliminarUsuario validacionEliminarUsuario() {
        return new ValidacionEliminarUsuario();
    }
}