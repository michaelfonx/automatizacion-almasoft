package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarAfiliadoAsesorUI extends PageObject {
    public static final Target TITULO_REGISTRAR_AFILIADO = Target.the("Título Registrar Nuevo Afiliado")
            .located(By.xpath("//h1[text()='Registrar Nuevo Afiliado']"));
    public static final Target SELECT_CLIENTE_TITULAR = Target.the("Select Cliente Titular")
            .located(By.name("cliente_id"));
    public static final Target INPUT_DOCUMENTO_AFILIADO = Target.the("Input Documento del afiliado")
            .located(By.name("documento"));
    public static final Target INPUT_PRIMER_NOMBRE_AFILIADO = Target.the("Input primer nombre del afiliado")
            .located(By.name("primer_nombre"));
    public static final Target INPUT_SEGUNDO_NOMBRE_AFILIADO = Target.the("Input segundo nombre del afiliado")
            .located(By.name("segundo_nombre"));
    public static final Target INPUT_PRIMER_APELLIDO_AFILIADO = Target.the("Input primer apellido del afiliado")
            .located(By.name("primer_apellido"));
    public static final Target INPUT_SEGUNDO_APELLIDO_AFILIADO = Target.the("Input segundo apellido del afiliado")
            .located(By.name("segundo_apellido"));
    public static final Target INPUT_TELEFONO_AFILIADO = Target.the("Input teléfono del afiliado")
            .located(By.name("telefono"));
    public static final Target INPUT_CORREO_AFILIADO = Target.the("Input correo del afiliado")
            .located(By.name("correo"));
    public static final Target BTN_REGISTRAR_VINCULAR = Target.the("Botón Registrar y Vincular")
            .located(By.xpath("//button[@type='submit']"));
    public static final Target ALERTA_AFILIADO_REGISTRADO = Target.the("Alerta afiliado registrado")
            .located(By.xpath("//*[contains(text(),'Afiliado registrado y vinculado correctamente')]"));
}
