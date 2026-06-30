package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.EditarClienteAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ActualizarClienteAsesor implements Task {
    private final String documento;
    private final String primerNombre;
    private final String primerApellido;
    private final String correo;
    private final String telefono;
    private final String edad;
    private final String fechaNacimiento;

    public ActualizarClienteAsesor(String documento, String primerNombre, String primerApellido,
                                   String correo, String telefono, String edad, String fechaNacimiento) {
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public static ActualizarClienteAsesor conDatos(String documento, String primerNombre, String primerApellido,
                                                  String correo, String telefono, String edad, String fechaNacimiento) {
        return new ActualizarClienteAsesor(documento, primerNombre, primerApellido, correo, telefono, edad, fechaNacimiento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(documento).into(EditarClienteAsesorUI.INPUT_DOCUMENTO),
                Enter.theValue(primerNombre).into(EditarClienteAsesorUI.INPUT_PRIMER_NOMBRE),
                Enter.theValue(primerApellido).into(EditarClienteAsesorUI.INPUT_PRIMER_APELLIDO),
                Enter.theValue(correo).into(EditarClienteAsesorUI.INPUT_CORREO),
                Enter.theValue(telefono).into(EditarClienteAsesorUI.INPUT_TELEFONO),
                Enter.theValue(edad).into(EditarClienteAsesorUI.INPUT_EDAD),
                Enter.theValue(fechaNacimiento).into(EditarClienteAsesorUI.INPUT_FECHA_NACIMIENTO),
                Click.on(EditarClienteAsesorUI.BOTON_ACTUALIZAR)
        );
    }
}
