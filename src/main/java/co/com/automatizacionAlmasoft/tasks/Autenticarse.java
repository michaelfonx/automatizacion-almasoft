package co.com.automatizacionAlmasoft.tasks;

import co.com.automatizacionAlmasoft.Models.CredencialesInicioSesion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import net.serenitybdd.core.steps.Instrumented;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Autenticacion.*;

public class Autenticarse implements Task {

    private List<CredencialesInicioSesion> credenciales;

    public Autenticarse(List<CredencialesInicioSesion> credenciales) {

        this.credenciales = credenciales;

    }

    public static <CredencialesInicioSesion> Autenticarse aute(List<CredencialesInicioSesion> credenciales) {

        return Instrumented.instanceOf(Autenticarse.class)
                .withProperties(credenciales);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(INPUT_USUARIO),

                Enter.theValue(credenciales.get(0).getCorreo())
                        .into(INPUT_USUARIO),

                Click.on(INPUT_CLAVE),

                Enter.theValue(credenciales.get(0).getContraseña())
                        .into(INPUT_CLAVE),

                Click.on(BTN_INICIOSESION)

        );

    }
}