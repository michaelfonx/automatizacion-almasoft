package co.com.automatizacionAlmasoft.tasks.Admin;

import co.com.automatizacionAlmasoft.models.DatosSubcategoria;
import co.com.automatizacionAlmasoft.utils.DatosDinamicos;
import co.com.automatizacionAlmasoft.utils.GeneradorDatos;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.SubcategoriaUI.*;

public class CrearSubcategoria implements Task {

    private final List<DatosSubcategoria> datos;

    public CrearSubcategoria(List<DatosSubcategoria> datos) {
        this.datos = datos;
    }

    public static CrearSubcategoria conDatos(List<DatosSubcategoria> datos) {
        return Instrumented.instanceOf(CrearSubcategoria.class)
                .withProperties(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosDinamicos.nombreSubcategoria =
                GeneradorDatos.nombreSubcategoria();

        actor.attemptsTo(

                Click.on(BTN_AGREGAR_SUBCATEGORIA),

                Enter.theValue(DatosDinamicos.nombreSubcategoria)
                        .into(INPUT_NOMBRE),

                SelectFromOptions.byVisibleText(datos.get(0).getCategoria())
                        .from(SELECT_CATEGORIA),

                Click.on(BTN_GUARDAR)

        );
    }
}