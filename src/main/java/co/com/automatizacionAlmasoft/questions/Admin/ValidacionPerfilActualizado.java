package co.com.automatizacionAlmasoft.questions.Admin;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.automatizacionAlmasoft.userinterfaces.Admin.PerfilUI.MENSAJE_ACTUALIZACION_EXITOSA;

public class ValidacionPerfilActualizado implements Question<Boolean> {

    public static ValidacionPerfilActualizado validacionPerfil() {
        return new ValidacionPerfilActualizado();
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String texto = Text.of(MENSAJE_ACTUALIZACION_EXITOSA)
                .viewedBy(actor)
                .asString()
                .trim();

        return texto.contains("Perfil actualizado correctamente");
    }
}
