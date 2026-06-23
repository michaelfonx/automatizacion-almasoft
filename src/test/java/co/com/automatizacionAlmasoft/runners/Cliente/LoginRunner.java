package co.com.automatizacionAlmasoft.runners.Cliente;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/02_Cliente/02_IniciarSesion.feature",
        glue = {
                "co.com.automatizacionAlmasoft.stepsdefinitions.Cliente",
                "co.com.automatizacionAlmasoft.utils.hooks"
        },
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = SnippetType.CAMELCASE
)
public class LoginRunner {
}