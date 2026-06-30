package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AgregarClienteAsesorUI extends PageObject {
    public static final Target TITULO_AGREGAR_CLIENTE = Target.the("Título Agregar Nuevo Cliente")
            .located(By.xpath("//h1[text()='Agregar Nuevo Cliente']"));
    public static final Target INPUT_DOCUMENTO = Target.the("Input documento")
            .located(By.name("documento"));
    public static final Target INPUT_PRIMER_NOMBRE = Target.the("Input primer nombre")
            .located(By.name("primer_nombre"));
    public static final Target INPUT_SEGUNDO_NOMBRE = Target.the("Input segundo nombre")
            .located(By.name("segundo_nombre"));
    public static final Target INPUT_PRIMER_APELLIDO = Target.the("Input primer apellido")
            .located(By.name("primer_apellido"));
    public static final Target INPUT_SEGUNDO_APELLIDO = Target.the("Input segundo apellido")
            .located(By.name("segundo_apellido"));
    public static final Target INPUT_CORREO = Target.the("Input correo")
            .located(By.name("correo"));
    public static final Target INPUT_TELEFONO = Target.the("Input teléfono")
            .located(By.name("telefono"));
    public static final Target INPUT_DIRECCION = Target.the("Input dirección")
            .located(By.name("direccion"));
    public static final Target INPUT_FECHA_NACIMIENTO = Target.the("Input fecha de nacimiento")
            .located(By.name("fecha_nacimiento"));
    public static final Target INPUT_EDAD = Target.the("Input edad")
            .located(By.name("edad"));
    public static final Target INPUT_CREDENCIAL = Target.the("Input credencial")
            .located(By.name("credencial"));
    public static final Target BTN_GUARDAR_CLIENTE = Target.the("Botón Guardar Cliente")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target ALERTA_CLIENTE_CREADO = Target.the("Alerta Cliente creado")
            .located(By.xpath("//*[contains(text(),'Cliente creado correctamente')]"));
}
