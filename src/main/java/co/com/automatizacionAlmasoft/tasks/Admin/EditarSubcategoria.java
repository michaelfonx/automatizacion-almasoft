package co.com.automatizacionAlmasoft.tasks.Admin;

import co.com.automatizacionAlmasoft.models.DatosActualizarSubcategoria;
import co.com.automatizacionAlmasoft.utils.DatosDinamicos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.SubcategoriaUI.*;

public class EditarSubcategoria implements Task {

    private final List<DatosActualizarSubcategoria> datos;

    public EditarSubcategoria(List<DatosActualizarSubcategoria> datos) {
        this.datos = datos;
    }

    public static EditarSubcategoria conDatos(List<DatosActualizarSubcategoria> datos) {
        return Instrumented.instanceOf(EditarSubcategoria.class)
                .withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosDinamicos.nombreSubcategoria =
                datos.get(0).getNombre();

        actor.attemptsTo(

                Clear.field(INPUT_NOMBRE),

                Enter.theValue(DatosDinamicos.nombreSubcategoria)
                        .into(INPUT_NOMBRE),

                SelectFromOptions.byVisibleText(
                                datos.get(0).getCategoria())
                        .from(SELECT_CATEGORIA),

                Click.on(BTN_ACTUALIZAR)

        );
    }
}