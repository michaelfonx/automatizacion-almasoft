package co.com.automatizacionAlmasoft.runners.Administrador;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features//01_Administrador/08-CrearSubcategoria.feature",
        glue = {
                "co.com.automatizacionAlmasoft.stepsdefinitions.Administrador",
                "co.com.automatizacionAlmasoft.utils.hooks"
        },
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = SnippetType.CAMELCASE
)
public class SubcategoriaRunner {
}
