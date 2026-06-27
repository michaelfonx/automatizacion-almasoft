package co.com.automatizacionAlmasoft.userinterfaces.Admin;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SubcategoriaUI {

    public static final Target BTN_SUBCATEGORIAS =
            Target.the("Botón Sub Categorias")
                    .located(By.xpath("//a[@href='/admin/SubCategoriaFront']"));

    public static final Target BTN_AGREGAR_SUBCATEGORIA =
            Target.the("Botón agregar subcategoría")
                    .located(By.xpath("//a[contains(text(),'Agregar Subcategoría')]"));

    public static final Target INPUT_NOMBRE =
            Target.the("Nombre subcategoría")
                    .located(By.name("nombre"));

    public static final Target SELECT_CATEGORIA =
            Target.the("Categoría")
                    .located(By.name("categoria_id"));

    public static final Target BTN_GUARDAR =
            Target.the("Guardar")
                    .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_SUBCATEGORIA =
            Target.the("Mensaje de subcategoría creada")
                    .located(By.xpath("//*[contains(text(),'Subcategoría creada correctamente')]"));


    public static final Target INPUT_BUSCAR =
            Target.the("Campo buscar subcategoría")
                    .located(By.xpath("//input[@placeholder='Buscar']"));

    public static final Target BTN_ACCIONES =
            Target.the("Botón acciones")
                    .located(By.xpath("//button[contains(.,'Acciones')]"));

    public static final Target BTN_EDITAR =
            Target.the("Botón editar subcategoría")
                    .located(By.xpath("//a[contains(@href,'/subcategorias/editar/')]"));

    public static final Target BTN_ACTUALIZAR =
            Target.the("Botón actualizar")
                    .located(By.xpath("//button[@type='submit']"));

    public static final Target MENSAJE_SUBCATEGORIA_ACTUALIZADA =
            Target.the("Mensaje subcategoría actualizada")
                    .located(By.xpath("//*[contains(text(),'Subcategoría actualizada')]"));
}