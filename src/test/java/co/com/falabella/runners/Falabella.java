package co.com.falabella.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/comprar_producto.feature"},
        glue = {"co.com.falabella.setup", "co.com.falabella.stepdefinitions"},
        snippets = SnippetType.CAMELCASE, tags = "")
public class Falabella {
}
