package co.com.automatizacionAlmasoft.userinterfaces.Asesor;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PerfilAsesorUI extends PageObject {
    public static final Target TITULO_PERFIL = Target.the("Título mi perfil")
            .located(By.xpath("//h1[text()='Mi Perfil']"));
    public static final Target INPUT_PRIMER_NOMBRE_USUARIO = Target.the("Input primer nombre del usuario")
            .located(By.name("usuario_primer_nombre"));
    public static final Target INPUT_SEGUNDO_NOMBRE_USUARIO = Target.the("Input segundo nombre del usuario")
            .located(By.name("usuario_segundo_nombre"));
    public static final Target INPUT_PRIMER_APELLIDO_USUARIO = Target.the("Input primer apellido del usuario")
            .located(By.name("usuario_primer_apellido"));
    public static final Target INPUT_SEGUNDO_APELLIDO_USUARIO = Target.the("Input segundo apellido del usuario")
            .located(By.name("usuario_segundo_apellido"));
    public static final Target INPUT_DOCUMENTO_USUARIO = Target.the("Input documento del usuario")
            .located(By.name("usuario_documento"));
    public static final Target INPUT_CORREO_USUARIO = Target.the("Input correo del usuario")
            .located(By.name("usuario_correo"));
    public static final Target INPUT_DIRECCION_USUARIO = Target.the("Input direccion del usuario")
            .located(By.name("usuario_direccion"));
    public static final Target INPUT_CREDENCIAL_USUARIO = Target.the("Input credencial del usuario")
            .located(By.name("usuario_credencial"));
    public static final Target BOTON_ACTUALIZAR_INFORMACION = Target.the("Botón actualizar información del usuario")
            .located(By.xpath("//button[@type='submit' and contains(text(),'Actualizar Información')]"));
    public static final Target ALERTA_PERFIL_ACTUALIZADO = Target.the("Alerta perfil actualizado")
            .located(By.xpath("//*[contains(text(),'Perfil actualizado correctamente')]"));
    public static final Target BOTON_CAMBIAR_FOTO = Target.the("Botón cambiar foto de perfil")
            .located(By.xpath("//label[contains(text(),'Cambiar Foto')]"));
}
