package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EditarClienteAsesorUI extends PageObject {
    public static final Target TITULO_EDITAR = Target.the("Título editar cliente")
            .located(By.xpath("//h1[text()='Editar Cliente']"));
    public static final Target INPUT_DOCUMENTO = Target.the("Input documento del cliente")
            .located(By.name("documento"));
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Input primer nombre del cliente")
            .located(By.name("primer_nombre"));
    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Input segundo nombre del cliente")
            .located(By.name("segundo_nombre"));
    public static final Target INPUT_PRIMER_APELLIDO = Target.the("Input primer apellido del cliente")
            .located(By.name("primer_apellido"));
    public static final Target INPUT_SEGUNDO_APELLIDO = Target.the("Input segundo apellido del cliente")
            .located(By.name("segundo_apellido"));
    public static final Target INPUT_CORREO = Target.the("Input correo del cliente")
            .located(By.name("correo"));
    public static final Target INPUT_DIRECCION = Target.the("Input direccion del cliente")
            .located(By.name("direccion"));
    public static final Target INPUT_TELEFONO = Target.the("Input telefono del cliente")
            .located(By.name("telefono"));
    public static final Target INPUT_FECHA_NACIMIENTO = Target.the("Input fecha de nacimiento del cliente")
            .located(By.name("fecha_nacimiento"));
    public static final Target INPUT_EDAD = Target.the("Input edad del cliente")
            .located(By.name("edad"));
    public static final Target INPUT_CREDENCIAL = Target.the("Input credencial del cliente")
            .located(By.name("credencial"));
    public static final Target BOTON_ACTUALIZAR = Target.the("Botón actualizar cliente")
            .located(By.xpath("//button[@type='submit' and contains(text(),'Actualizar Cliente')]"));
    public static final Target ALERTA_ACTUALIZADO = Target.the("Alerta cliente actualizado")
            .located(By.xpath("//*[contains(text(),'Cliente actualizado correctamente')]"));
    public static final Target BOTON_CANCELAR = Target.the("Botón cancelar editar cliente")
            .located(By.xpath("//button[contains(text(),'Cancelar')]"));
}
