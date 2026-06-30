package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.userinterfaces.Asesor.AgregarClienteAsesorUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class CrearClienteAsesor implements Task {
    private final String documento;
    private final String primerNombre;
    private final String primerApellido;
    private final String correo;
    private final String telefono;
    private final String edad;
    private final String fechaNacimiento;
    private final String credencial;

    public CrearClienteAsesor(String documento, String primerNombre, String primerApellido, 
                              String correo, String telefono, String edad, String fechaNacimiento, String credencial) {
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.credencial = credencial;
    }

    public static CrearClienteAsesor conDatos(String documento, String primerNombre, String primerApellido, 
                                               String correo, String telefono, String edad, String fechaNacimiento, String credencial) {
        return new CrearClienteAsesor(documento, primerNombre, primerApellido, correo, telefono, edad, fechaNacimiento, credencial);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(documento).into(AgregarClienteAsesorUI.INPUT_DOCUMENTO),
                Enter.theValue(primerNombre).into(AgregarClienteAsesorUI.INPUT_PRIMER_NOMBRE),
                Enter.theValue(primerApellido).into(AgregarClienteAsesorUI.INPUT_PRIMER_APELLIDO),
                Enter.theValue(correo).into(AgregarClienteAsesorUI.INPUT_CORREO),
                Enter.theValue(telefono).into(AgregarClienteAsesorUI.INPUT_TELEFONO),
                Enter.theValue(edad).into(AgregarClienteAsesorUI.INPUT_EDAD),
                Enter.theValue(fechaNacimiento).into(AgregarClienteAsesorUI.INPUT_FECHA_NACIMIENTO),
                Enter.theValue(credencial).into(AgregarClienteAsesorUI.INPUT_CREDENCIAL),
                Click.on(AgregarClienteAsesorUI.BTN_GUARDAR_CLIENTE)
        );
    }
}
