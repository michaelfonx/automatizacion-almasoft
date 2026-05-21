package co.com.automatizacionAlmasoft.tasks;

import co.com.automatizacionAlmasoft.Models.CredencialesInicioSesion;
import co.com.automatizacionAlmasoft.utils.SesionVariable;

import net.serenitybdd.core.steps.Instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Autenticacion.*;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Autenticarse implements Task {

    private List<CredencialesInicioSesion> credenciales;

    public Autenticarse(List<CredencialesInicioSesion> credenciales) {

        this.credenciales = credenciales;

    }

    public static Autenticarse aute(List<CredencialesInicioSesion> credenciales) {

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

        theActorInTheSpotlight().remember(
                SesionVariable.usuario.toString(),
                credenciales.get(0).getCorreo()
        );

    }
}