package co.com.automatizacionAlmasoft.tasks.Asesor;

import co.com.automatizacionAlmasoft.models.DatosProducto;
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

import static co.com.automatizacionAlmasoft.userinterfaces.Asesor.CrearProductoUI.*;

public class CrearProducto implements Task {

    private List<DatosProducto> datosProducto;

    public CrearProducto(List<DatosProducto> datosProducto) {
        this.datosProducto = datosProducto;
    }

    public static CrearProducto conDatos(List<DatosProducto> datosProducto) {
        return Instrumented.instanceOf(CrearProducto.class)
                .withProperties(datosProducto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        DatosDinamicos.nombreProducto =
                GeneradorDatos.generarNombreProducto();

        DatosDinamicos.descripcionProducto =
                GeneradorDatos.generarDescripcionProducto();

        DatosDinamicos.precioProducto =
                GeneradorDatos.generarPrecio();

        actor.attemptsTo(

                Click.on(BTN_PRODUCTOS),

                Click.on(BTN_AGREGAR_PRODUCTO),

                Enter.theValue(DatosDinamicos.nombreProducto)
                        .into(INPUT_NOMBRE),

                Enter.theValue(DatosDinamicos.descripcionProducto)
                        .into(INPUT_DESCRIPCION),

                Enter.theValue(DatosDinamicos.precioProducto)
                        .into(INPUT_PRECIO),

                Enter.theValue(datosProducto.get(0).getStock())
                        .into(INPUT_STOCK),

                SelectFromOptions.byVisibleText(datosProducto.get(0).getEstado())
                        .from(SELECT_ESTADO),

                Enter.theValue(datosProducto.get(0).getRutaImagen())
                        .into(INPUT_IMAGEN),

                SelectFromOptions.byVisibleText(datosProducto.get(0).getCategoria())
                        .from(SELECT_CATEGORIA),

                SelectFromOptions.byVisibleText(datosProducto.get(0).getSubcategoria())
                        .from(SELECT_SUBCATEGORIA),

                Scroll.to(BTN_GUARDAR),
                Click.on(BTN_GUARDAR)
        );
    }
}

