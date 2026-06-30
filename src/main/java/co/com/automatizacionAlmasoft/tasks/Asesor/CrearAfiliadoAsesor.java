package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.RegistrarAfiliadoAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class CrearAfiliadoAsesor implements Task {
    private final String clienteId;
    private final String documento;
    private final String primerNombre;
    private final String primerApellido;
    private final String telefono;
    private final String correo;

    public CrearAfiliadoAsesor(String clienteId, String documento, String primerNombre, String primerApellido, String telefono, String correo) {
        this.clienteId = clienteId;
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.telefono = telefono;
        this.correo = correo;
    }

    public static CrearAfiliadoAsesor conDatos(String clienteId, String documento, String primerNombre, String primerApellido, String telefono, String correo) {
        return new CrearAfiliadoAsesor(clienteId, documento, primerNombre, primerApellido, telefono, correo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectFromOptions.byValue(clienteId).from(RegistrarAfiliadoAsesorUI.SELECT_CLIENTE_TITULAR),
                Enter.theValue(documento).into(RegistrarAfiliadoAsesorUI.INPUT_DOCUMENTO_AFILIADO),
                Enter.theValue(primerNombre).into(RegistrarAfiliadoAsesorUI.INPUT_PRIMER_NOMBRE_AFILIADO),
                Enter.theValue(primerApellido).into(RegistrarAfiliadoAsesorUI.INPUT_PRIMER_APELLIDO_AFILIADO),
                Enter.theValue(telefono).into(RegistrarAfiliadoAsesorUI.INPUT_TELEFONO_AFILIADO),
                Enter.theValue(correo).into(RegistrarAfiliadoAsesorUI.INPUT_CORREO_AFILIADO),
                Click.on(RegistrarAfiliadoAsesorUI.BTN_REGISTRAR_VINCULAR)
        );
    }
}
