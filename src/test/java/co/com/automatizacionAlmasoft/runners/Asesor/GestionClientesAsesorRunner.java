package co.com.automatizacionAlmasoft.runners.Asesor;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/03_Asesor/03-gestion-clientes.feature",
        glue = {
                "co.com.automatizacionAlmasoft.stepsdefinitions.Asesor",
                "co.com.automatizacionAlmasoft.utils.hooks"
        },
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = SnippetType.CAMELCASE
)
public class GestionClientesAsesorRunner {
}
