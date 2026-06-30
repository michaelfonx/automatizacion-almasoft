package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.EditarAfiliadoAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ActualizarAfiliadoAsesor implements Task {
    private final String documento;
    private final String primerNombre;
    private final String primerApellido;
    private final String correo;
    private final String telefono;

    public ActualizarAfiliadoAsesor(String documento, String primerNombre, String primerApellido, String correo, String telefono) {
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correo = correo;
        this.telefono = telefono;
    }

    public static ActualizarAfiliadoAsesor conDatos(String documento, String primerNombre, String primerApellido, String correo, String telefono) {
        return new ActualizarAfiliadoAsesor(documento, primerNombre, primerApellido, correo, telefono);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(documento).into(EditarAfiliadoAsesorUI.INPUT_DOCUMENTO_AFILIADO),
                Enter.theValue(primerNombre).into(EditarAfiliadoAsesorUI.INPUT_PRIMER_NOMBRE_AFILIADO),
                Enter.theValue(primerApellido).into(EditarAfiliadoAsesorUI.INPUT_PRIMER_APELLIDO_AFILIADO),
                Enter.theValue(correo).into(EditarAfiliadoAsesorUI.INPUT_CORREO_AFILIADO),
                Enter.theValue(telefono).into(EditarAfiliadoAsesorUI.INPUT_TELEFONO_AFILIADO),
                Click.on(EditarAfiliadoAsesorUI.BOTON_GUARDAR_CAMBIOS)
        );
    }
}
