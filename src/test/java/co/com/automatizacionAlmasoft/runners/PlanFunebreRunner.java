package co.com.automatizacionAlmasoft.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/02_Cliente/03_PlanFunebre.feature",
        glue ={"co.com.automatizacionAlmasoft.stepsdefinitions","co.com.automatizacionAlmasoft.utils.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        snippets = SnippetType.CAMELCASE
)
public class PlanFunebreRunner {
}