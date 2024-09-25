package co.com.tigo.qa.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(glue = "co.com.tigo.qa.stepdefinitions",
        features ={
                "src/test/resources/features/01_Prepago/1.1_Compras/Pruebas.feature",




        },

        snippets = CAMELCASE,
        tags = "  @article",
        monochrome = true
)

public class PruebaAuto {
}
