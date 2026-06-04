package co.com.automatizacionAlmasoft.tasks;

import co.com.automatizacionAlmasoft.Models.DatosRegistro;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Registro.*;

public class RegistrarCliente implements Task {

    private List<DatosRegistro> datos;

    public RegistrarCliente(List<DatosRegistro> datos) {
        this.datos = datos;
    }

    public static RegistrarCliente registrar(List<DatosRegistro> datos) {

        return Instrumented.instanceOf(RegistrarCliente.class)
                .withProperties(datos);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                Click.on(INPUT_DOCUMENTO),
                Enter.theValue(datos.get(0).getDocumento())
                        .into(INPUT_DOCUMENTO),

                Click.on(INPUT_PRIMER_NOMBRE),
                Enter.theValue(datos.get(0).getPrimerNombre())
                        .into(INPUT_PRIMER_NOMBRE),

                Click.on(INPUT_SEGUNDO_NOMBRE),
                Enter.theValue(datos.get(0).getSegundoNombre())
                        .into(INPUT_SEGUNDO_NOMBRE),

                Click.on(INPUT_PRIMER_APELLIDO),
                Enter.theValue(datos.get(0).getPrimerApellido())
                        .into(INPUT_PRIMER_APELLIDO),

                Click.on(INPUT_SEGUNDO_APELLIDO),
                Enter.theValue(datos.get(0).getSegundoApellido())
                        .into(INPUT_SEGUNDO_APELLIDO),

                Click.on(INPUT_DIRECCION),
                Enter.theValue(datos.get(0).getDireccion())
                        .into(INPUT_DIRECCION),

                Click.on(INPUT_TELEFONO),
                Enter.theValue(datos.get(0).getTelefono())
                        .into(INPUT_TELEFONO),

                Click.on(INPUT_CORREO),
                Enter.theValue(datos.get(0).getCorreo())
                        .into(INPUT_CORREO),

                Click.on(INPUT_CONTRASENA),
                Enter.theValue(datos.get(0).getContrasena())
                        .into(INPUT_CONTRASENA),

                Click.on(INPUT_FECHA_NACIMIENTO),
                Enter.theValue(datos.get(0).getFechaNacimiento())
                        .into(INPUT_FECHA_NACIMIENTO),

                Click.on(BTN_GUARDAR)

        );
    }
}