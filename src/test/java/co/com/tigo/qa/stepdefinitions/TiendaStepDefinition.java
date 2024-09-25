package co.com.tigo.qa.stepdefinitions;


import co.com.tigo.qa.questions.ElMensaje;
import co.com.tigo.qa.userinterfaces.TiendaUI;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.PropertiesLoader;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;


public class TiendaStepDefinition {
    Actor usuario = Actor.named("Metis");
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

    @Managed
    WebDriver hisBrowser;

    @Before
    public void setup() {
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }

    @When("^selecciono Tienda Online Tigo$")

    public void seleccionoTiendaOnlineTigo() {
        EsperaForzada.espera(10);
        usuario.attemptsTo(JavaScriptClick.on(TiendaUI.BOTONIR));

    }

    @Then("^deberia observar el mensaje (.*)$")
    public void deberiaObservarElMensaje(String mensaje) {
        EsperaForzada.espera(5);
        ArrayList<String> tabs = new ArrayList<String>(hisBrowser.getWindowHandles());
        hisBrowser.switchTo().window(tabs.get(1));
        EsperaForzada.espera(8);
        usuario.should(GivenWhenThen.seeThat(ElMensaje.tituloTienda(mensaje), Matchers.is(mensaje)));
    }

}
