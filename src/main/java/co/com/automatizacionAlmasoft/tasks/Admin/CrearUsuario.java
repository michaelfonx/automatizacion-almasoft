package co.com.automatizacionAlmasoft.tasks.Admin;

import co.com.automatizacionAlmasoft.models.DatosUsuario;
import co.com.automatizacionAlmasoft.utils.DatosDinamicos;
import co.com.automatizacionAlmasoft.utils.GeneradorDatos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.ProductosUI.BTN_AGREGAR_PRODUCTO;
import static co.com.automatizacionAlmasoft.userinterfaces.Admin.UsuarioUI.*;
import static co.com.automatizacionAlmasoft.utils.DatosDinamicos.*;

public class CrearUsuario implements Task {

    private List<DatosUsuario> datosUsuario;

    public CrearUsuario(List<DatosUsuario> datosUsuario) {
        this.datosUsuario = datosUsuario;
    }

    public static CrearUsuario conDatos(List<DatosUsuario> datosUsuario) {
        return Instrumented.instanceOf(CrearUsuario.class)
                .withProperties(datosUsuario);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        documento =
                GeneradorDatos.generarDocumento();

        telefono =
                GeneradorDatos.generarTelefono();

        correo =
                GeneradorDatos.generarCorreo();

        actor.attemptsTo(

                Click.on(BTN_AGREGAR_USUARIO),

                SelectFromOptions.byVisibleText("Asesor")
                        .from(SELECT_ROL),

                Enter.theValue(documento)
                        .into(INPUT_DOCUMENTO),

                Enter.theValue(datosUsuario.get(0).getPrimerNombre())
                        .into(INPUT_PRIMER_NOMBRE),

                Enter.theValue(datosUsuario.get(0).getSegundoNombre())
                        .into(INPUT_SEGUNDO_NOMBRE),

                Enter.theValue(datosUsuario.get(0).getPrimerApellido())
                        .into(INPUT_PRIMER_APELLIDO),

                Enter.theValue(datosUsuario.get(0).getSegundoApellido())
                        .into(INPUT_SEGUNDO_APELLIDO),

                Enter.theValue(datosUsuario.get(0).getDireccion())
                        .into(INPUT_DIRECCION),

                Enter.theValue(telefono)
                        .into(INPUT_TELEFONO),

                Enter.theValue(correo)
                        .into(INPUT_CORREO),

                Enter.theValue(datosUsuario.get(0).getContrasena())
                        .into(INPUT_CONTRASENA),

                Scroll.to(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );
    }
}