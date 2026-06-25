package co.com.automatizacionAlmasoft.runners.Administrador;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/01_Administrador",
        glue = {"co.com.automatizacionAlmasoft.stepsdefinitions","co.com.automatizacionAlmasoft.utils.hooks"},
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)

public class AdminRunner {
}
