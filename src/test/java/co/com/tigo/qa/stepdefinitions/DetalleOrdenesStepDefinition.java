package co.com.tigo.qa.stepdefinitions;

import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import co.com.tigo.qa.questions.ElMensaje;
import co.com.tigo.qa.userinterfaces.LoginUI;
import co.com.tigo.qa.utils.EsperaForzada;
import co.com.tigo.qa.utils.PropertiesLoader;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.*;
import net.thucydides.core.annotations.Managed;

public class DetalleOrdenesStepDefinition {
    Actor usuario = Actor.named("Metis");
    static PropertiesLoader propertiesLoader = PropertiesLoader.getInstance();

    @Managed
    WebDriver hisBrowser;
    String currentURL;

    @Before
    public void setup() {
        setTheStage(OnlineCast.ofStandardActors());
        usuario.can(BrowseTheWeb.with(hisBrowser));
    }


    @Then("^el usuario puede ver el mensaje de confirmacion de la transaccion (.*)$")
    public void elUsuarioPuedeVerElMensajeDeConfirmacionDeLaTransaccion(String respuesta) {
        EsperaForzada.espera(20);
        Pattern pattern = Pattern.compile("uat", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(propertiesLoader.getProperty("webdriver.base.url"));
        boolean matchFound = matcher.find();
        if (matchFound) {
            usuario.should(GivenWhenThen.seeThat(ElMensaje.confirmacionPago(respuesta), Matchers.is(respuesta)));
        }
    }

    @Then("^llevará al formulario con el objeto (.*)$")
    public void llevaráAlFormularioConElObjeto(String tituloDetalle) {
        EsperaForzada.espera(20);
        usuario.should(GivenWhenThen.seeThat(ElMensaje.tituloDetalle(), Matchers.is(tituloDetalle)));

    }



    @When("^validacion de inicio de sesion$")
    public void validacionDeInicioDeSesion() {
        EsperaForzada.espera(10);
        Click.on(LoginUI.CAMPO_SWAGLABS);
    }


    @Then("^deberia ver el mensaje de confirmacion de la transaccion$")
    public void deberiaVerElMensajeDeConfirmacionDeLaTransaccion() {
        EsperaForzada.espera(20);

    }

}
