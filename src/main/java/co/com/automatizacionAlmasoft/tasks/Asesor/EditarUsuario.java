package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.models.DatosActualizarUsuario;
import co.com.automatizacionAlmasoft.utils.DatosDinamicos;
import co.com.automatizacionAlmasoft.utils.GeneradorDatos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.UsuarioUI.*;

public class EditarUsuario implements Task {

    private final List<DatosActualizarUsuario> datos;

    public EditarUsuario(List<DatosActualizarUsuario> datos){
        this.datos = datos;
    }

    public static EditarUsuario conDatos(List<DatosActualizarUsuario> datos){
        return Instrumented.instanceOf(EditarUsuario.class)
                .withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor){

        DatosDinamicos.documento = GeneradorDatos.generarDocumento();

        actor.attemptsTo(

                Clear.field(EDIT_TELEFONO),

                Enter.theValue(datos.get(0).getTelefono())
                        .into(EDIT_TELEFONO),

                Clear.field(EDIT_DIRECCION),

                Enter.theValue(datos.get(0).getDireccion())
                        .into(EDIT_DIRECCION),

                Scroll.to(BTN_GUARDAR_EDICION),
                Click.on(BTN_GUARDAR_EDICION)

        );

    }
}
