package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.PerfilAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ActualizarPerfilAsesor implements Task {
    private final String primerNombre;
    private final String primerApellido;
    private final String correo;
    private final String documento;

    public ActualizarPerfilAsesor(String primerNombre, String primerApellido, String correo, String documento) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correo = correo;
        this.documento = documento;
    }

    public static ActualizarPerfilAsesor conDatos(String primerNombre, String primerApellido, String correo, String documento) {
        return new ActualizarPerfilAsesor(primerNombre, primerApellido, correo, documento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(primerNombre).into(PerfilAsesorUI.INPUT_PRIMER_NOMBRE_USUARIO),
                Enter.theValue(primerApellido).into(PerfilAsesorUI.INPUT_PRIMER_APELLIDO_USUARIO),
                Enter.theValue(correo).into(PerfilAsesorUI.INPUT_CORREO_USUARIO),
                Enter.theValue(documento).into(PerfilAsesorUI.INPUT_DOCUMENTO_USUARIO),
                Click.on(PerfilAsesorUI.BOTON_ACTUALIZAR_INFORMACION)
        );
    }
}
