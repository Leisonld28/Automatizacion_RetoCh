package co.com.tigo.qa.stepdefinitions;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import co.com.tigo.qa.interactions.Espera;
import co.com.tigo.qa.tasks.Login;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

public class LoginStepDefinition {
    
    Actor usuario = Actor.named("Metis");
    
    @Managed
    WebDriver hisBrowser;
    
    @Before
    public void setup(){
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^estoy en la pagina principal$")
    public void estoyEnLaPaginaPrincipal() {
        usuario.attemptsTo(
                Espera.esperaSeg(8),
                Login.autenticar());


    }


}