package co.com.automatizacionAlmasoft.tasks.Admin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EliminarUsuario implements Task {

    public static EliminarUsuario eliminar() {
        return instrumented(EliminarUsuario.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        Alert confirmacion = BrowseTheWeb.as(actor)
                .getDriver()
                .switchTo()
                .alert();

        confirmacion.accept();
    }
}