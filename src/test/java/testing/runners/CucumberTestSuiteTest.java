package testing.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"},
 //       features = "src/test/resources/features/search/LoginPage.feature",
        features = "src/test/resources/features/search/ProductosYServicios.feature"
        ,glue = "testing/stepdefinitions"
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,tags = "@BusquedaDeProductosSinProducto"
)
public class CucumberTestSuiteTest {}



